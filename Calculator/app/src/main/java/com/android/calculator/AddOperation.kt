package com.android.calculator

class AddOperation() : AbstractOperation() {
    override fun operate(num1: Double, num2: Double): Double {
        return num1 + num2
    }
}