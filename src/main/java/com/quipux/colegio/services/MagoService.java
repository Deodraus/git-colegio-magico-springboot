package com.quipux.colegio.services;

import com.quipux.colegio.manager.MagoManagerImpl;
import com.quipux.colegio.models.MagoEntity;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;

@Path("/magos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MagoService {

    @Autowired
    private MagoManagerImpl manager;

    @POST
    public Response crearMago(MagoEntity mago) {
        try {
            manager.registrarMago(mago);
            return Response.status(Response.Status.CREATED).entity(mago).build();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
    }
}
