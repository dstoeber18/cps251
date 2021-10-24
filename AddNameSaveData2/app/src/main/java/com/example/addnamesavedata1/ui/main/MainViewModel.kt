 package com.example.addnamesavedata1.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData

class MainViewModel : ViewModel() {

    var nameInput: MutableLiveData<String> = MutableLiveData()
    var nameList: MutableLiveData<String> = MutableLiveData()

    fun addName() {
        if(nameInput.value != "") {
            nameList.value += nameInput.value + "\n"
        }
    }
}