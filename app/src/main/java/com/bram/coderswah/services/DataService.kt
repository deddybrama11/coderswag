package com.bram.coderswah.services

import com.bram.coderswah.model.Category
import com.bram.coderswah.model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie","$18", "hat1"),
        Product("Devslopes Hat Black","$20", "hat2"),
        Product("Devslopes Hat White","$18", "hat3"),
        Product("Devslopes Hat Snapback","$22", "hat4")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray","$28","hoodie1"),
        Product("Devslopes Hoodie Red","$21","hoodie2"),
        Product("Devslopes Gray Hoodie","$30","hoodie3"),
        Product("Devslopes Black Hoodie","$28","hoodie4")
    )
    val shirts = listOf(
        Product("Devslopes Shirt Black","$18","shirt1"),
        Product("Devslopes Badge Light Gray","$11","shirt2"),
        Product("Devslopes Logo Shirt Red","$10","shirt3"),
        Product("Devslopes Hustle","$15","shirt4"),
        Product("Kickflip Studios","$15","shirt5")
    )
    val digitalGood = listOf<Product>()

    fun getProducts(category: String) : List<Product>{
        when(category){
            "SHIRTS" -> return shirts
            "HATS" -> return hats
            "HOODIES" -> return hoodies
            else -> return digitalGood
        }
    }
}