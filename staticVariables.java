public class staticVariables {
    static int variable=0;
    public String Concatenation(String s,String s2){
        variable++;
        return s+s2;
    }

    public static void main(String[] args) {
        staticVariables obj=new staticVariables();
        String s1=obj.Concatenation("pushpanjali","das");
        staticVariables obj2=new staticVariables();
        String s2=obj2.Concatenation("visual", "studio");
        staticVariables obj3=new staticVariables();
        String s3=obj3.Concatenation("intellij","net beans");
        System.out.println("Status of the static variable is: "+obj.variable);
        System.out.println("Status of the static variable is: "+obj2.variable);
        System.out.println("Status of the static variable is: "+obj3.variable);


    }
}
