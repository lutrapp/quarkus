package acc.br;

import java.net.URI;
import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.logging.Logger;

import acc.br.model.Fruta;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Path("/frutas")
public class FrutasResource {

	private static final Logger LOG = Logger.getLogger(FrutasResource.class);
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Fruta> list() {
        return Fruta.listAll();
    }
    
    @POST
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response novaFruta(Fruta fruta) {
        PanacheEntityBase.persist(fruta);
        return Response.created(URI.create("/fruta/" + fruta.id)).build();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response frutaPorId(@PathParam("id")Long id) {
    	PanacheEntityBase frutaId = Fruta.findById(id);
    	return Response.ok(frutaId).build();
    }
    
    
    @DELETE
    @Transactional
    public Response apagaFruta(Long id) {
        boolean frutaApagada = Fruta.deleteById(id);
        return Response.ok(frutaApagada).build();
    }

}
