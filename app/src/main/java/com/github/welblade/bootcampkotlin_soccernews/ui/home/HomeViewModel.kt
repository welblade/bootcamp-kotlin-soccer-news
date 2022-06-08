package com.github.welblade.bootcampkotlin_soccernews.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.github.welblade.bootcampkotlin_soccernews.data.model.News

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<List<News>>().apply {
        value = listOf()
    }
    val text: LiveData<List<News>> = _text
}