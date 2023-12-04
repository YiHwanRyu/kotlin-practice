package com.android.hotelreservation

val chooseMenu = ChooseMenu()
val operation = Operation()
var menu = -1
fun main() {
    while(menu != 4) {
        chooseMenu.printQuestion()
        menu = chooseMenu.getAnswer()
        operation.operate(menu)
    }
}