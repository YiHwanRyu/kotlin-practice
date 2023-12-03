package com.android.calculator

fun main() {
    while(true) {
        var num1 = readLine()!!.toDouble()
        var operator = readLine()!!
        var num2 = readLine()!!.toDouble()
        var calculator = Calculator(num1, num2, operator)
    }
}
