import java.util.Scanner;
public class transpose {
    public static void main(String[] args) {
        int[][] arr1={{1,2},{3,4},{5,6}};
        int[][] t=new int[2][3];
        //int arr1[3][2]={{1,2,6},{6,3,4},{9,5,6}};
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                t[i][j]=arr1[j][i];
                
            }
        }
        System.out.println("Transpose matrix is: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.println(t[i][j]);
            }
            System.out.println(" ");
        }

        

    }
}
