package com.example.contentprovidersexample.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.contentprovidersexample.ImageSource

class ImageViewModel : ViewModel(){

    var images by mutableStateOf(emptyList<ImageSource>())
        private set

    fun updateImages(images: List<ImageSource>){
        this.images = images
    }
}