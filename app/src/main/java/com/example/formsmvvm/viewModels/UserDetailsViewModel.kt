package com.example.formsmvvm.viewModels

import android.app.Application
import androidx.databinding.Observable
import androidx.lifecycle.AndroidViewModel
import com.example.formsmvvm.repository.RegisterRepository

class UserDetailsViewModel(private val repository: RegisterRepository, application: Application) :
    AndroidViewModel(application), Observable {
    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        TODO("Not yet implemented")
    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        TODO("Not yet implemented")
    }
}
