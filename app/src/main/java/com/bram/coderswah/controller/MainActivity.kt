package com.bram.coderswah.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.bram.coderswah.R
import com.bram.coderswah.adapters.CategoryAdapter
import com.bram.coderswah.model.Category
import com.bram.coderswah.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this,DataService.categories)
        categoryListView.adapter = adapter
    }
}