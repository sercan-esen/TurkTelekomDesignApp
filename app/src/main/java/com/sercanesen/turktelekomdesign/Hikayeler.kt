package com.sercanesen.turktelekomdesign

import java.io.Serializable

data class Hikayeler(var hikayeId: Int,
                     var hikayeResimAdi: String,
                     var hikayeAdi: String) : Serializable {
}