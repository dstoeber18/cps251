 package com.example.addnamesavedata1.ui.main

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var nameList = ""

    fun addName(name: String) {
        this.nameList += "\n" + name
    }

    fun getList(): String {
        return nameList
    }

}