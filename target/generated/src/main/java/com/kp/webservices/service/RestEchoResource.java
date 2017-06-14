/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.kp.webservices.service;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/rest/echo")
public class RestEchoResource {

    @GET
    @Produces("text/plain")
    public Response echo(@QueryParam("msg") @DefaultValue("This is the default message") String msg) {
        //TODO: implement
        return null;
    }

}