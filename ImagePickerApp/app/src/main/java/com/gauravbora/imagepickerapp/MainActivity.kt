package com.gauravbora.imagepickerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var image: ImageView

    private val contract=registerForActivityResult(ActivityResultContracts.GetContent()){
        image.setImageURI(it)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button=findViewById(R.id.changeButton)
        image=findViewById(R.id.image)

button.setOnClickListener{
    contract.launch("image/*")
}
    }
}