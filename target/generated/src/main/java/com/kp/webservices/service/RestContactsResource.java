/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.kp.webservices.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/rest/contacts")
public class RestContactsResource {

    @GET
    @Produces("application/json")
    public Response getAllContacts() {
        //TODO: implement
        return null;
    }

}