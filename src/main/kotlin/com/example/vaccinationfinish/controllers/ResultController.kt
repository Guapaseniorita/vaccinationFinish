package com.example.vaccinationfinish.controllers

import Input
import com.example.vaccinationfinish.models.OutputDb
import com.example.vaccinationfinish.repositories.OutputDbRepository
import com.example.vaccinationfinish.services.Output
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

class ResultController(output: Output?) {
    private val output: Output? = output
    private val repository: OutputDbRepository? = null


    @PostMapping("/index")
    fun publishResult(@RequestParam year: Int, @RequestParam month: Int, @RequestParam day: Int, model: Model): String? {
        val input = Input(year, month, day)
        val result: String? = output?.result(input)
        model.addAttribute("result", result)
        val db = OutputDb(result)
        repository?.save(db)
        return "/result"
    }
}