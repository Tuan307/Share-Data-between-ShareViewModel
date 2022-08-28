package com.example.share

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShareViewModel : ViewModel() {

    var text: MutableLiveData<String> = MutableLiveData()
    fun setInputText(q: String) {
        text.value = q
    }
}