package br.com.senac;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/cliente")
public class ClienteResource {
    Cliente cliente = new Cliente();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Cliente get() {
        return cliente;
    }


    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public void post(Cliente c) {
        cliente.setId(c.getId());
        cliente.setNome(c.getNome());
        cliente.setEmail(c.getEmail());
        cliente.setTelefone(c.getTelefone());
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Cliente put(Cliente c) {
        cliente.setId(c.getId());
        cliente.setNome(c.getNome());
        cliente.setEmail(c.getEmail());
        cliente.setTelefone(c.getTelefone());
        return cliente;
    }


    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public void delete() {
        cliente.setId(null);
        cliente.setNome(null);
        cliente.setEmail(null);
        cliente.setTelefone(null);
    }

}