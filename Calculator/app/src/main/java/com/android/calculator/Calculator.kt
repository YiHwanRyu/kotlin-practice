package com.android.calculator

class Calculator(private val operation: AbstractOperation) {
    fun calculate(num1:Double, num2:Double) : Double {
        return operation.operate(num1, num2)
    }

}
