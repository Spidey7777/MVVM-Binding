package com.example.mvvmbinding

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    val score = MutableLiveData<Int>()

    init {
        Log.i("MainViewModel", "MainViewModel created")
        score.value = 0
    }

    fun onAdd(){
        score.value = (score.value)?.plus(1)
    }

    fun onSubtract(){
        score.value = (score.value)?.minus(1)
    }
}