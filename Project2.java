import java.util.Scanner; //checked 5/5/2025 - 89/100
public class Project2 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();
 
    System.out.print("Enter your age: ");
    int age = scanner.nextInt();
    
    System.out.print("Enter your GWA last semester: ");
    double gwa = scanner.nextDouble();
    
    System.out.print("You are currently enrolled at BCP? (True/False): ");
    boolean isEnrolled = scanner.nextBoolean();
    
    System.out.println("\nYour name is " + name);  
    System.out.println("You are " + age + " years old");
    System.out.println("Your General Weighted Average is " + gwa + " for the last semester");
    
    if(isEnrolled){
    System.out.println("You are officially enrolled at BCP!");
    } else {
    System.out.println("You are NOT enrolled!"); }
    }  
}
