package com.example.soptseminar29th.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter

object ImagebindingAdapter {
    @BindingAdapter("bind")
    @JvmStatic
    fun ImageView.setImageViewResource(resource: Int) {
        setImageResource(resource)
    }
}