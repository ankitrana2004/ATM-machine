import java.util.Scanner;

public class SBI {

  private static double Balance = 10000.00;
  private static final int password = 1234;
  
  public static void check(){
    System.out.println("Your current balance: "+ Balance);
    
  }

  public static void deposit(Scanner sc){
    System.out.println("enter your amount:");
    double amount = sc.nextDouble();
    if (amount > 0) {
      Balance += amount;
      System.out.println("your amount is deposit successfully:" + amount);
      check();
    }
    else{
      System.out.println("invalid balance: " + amount);
    }
  }

  public static void withdraw(Scanner sc){
    System.out.println("enter your ammount: ");
    double amount = sc.nextDouble();
    if (amount > 0) {
      Balance -= amount;
      System.out.println("your amount is withdraw successfully: " + amount);
      check();
    }
    else{
      System.out.println("Invalid amount !");
    }

  }
  public static boolean VerifyPassword(Scanner sc){
    int pin = sc.nextInt();
    if (password == pin) {
      System.out.println("Pin verify successfully ");
      return true;
    }
    else{
      System.out.println("Invalid password");
    return false;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  
    if (!VerifyPassword(sc)) {
      sc.close();
      return ;
    }
    
    int choice;
    do {
      System.out.println("Welcome To SBI Dear Customer");
      System.out.println("press 1. for withdraw");
      System.out.println("press 2. for deposit");
      System.out.println("press 3. for Check Balance");
      System.out.println("press 4. for Exit");
      
      choice = sc.nextInt();
      switch (choice) {
        case 1:
          withdraw(sc);
          break;
        
        case 2:
          deposit(sc);
          break;
          
        case 3:
          check();
          break;
         
        case 4:
          System.out.println("Thank you for using SBI ATM");

        default:
          System.out.println("Invalid choice");
      }

    } while (choice != 4);
    sc.close();
  }
}
