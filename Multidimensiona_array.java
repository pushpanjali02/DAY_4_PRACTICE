import java.util.Scanner;
public class Multidimensiona_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][][] arr1={{{101,102},{103,104}},{{105,106},{107,108}}};
        //System.out.println(arr1);
        for(int i=0;i<2;i++){
            for(int j=0;j<arr1.length;j++){
                for(int k=0;k<arr1.length;k++){
                    System.out.println("arr["+i+"]"+"["+i+"]"+"["+k+"]"+"="+arr1[i][j][k]);

                }
               
            }
        }

    }
}
