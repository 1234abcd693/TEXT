package text3;

import java.util.Scanner;

public class 评委打分 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        double[] a=new double[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextDouble();
            if(a[i]<0||a[i]>100){
                System.out.println("输入错误");
                i--;
            }
        }
        double avg=average(a);
        System.out.println("评委打分的平均分为："+avg);
        double max=max(a);
        System.out.println("评委打分的最大分为："+max);
        double min=min(a);
        System.out.println("评委打分的最小分为："+min);

    }
    public static double max(double[] a) {
        double max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
    public static double min(double[] a) {
        double min=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
    }
    public static double sum(double[] a) {
        double sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
    public static double average(double[] a) {
        double sum=0;
        sum=sum(a)-min(a)-max(a);
        return sum/(a.length-2);
    }
}
