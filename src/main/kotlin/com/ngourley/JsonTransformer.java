package com.ngourley;

import com.google.gson.Gson;
import spark.ResponseTransformer;

public class JsonTransformer implements ResponseTransformer {

    private Gson gson = new Gson();

//    @Override
    public String render(Object model) {
//        println(model)
        return gson.toJson(model);
    }


}