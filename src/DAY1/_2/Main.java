package DAY1._2;

public class Main {
    public static void main(String[] args) {




        int[] arr={3,7,2,9,1};

        System.out.println(arrayutil.getmax(arr));

        System.out.println(arrayutil.average(arr));

        System.out.println(arrayutil.contains(arr,7));
        int[] newArr=arrayutil.reverse(arr);
        for (int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }

    }

}
