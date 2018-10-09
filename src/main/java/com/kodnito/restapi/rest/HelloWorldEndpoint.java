package com.kodnito.restapi.rest;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 * @author hayricicek <hayri@kodnito.com>
 */
@Path("hello")
@RequestScoped
public class HelloWorldEndpoint {

    @GET
    public Response helloMicroProfile() {
        return Response.ok("Hello From MicroProfile").build();
    }
}