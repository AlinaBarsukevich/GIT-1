public class Dev2 {
  public static void main (String[] args) {
    for (int i=0;i<=100; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.print("tutti-frutti");
      } else if (i % 5 == 0) {
        System.out.print("frutti");
      } else if (i % 3 == 0) {
        System.out.print("tutti");
      } else {
        System.out.print(i);


      }
    }
  }
}
