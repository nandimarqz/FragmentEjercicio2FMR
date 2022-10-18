package com.fernandoMarquezRodriguez.fragmentejercicio2

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Place (val urlImg : String, val name : String, val lat : String , val lon : String):Parcelable {
}