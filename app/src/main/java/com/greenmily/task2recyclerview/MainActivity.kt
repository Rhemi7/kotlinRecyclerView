package com.greenmily.task2recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), ProductInteractionCallBack {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        with(task_recycler){
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = ProductActivityRecycler(setData(), this@MainActivity)
        }
    }


    private fun setData(): List<ProductData> {
        return listOf(
            ProductData("Apple", "#50",R.drawable.apples),
            ProductData("Banana", "#100",R.drawable.bananas),
            ProductData("Berry", "#50",R.drawable.berrys),
            ProductData("Lemon", "#50",R.drawable.lemons),
            ProductData("PawPaw", "#200",R.drawable.pawpaws),
            ProductData("Strawberry", "#150",R.drawable.strawberries),
            ProductData("Watermelon", "#200",R.drawable.watermelons)
        )
    }

    override fun onClick(item: ProductData) {
        Toast.makeText(this, item.toString(), Toast.LENGTH_SHORT).show()
        val intent = Intent(this, NextActivity::class.java).apply {
            putExtra("data", item)
        }
        startActivity(intent)
     //To change body of created functions use File | Settings | File Templates.
    }

}

