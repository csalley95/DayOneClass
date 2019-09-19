import java.util.Scanner;
public class FirstDemo {
    public static void main(String[] args){
        var reader = new Scanner(System.in); //want to close most Scanners, Not System.in
        System.out.print("What is your name:");
        var name = reader.nextLine();
        System.out.println("Hello "+name);
    }
}
