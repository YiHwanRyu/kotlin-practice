package com.android.hotelreservation

import java.time.LocalDate

data class Reservation(
    val id: Int,
    val name: String,
    val roomNumber: Int,
    val checkInDate: LocalDate,
    val checkOutDate: LocalDate,
    val moneyInput: Int,
    val moneyOutput: Int
)
