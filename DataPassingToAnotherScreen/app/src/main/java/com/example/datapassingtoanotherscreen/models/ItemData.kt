package com.example.datapassingtoanotherscreen.models

import android.os.Parcel
import android.os.Parcelable

class ItemData(
    var name:String,
    var email:String,
    var contact:String,
    var city:String
):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(email)
        parcel.writeString(contact)
        parcel.writeString(city)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ItemData> {
        override fun createFromParcel(parcel: Parcel): ItemData {
            return ItemData(parcel)
        }

        override fun newArray(size: Int): Array<ItemData?> {
            return arrayOfNulls(size)
        }
    }
}