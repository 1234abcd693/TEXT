package DAY1._2;

public class arrayutil {
    public static int getmax(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
     return max;
    }

    public static double average(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
             sum+=arr[i];
        }
        return (double)sum/arr.length;
    }

    public static boolean contains(int[] arr,int target){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
    public static int[] reverse(int[] arr){
        int[] newArr=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            newArr[arr.length-1-i]=arr[i];
        }
        return newArr;
    }

}
