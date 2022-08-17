package com.example.mylibrary

import android.content.Context
import android.widget.Toast

class TestClass {

    companion object {

        fun showMsg(context: Context, msg: String) {
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
        }

    }
}