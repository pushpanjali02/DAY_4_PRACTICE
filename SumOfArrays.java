import java.util.Scanner;
public class SumOfArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int[][] arr1=new int[2][2];
        int[][] arr2=new int[2][2];
        array m=new array();
        
        System.out.println("Enter array1 elements: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter array2 elemets: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array1 elements are: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println("arr1"+"["+i+"]"+"["+j+"]"+"="+arr1[i][j]);
            }
        }
        System.out.println("Array2 elements are: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println("arr2"+"["+i+"]"+"["+j+"]"+"="+arr2[i][j]);
            }
        }
        int[][] sum=new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
                //System.out.println(sum[i][j]);
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                
                System.out.println(sum[i][j] + " ");
            }
            System.out.println();
        }
    }


        

}
