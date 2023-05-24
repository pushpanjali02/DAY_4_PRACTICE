import java.util.Scanner;
public class functions {
    int display(int a){
        System.out.println("Entered number is: "+a);
        return 0;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        functions v=new functions();
        v.display(num);
            
    }
}
