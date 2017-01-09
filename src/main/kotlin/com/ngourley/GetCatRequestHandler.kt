package com.ngourley

import spark.Request
import spark.Response

/**
 * Created by Nathan on 1/8/2017.
 */

data class User(val id: Int, val name: String = "", val age: Int = 0)

class GetCatRequestHandler : AbstractRequestHandler() {
    override fun handle(req: Request, res: Response): Any {
        var user = User(id=req.params("id").toInt(), name="Nathan", age=30)
        return user
    }

    override fun processImpl(value: Any, urlParams: Map<String, String>, shouldReturnHtml: Boolean): Answer {
        return Answer()
    }

}