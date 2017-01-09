package com.ngourley

/**
 * Created by Nathan on 1/8/2017.
 */

class Answer{

}

interface RequestHandler {
    fun process(value: Any, urlParams: Map<String, String>, shouldReturnHtml: Boolean) : Answer
}