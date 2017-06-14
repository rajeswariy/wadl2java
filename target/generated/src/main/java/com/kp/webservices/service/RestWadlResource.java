/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.kp.webservices.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/rest/wadl")
public class RestWadlResource {

    @GET
    @Produces("application/xml")
    public Response generateWadl() {
        //TODO: implement
        return null;
    }

}