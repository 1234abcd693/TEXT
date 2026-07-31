package text2;

import java.util.Scanner;

public class text2 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=getsum(a,b);
        System.out.println(c);
    }
    public static int getsum(int a,int b){
        return a+b;
    }
}
