package com.jegan.viewmodeldemo2

import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal: Int): ViewModel() {

    private var totalSum = 0

    init {
        totalSum = startingTotal
    }

    fun getTotal(): Int {
        return totalSum
    }

    fun setTotal(value: Int) {
        totalSum += value
    }
}