package nonstattionary.math;

public class Program {

  public static void main(String[] args) {
    Complex z = new Complex();
    z.re = 1;
    z.im = 2;

    Complex c = new Complex();
    c.re = 3;
    c.im = 4;

    Complex w = Complex.add(z, c);
  }

}
