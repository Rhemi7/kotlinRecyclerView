package com.greenmily.task2recyclerview

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class NextActivity: AppCompatActivity() {
    private lateinit var item: ProductData
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        item = intent.getSerializableExtra("data") as ProductData

        Toast.makeText(this, item.toString(), Toast.LENGTH_SHORT).show()
    }
}