import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter no.of arrays");
        int no=sc.nextInt();
        System.out.println("Enter no.of rows");
        int row=sc.nextInt();
        System.out.println("Enter no.of columns");
        int columns=sc.nextInt();
        int[][][] arr=new int[no][row][columns];
        System.out.println("Enter elements of the 3d array");
        for(int i=0;i<no;i++){
            for(int j=0;j<row;j++){
                for(int k=0;k<columns;k++){
                    arr[i][j][k]=sc.nextInt();
                }
            }
        }
        System.out.println("Elements entered are: ");
        for(int i=0;i<no;i++){
            for(int j=0;j<row;j++){
                for(int k=0;k<columns;k++){
                    System.out.println("arr["+i+"]"+"["+i+"]"+"["+k+"]"+"="+arr[i][j][k]);
                }
            }
        }

    }
    
}
