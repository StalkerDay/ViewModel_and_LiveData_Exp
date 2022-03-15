package com.example.viewmodel_and_livedata_exp.ViewModels

import androidx.lifecycle.ViewModel

class MainVM(startingCount: Int) : ViewModel() {
    private var count: Int = startingCount

    fun getUpdatedCount(): Int {
        return ++count
    }

    fun getCurrentCount(): Int {
        return count
    }
}