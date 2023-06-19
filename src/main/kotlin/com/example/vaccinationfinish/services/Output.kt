package com.example.vaccinationfinish.services

import Input
import VaccineResultFactory
import org.springframework.stereotype.Service
import java.time.LocalDate
import java.time.Period

@Service
class Output {
    private val input: Input? = null
    fun result(input: Input): String? {
        val today = LocalDate.now()
        val birthday: LocalDate = LocalDate.of(input.year, input.month, input.day)
        val period = Period.between(birthday, today)
        val y = period.years
        val m = period.months
        val factory = VaccineResultFactory()
        return factory.createResult(y, m).getMessage()
    }
}