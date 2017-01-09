package com.ngourley

import spark.Spark.*
import org.slf4j.LoggerFactory



object HelloWorld {
    @JvmStatic fun main(args: Array<String>) {
        var log = LoggerFactory.getLogger(HelloWorld.javaClass)

        val portNumber = 9000
        var namespace = "/namespace/dev"

        port(portNumber)
        log.info("Spark started on $portNumber using namespace '$namespace'")

        // resource options
        get("$namespace/cat") { req, res -> "list of cats" }
        post("$namespace/cat") {req, res -> "create a cat"}

        // instance specific operations
        get("$namespace/cat/:id", GetCatRequestHandler(), GsonTransformer())
        put("$namespace/cat/:id") {req, res -> "update a cat"}
        delete("$namespace/cat/:id") { req, res -> "delete a cat :-("}

        after(spark.Filter { request, response ->
            println(response.body())
            response.header("Content-Type", "application/json")
        })
    }
}