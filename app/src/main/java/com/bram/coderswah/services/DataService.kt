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

    val products = listOf(
        Product("Devslopes Graphic Beanie","$18", "hat01"),
        Product("Devslopes Hat Black","$20", "hat02"),
        Product("Devslopes Hat White","$18", "hat03"),
        Product("Devslopes Hat Snapback","$22", "hat04")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray","$28","hoodie01"),
        Product("Devslopes Hoodie Red","$21","hoodie02"),
        Product("Devslopes Gray Hoodie","$30","hoodie03"),
        Product("Devslopes Black Hoodie","$28","hoodie04")
    )
    val shirts = listOf(
        Product("Devslopes Shirt Black","$18","shirt01"),
        Product("Devslopes Badge Light Gray","$11","shirt02"),
        Product("Devslopes Logo Shirt Red","$10","shirt03"),
        Product("Devslopes Hustle","$15","shirt04"),
        Product("Kickflip Studios","$15","shirt05")
    )
}