package com.example.formsmvvm.DAO

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.formsmvvm.models.RegisterEntity

@Dao
interface RegisterDataBaseDao {

    @Insert
    suspend fun insert(regiter: RegisterEntity)

    @Query("SELECT * FROM Register_users_table ORDER BY userId DESC")
    fun getAllUsers(): LiveData<List<RegisterEntity>>

    @Query("SELECT * FROM register_users_table WHERE user_name LIKE :userName")
    suspend fun getUserName(userName: String): RegisterEntity

}