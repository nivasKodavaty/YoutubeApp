package com.example.weatherapp.viewmodels

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapp.data.Country
import com.example.weatherapp.repository.SupabaseRepository
import com.example.weatherapp.repository.SupabaseRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    val data = MutableStateFlow<List<Country>>(listOf())

    init {
        getData()
    }

    fun getData() {
        Log.d("viewmodel", "start")
        viewModelScope.launch {
            val result = SupabaseRepositoryImpl().channelList()
            Log.d("viewmodel", "getData: $result")
            data.value = result
        }
    }


}