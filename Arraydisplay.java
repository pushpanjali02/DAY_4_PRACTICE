import java.util.Scanner;
public class Arraydisplay {
    public static int display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            
        }
        return 0;

    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] arr={1,2,3,4};
    //ArrayMultiplication m=new ArrayMultiplication();
    display(arr);
    

    }
}
