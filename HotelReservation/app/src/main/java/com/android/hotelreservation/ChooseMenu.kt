package com.android.hotelreservation

class ChooseMenu {
    fun printQuestion() {
        println("호텔예약 프로그램 입니다.")
        println("[메뉴]")
        println("1. 방예약, 2. 예약목록 출력, 3. 예약목록 (정렬) 출력, 4. 시스템 종료, 5. 금액 입금-출금 내역 목록 출력 6. 예약 변경/취소")
    }
    fun getAnswer() : Int{
        return readLine()!!.toInt()
    }
}