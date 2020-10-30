package com.bram.coderswah.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.bram.coderswah.R
import com.bram.coderswah.Utilities.EXTRA_CHART
import com.bram.coderswah.adapters.CategoryRecyclerAdapter
import com.bram.coderswah.model.Chart
import com.bram.coderswah.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecyclerAdapter
    var chart = Chart("","","","")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecyclerAdapter(this,DataService.categories) {category ->
            val productIntent = Intent(this,ProductsActivity::class.java)
            chart.type = category.title
            productIntent.putExtra(EXTRA_CHART,chart)
            startActivity(productIntent)
        }
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)
    }
}