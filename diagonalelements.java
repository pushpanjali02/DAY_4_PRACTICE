import java.util.Scanner;
public class diagonalelements {
    public static void main(String[] args) {
        int leftsum=0,rightsum=0,ri=0;
        Scanner sc=new Scanner(System.in);
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j){
                    // System.out.println("left elements are: "+arr[i][j]);
                    leftsum=leftsum+arr[i][j];

                }
                else if((i+j)==2){
                    if((i+j==2)&&(i==j)){
                        ri=arr[i][j];
                        System.out.println("ri is "+ri);

                    }
                    else{
                        rightsum=rightsum+arr[i][j];
                    }
                    
                }

            }
        }
        System.out.println("Leftsum is: "+leftsum);
        System.out.println("Rightsum is: "+(rightsum+ri));
            
    }

} 

