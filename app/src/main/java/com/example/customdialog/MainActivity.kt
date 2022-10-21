package com.example.customdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dialog.dialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dialog=dialog("name","desc",resources.getDrawable(R.drawable.ic_info))
        dialog.createDialog(this)
    }
}