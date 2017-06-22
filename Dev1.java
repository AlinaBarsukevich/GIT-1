public class Dev1 {
  public static void main (String[] args) {
    for (int i=0;i<=100; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("tutti-frutti");
      } else if (i % 5 == 0) {
        System.out.println("frutti");
      } else if (i % 3 == 0) {
        System.out.println("tutti");
      } else {
        System.out.println(i);
      }
    }
  }
}
