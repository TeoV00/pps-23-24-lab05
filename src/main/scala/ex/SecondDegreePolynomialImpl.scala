package ex

case class SecondDegreePolynomialImpl(secondDegree: Double,
                                      firstDegree: Double,
                                      constant: Double) extends SecondDegreePolynomial:

  override def +(polynomial: SecondDegreePolynomial): SecondDegreePolynomial =
    SecondDegreePolynomialImpl(secondDegree + polynomial.secondDegree, firstDegree + polynomial.firstDegree, constant + polynomial.constant)

  override def -(polynomial: SecondDegreePolynomial): SecondDegreePolynomial =
    SecondDegreePolynomialImpl(secondDegree - polynomial.secondDegree, firstDegree - polynomial.firstDegree, constant - polynomial.constant)

