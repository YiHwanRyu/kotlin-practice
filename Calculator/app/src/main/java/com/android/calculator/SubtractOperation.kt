package com.android.calculator

class SubtractOperation() : AbstractOperation() {
    override fun operate(num1: Double, num2: Double): Double {
        return num1 - num2
    }
}