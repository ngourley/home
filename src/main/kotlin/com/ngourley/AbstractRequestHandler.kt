package com.ngourley

import spark.Route

/**
 * Created by Nathan on 1/8/2017.
 */

abstract class AbstractRequestHandler : RequestHandler, Route {
    protected abstract fun processImpl(value: Any, urlParams: Map<String, String>, shouldReturnHtml: Boolean): Answer

    override fun process(value: Any, urlParams: Map<String, String>, shouldReturnHtml: Boolean): Answer {
        return return processImpl(value, urlParams, shouldReturnHtml)
    }
}