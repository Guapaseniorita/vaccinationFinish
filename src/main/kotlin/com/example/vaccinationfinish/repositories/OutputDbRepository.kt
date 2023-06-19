package com.example.vaccinationfinish.repositories

import com.example.vaccinationfinish.models.OutputDb
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query

interface OutputDbRepository : MongoRepository<OutputDb, String> {
    @Query("{result:'?0'}")
    fun findItemByName(result: String?): OutputDb?
    override fun count(): Long
}