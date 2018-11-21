package nonstattionary.math;

public class TestCplx {

  public static void main(String[] args) {
    Cplx z;
    z = new Cplx();
    z.re = 1;
    z.im = 2;

    Cplx c = new Cplx();
    c.re = 3;
    c.im = 4;

    Cplx s = Cplx.add(z, c);

  }

}
