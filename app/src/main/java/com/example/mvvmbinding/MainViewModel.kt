package com.example.mvvmbinding

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private val _score = MutableLiveData<Int>()
    val score: LiveData<Int>
    get() = _score

    init {
        Log.i("MainViewModel", "MainViewModel created")
        _score.value = 0
    }

    fun onAdd(){
        _score.value = (score.value)?.plus(1)
    }

    fun onSubtract(){
        _score.value = (score.value)?.minus(1)
    }
}