package com.android.hotelreservation

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Random

class Operation {
    val reservationList: MutableList<Reservation> = mutableListOf()

    fun operate(menu: Int) {
        when(menu) {
            1 -> reserve()
            2 -> showList()
            3 -> showListByCheckInDate()
            4 -> exitProgram()
            5 -> showMoneyFlowList()
            6 -> changeOrCancelReservation()
        }
    }
    private fun reserve() {

        val id: Int = reservationList.size + 1
        val name: String
        var roomNumber: Int
        var checkInDate: LocalDate
        var checkOutDate: LocalDate
        var moneyInput: Int
        var moneyOutput: Int

        // 성함
        println("예약자분의 성함을 입력해주세요")
        name = readLine()!!

        // 랜덤 돈 생성
        var money: Int = Random().nextInt(40001) + 10000

        // 방번호
        do {
            println("예약할 방번호를 입력해주세요")
            roomNumber= readLine()!!.toInt()
            if(roomNumber in 100..999) break
            else println("올바르지 않은 방번호 입니다. 방번호는 100-999 영역 이내입니다.")
        } while(true)

        // 체크인날짜
        do {
            println("체크인 날짜를 입력해주세요 표기형식. 20230631")
            val checkInDateString = readLine()!!
            val formatter = DateTimeFormatter.ofPattern("yyyyMMdd")
            checkInDate = LocalDate.parse(checkInDateString, formatter)
            val today = LocalDate.now()

            // 조건 만족 시 반복문 break
            if(checkInDate >= today) break
            else println("체크인은 지난날은 선택할 수 없습니다.")
        } while(true)

        // 체크아웃날짜
        do {
            println("체크아웃 날짜를 입력해주세요 표기형식. 20230631")
            val checkOutDateString = readLine()!!
            val formatter = DateTimeFormatter.ofPattern("yyyyMMdd")
            checkOutDate = LocalDate.parse(checkOutDateString, formatter)

            // 조건 만족 시 반복문 break
            if(checkOutDate > checkInDate) break
            else println("체크인 날짜보다 이전이거나 같을 수는 없습니다.")
        } while(true)

        // 선택한 방의 체크인과 체크아웃 날짜 사이에 예약이 있다면 다시 날짜들을 선택하도록 해야함.
        // 객체 리스트의 요소 확인
        val roomNumbers = reservationList.map {it.roomNumber}
        if(roomNumbers.contains(roomNumber)) {
            println()
        }

    }
    private fun showList() {
        TODO("Not yet implemented")
    }

    private fun showListByCheckInDate() {
        TODO("Not yet implemented")
    }

    private fun exitProgram() {
        println("시스템 종료.")
    }

    private fun showMoneyFlowList() {
        TODO("Not yet implemented")
    }

    private fun changeOrCancelReservation() {
        TODO("Not yet implemented")
    }

}