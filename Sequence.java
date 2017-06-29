import java.util.Scanner;

public class Sequence {
  public static void main(String[] args) {
    System.out.println("Enter the numbers through a space: ");
    Scanner in = new Scanner(System.in);
    String seq = in.nextLine();
    String seqParts[] = seq.split(" ");
    int length = seqParts.length;
    try {
      for (int i = 0; i < length - 1; i++) {
        if (Integer.parseInt(seqParts[i + 1]) > Integer.parseInt(seqParts[i])) {
          System.out.println("The numbers aren't decreasing");
          return;
        }
      } 
    } catch (NumberFormatException ex) {
      System.out.println("It's not available format.");
      return;
    }
    System.out.println("The numbers are decreasing");
  }
}
