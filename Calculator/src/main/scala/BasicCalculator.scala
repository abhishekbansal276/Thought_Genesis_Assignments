class BasicCalculator {
   def calculate(value_1: Double, value_2: Double, calculation_sign: Char) : Double = {
    calculation_sign match {
      case '+' => value_1+value_2
      case '-' => value_1-value_2
      case '*' => value_1*value_2
      case '/' => value_1/value_2
      case '%' => value_1%value_2
    }
  }
}