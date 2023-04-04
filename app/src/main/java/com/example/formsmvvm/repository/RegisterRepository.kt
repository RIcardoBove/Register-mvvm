package com.example.formsmvvm.repository

import com.example.formsmvvm.DAO.RegisterDataBaseDao
import com.example.formsmvvm.models.RegisterEntity

class RegisterRepository(private val dao: RegisterDataBaseDao) {

    val users = dao.getAllUsers()

    suspend fun insert(user: RegisterEntity) {
        return dao.insert(user)
    }

    suspend fun getUserName(userName: String): RegisterEntity {
        return dao.getUserName(userName)
    }
}