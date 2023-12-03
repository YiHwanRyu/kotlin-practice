package com.android.calculator

class SetCalculation {
    fun setNumber(): Double {
        return readLine()!!.toDouble()
    }

    fun setOperator() : AbstractOperation {
        var operator = readLine()!!

        return when(operator) {
            "+" -> AddOperation()
            "-" -> SubstractOperation()
            "*" -> MultiplyOperation()
            "/" -> DivideOperation()
            else -> throw ArithmeticException("잘못된 연산자를 입력했습니다.")
        }
    }

}