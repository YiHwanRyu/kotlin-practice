package com.android.calculator

class SubstractOperation() : AbstractOperation() {
    override fun operate(num1: Double, num2: Double): Double {
        return num1 - num2
    }
}