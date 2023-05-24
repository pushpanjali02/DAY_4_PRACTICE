import java.util.Scanner;

public class PI {
    public final float PI= (float) 3.14;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PI obj=new PI();
        //float v=obj.PI;
        System.out.println(obj.PI);
        System.out.println("Enter radius of the circle");
        int r=sc.nextInt();
        System.out.println("Area of the circle is: "+(obj.PI*r*r));
    }
}
