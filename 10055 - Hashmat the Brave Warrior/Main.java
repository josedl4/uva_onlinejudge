import java.util.Scanner;

/*
 * Ejercicio 10055 del UVa Online Judge.
 *
 */

class Main {

  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNextLong()) {
      long a = in.nextLong();
      long b = in.nextLong();
      System.out.println((Math.abs(a - b)));
    }
  }
}
