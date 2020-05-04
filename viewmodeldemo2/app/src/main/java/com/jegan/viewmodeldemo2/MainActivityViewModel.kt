package com.jegan.viewmodeldemo2

import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {

    private var totalSum = 0

    fun getTotal(): Int {
        return totalSum
    }

    fun setTotal(value: Int) {
        totalSum += value
    }
}