package com.bram.coderswah.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bram.coderswah.R
import com.bram.coderswah.Utilities.EXTRA_CHART
import com.bram.coderswah.model.Chart
import kotlinx.android.synthetic.main.activity_detail_product.*

class DetailProductActivity : AppCompatActivity() {

    lateinit var chart : Chart

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_product)
        chart = intent.getParcelableExtra(EXTRA_CHART)!!
        println(chart.type+" 11")
        println(chart.price+" 11")
        println(chart.title+" 11")
        println(chart.image+" 11")

        txt_title.text = chart.title
        txt_price.text = chart.price
        txt_type.text = "Type : "+chart.type
        val resourceId = this.resources.getIdentifier(chart.image, "drawable", this.packageName)
        img_detailProduct?.setImageResource(resourceId)
    }
}