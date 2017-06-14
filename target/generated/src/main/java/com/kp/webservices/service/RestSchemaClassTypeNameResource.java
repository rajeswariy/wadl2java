/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.kp.webservices.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/rest/schema/{classTypeName}")
public class RestSchemaClassTypeNameResource {

    @GET
    @Produces("application/xml")
    public Response generateSchema(@PathParam("classTypeName") String classTypeName) {
        //TODO: implement
        return null;
    }

}