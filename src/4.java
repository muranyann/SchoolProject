 import java.util.Scanner;
public class SchoolProject {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = sc.nextLine();
    System.out.println("Hello, " + name + ". What is your favorite subject in school?");
  }
}