package com.example.viewmodel_and_livedata_exp.ViewModels

import androidx.lifecycle.ViewModel

class MainVM : ViewModel() {
    private var count: Int = 0

    fun getUpdatedCount(): Int {
        return ++count
    }

    fun getCurrentCount(): Int {
        return count
    }
}