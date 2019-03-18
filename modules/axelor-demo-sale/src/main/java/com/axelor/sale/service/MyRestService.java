package com.axelor.sale.service;

import java.lang.invoke.MethodHandles;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.axelor.rpc.Request;
import com.axelor.rpc.Response;
import com.axelor.web.service.RestService;
import com.google.inject.servlet.RequestScoped;

@RequestScoped
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/rest/{model}")
public class MyRestService extends RestService {

  private static final Logger logger =
      LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

  @Override
  @POST
  @Path("{id}/fetch")
  public Response fetch(@PathParam("id") long id, Request request) {
    Response response = super.fetch(id, request);
    logger.info("fetch: {}, {}, {}", id, request, response);
    return response;
  }
}
