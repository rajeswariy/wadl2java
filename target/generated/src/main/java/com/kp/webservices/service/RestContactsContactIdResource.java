/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.kp.webservices.service;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/rest/contacts/{contactId}")
public class RestContactsContactIdResource {

    @GET
    @Produces("application/json")
    public Response getContact(@PathParam("contactId") String contactId, @QueryParam("block") @DefaultValue("false") Boolean block) {
        //TODO: implement
        return null;
    }

}