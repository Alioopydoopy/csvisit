import java.util.Scanner;
public class yay{
    public void greet(){
        System.out.println("Helllo world! you stinkgood!!!!");
    }
    public static void main (String[] args){
yay guy= new yay();
yay.greet();
Scanner scanner= new Scanner(System.in);
System.out.println("enter your name");
String name= scanner.nextLine();
System.out.println("HI " + name);
    }


}