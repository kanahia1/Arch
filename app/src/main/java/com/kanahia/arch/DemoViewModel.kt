package com.kanahia.arch

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class DemoViewModel : ViewModel() {

    val data = MutableLiveData<String>()

    fun changeData(){
        data.value = "Hello"
    }
}