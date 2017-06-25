import java.util.*;
public class Fibonacci {
  public static void main(String[] args) {
    long numberFib = 0;
    int n;
    double phi = (1 + Math.sqrt(5)) / 2;
    //phi is Golden ratio	
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter number : ");
    int enteredNumber = reader.nextInt();
    if (enteredNumber < 0) {
        System.out.println("This is negative number");
        System.exit(0);
      } else {     
        for (n = 0; enteredNumber > numberFib; n++) {
        numberFib = Math.round(Math.pow(phi, n) / Math.sqrt(5));
	  if (enteredNumber == numberFib) {
	    System.out.println("Entered number is one of the Fibonacci's numbers");
          } else {
	    System.out.println("Entered number isn't one of the Fibonacci's numbers");
          }
        }
      }
    }
