package com.example.coroutine.kotlin_singleton_example

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.coroutine.kotlin_singleton_example.model.User
import com.example.coroutine.kotlin_singleton_example.repository.Repository

class MainViewModel: ViewModel() {
    private val _userId: MutableLiveData<String> = MutableLiveData()

    val user: LiveData<User> = Transformations
        .switchMap(_userId){
        Repository.getUser(it)
    }

    fun setUserId(userId:String){
        val update = userId
        if (_userId.value== update){
            return
        }
        _userId.value = update
    }

    fun cancelJobs(){
        Repository.cancelJobs()
    }
}