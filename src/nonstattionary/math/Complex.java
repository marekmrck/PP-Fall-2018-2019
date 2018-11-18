package nonstattionary.math;

class Complex {

  double re;

  double im;

  static Complex add(Complex c1, Complex c2) {
    Complex result = new Complex();
    result.re = c1.re + c2.re;
    result.im = c1.im + c2.im;
    return result;
  }

}
