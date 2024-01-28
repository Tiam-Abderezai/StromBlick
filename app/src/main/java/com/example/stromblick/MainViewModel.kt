package com.example.stromblick

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.stromblick.network.NetworkApiImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val networkApiImpl: NetworkApiImpl,
) : ViewModel() {
    init {
        viewModelScope.launch {
            val data = networkApiImpl.getPowerGenerationUnit(filter = "In%20Betrieb~eq~35", page = 35, pageSize = 1).data
            Log.d("TAG", "SHOW NETWORK DATA: $data")
        }
    }
}
