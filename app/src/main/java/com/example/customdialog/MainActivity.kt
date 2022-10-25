package com.example.customdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dialog.CustomDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val CustomDialog=CustomDialog("name","desc",resources.getDrawable(R.drawable.ic_info))
        CustomDialog.createDialog(this)


    }
}