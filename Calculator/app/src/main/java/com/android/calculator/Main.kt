package com.android.calculator
// 사용할 클래스
val setCalculation = SetCalculation()

fun main() {
    //반복 계산 수행(독립 계산)
    while(true) {

        var num1 = setCalculation.setNumber()

        var calculator = Calculator(setCalculation.setOperator())

        var num2 = setCalculation.setNumber()

        // 계산 결과 출력
        println(calculator.calculate(num1, num2))
    }
}




