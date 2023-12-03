package com.android.calculator

class DivideOperation() : AbstractOperation() {
    @Throws(ArithmeticException::class)
    override fun operate(num1: Double, num2: Double): Double {
        require(num2 != 0.0) {
            ArithmeticException("0이 아닌 수로 나누세요.")
        }
        return num1 / num2
    }
}