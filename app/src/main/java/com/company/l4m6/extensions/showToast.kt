package com.company.l4m6.extensions

import android.content.Context
import android.widget.Toast

fun Context.showToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun Context.showToastAdapter(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}