package com.ngourley

import com.google.gson.Gson
import spark.ResponseTransformer

class GsonTransformer : ResponseTransformer {

    private val gson = Gson()

    override fun render(model: Any): String {
        return gson.toJson(model)
    }

}