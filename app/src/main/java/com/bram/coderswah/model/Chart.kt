package com.bram.coderswah.model

import android.os.Parcel
import android.os.Parcelable

class Chart(var type: String?, var title: String?, var price: String?, var image: String?) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(type)
        parcel.writeString(title)
        parcel.writeString(price)
        parcel.writeString(image)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Chart> {
        override fun createFromParcel(parcel: Parcel): Chart {
            return Chart(parcel)
        }

        override fun newArray(size: Int): Array<Chart?> {
            return arrayOfNulls(size)
        }
    }

}