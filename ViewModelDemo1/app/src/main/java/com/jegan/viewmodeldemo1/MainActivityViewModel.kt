package com.jegan.viewmodeldemo1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private var count = MutableLiveData<Int>()

    val countData: LiveData<Int>
    get() = count

    init {
        count.value = 0
    }

    fun setUpdatedCount() {
        count.value = count.value?.plus(1)
    }
}