import org.scalatest.funsuite.AnyFunSuite
class CalculatorTestClass extends AnyFunSuite{
  val calculation_object = new BasicCalculator()

  test("All Operations ------ Right Test Case") {
    assert(calculation_object.calculate(10, 5, '+') == 15.0)
    assert(calculation_object.calculate(10, 5, '-') == 5.0)
    assert(calculation_object.calculate(10, 5, '*') == 50.0)
    assert(calculation_object.calculate(10, 5, '/') == 2.0)
    assert(calculation_object.calculate(10, 5, '%') == 0.0)
  }

  test("All Operations ------ Wrong Test Case") {
    assert(calculation_object.calculate(10, 5, '+') == 5.0)
    assert(calculation_object.calculate(10, 5, '-') == 15.0)
    assert(calculation_object.calculate(10, 5, '*') == 0.0)
    assert(calculation_object.calculate(10, 5, '/') == 0.0)
    assert(calculation_object.calculate(10, 5, '%') == 2.0)
  }
}
