package com.android.calculator

class Calculator {
    var operator: String = ""
    var num1: Double = 0.0
    var num2: Double = 0.0
    constructor(_num1:Double, _num2:Double, _operator:String) {
        num1 = _num1
        num2 = _num2
        operator = _operator
        when(operator) {
            "+" -> println(num1 + num2)
            "-" -> println(num1 - num2)
            "*" -> println(num1 * num2)
            "/" -> println(num1 / num2)
            "%" -> println(num1 % num2)
            else -> println("잘못된 연산자 입력입니다.")
        }
    }

}
