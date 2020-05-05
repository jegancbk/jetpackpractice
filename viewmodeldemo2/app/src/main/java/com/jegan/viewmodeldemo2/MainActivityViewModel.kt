package com.jegan.viewmodeldemo2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal: Int): ViewModel() {

    private var totalSum = MutableLiveData<Int>()

    val totalData: LiveData<Int>
    get() = totalSum

    init {
        totalSum.value = startingTotal
    }


    fun setTotal(value: Int) {
        totalSum.value = totalSum.value ?.plus(value)
    }
}