package com.example.formsmvvm.viewModels

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.formsmvvm.repository.RegisterRepository

class RegisterViewModelFactory(
    private val repository: RegisterRepository,
    private val application: Application
): ViewModelProvider.Factory {

    @Suppress("Uncheked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(RegisterViewModel::class.java)) {
            return LoginViewModel(repository, application) as T
        }

        throw java.lang.IllegalArgumentException("Unknown View Model Class")
    }
}