import java.util.Scanner;
public class ArrayMultiplication {
    public int elements(int[][] array,int r,int c){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                array[i][j]=sc.nextInt();
            }
        }
        return 0;
    }
    public int display(int[][] array,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println("arrar"+"["+i+"]"+"["+j+"]"+"="+array[i][j]);
            }
        }
        return 0;
    }
    public int product(int[][] array1,int r1,int c1,int[][] array2,int r2,int c2){
        int[][] c=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<3;k++)      
                {      
                    c[i][j]+=array1[i][k]*array2[k][j];      
                }
                System.out.println(c[i][j]);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of rows in 1st array");
        int r1=sc.nextInt();
        System.out.println("Enter no.of columns in 1st array");
        int c1=sc.nextInt();
        System.out.println("Enter no.of rows in 2nd array");
        int r2=sc.nextInt();
        System.out.println("Enter no.of columns in 2nd array");
        int c2=sc.nextInt();
        if(c1==r2){
            ArrayMultiplication m= new ArrayMultiplication();
            int[][] arr1=new int[r1][c1];
            int[][] arr2=new int[r2][c2];
            //ArrayMultiplication m= new ArrayMultiplication();
            System.out.println("Enter array1 elements:");
            m.elements(arr1,r1,c1);
            System.out.println("Enter elements of arra2:");
            m.elements(arr2,r2,c2);
            System.out.println("Elements of array1 are:");
            m.display(arr1,r1,c1);
            System.out.println("Elements of array2 are:");
            m.display(arr2,r2,c2);
            System.out.println("Product of 2 arrays is: ");
            m.product(arr1,r1,c1,arr2,r2,c2);
        }
        else{
            System.out.println("Multiplication is not possible");
        }

    }
    
}
