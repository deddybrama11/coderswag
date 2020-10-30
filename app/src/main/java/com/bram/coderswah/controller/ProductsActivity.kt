package com.bram.coderswah.controller

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.bram.coderswah.R
import com.bram.coderswah.Utilities.EXTRA_CATEGORY
import com.bram.coderswah.Utilities.EXTRA_CHART
import com.bram.coderswah.adapters.ProductsAdapter
import com.bram.coderswah.model.Chart
import com.bram.coderswah.services.DataService
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter : ProductsAdapter
    lateinit var chart : Chart

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        chart = intent.getParcelableExtra(EXTRA_CHART)!!
        adapter = ProductsAdapter(this, DataService.getProducts(chart.type!!)) { product ->
            val detailIntent = Intent(this, DetailProductActivity::class.java)
            chart.title = product.title
            chart.price = product.price
            chart.image = product.image
            detailIntent.putExtra(EXTRA_CHART, chart)

            startActivity(detailIntent)
        }

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if(orientation== Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp
        if(screenSize> 720){
            spanCount = 3
        }

        val layoutManager = GridLayoutManager(this,spanCount)
        productsListView.layoutManager = layoutManager
        productsListView.adapter = adapter
    }
}