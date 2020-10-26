package com.bram.coderswah.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bram.coderswah.R
import com.bram.coderswah.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType+" blbl")
    }
}