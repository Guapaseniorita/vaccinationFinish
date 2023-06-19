package com.example.vaccinationfinish.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class OutputDb(result: String?) {
    @Id
    val id: String = ""
    val result: String? = result
}