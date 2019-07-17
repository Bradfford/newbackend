package br.com.bradfford.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.bradfford.entity.Teste;

@Path("/service")
public class ServiceController {

		@GET
		@Produces(MediaType.APPLICATION_JSON)
		@Consumes(MediaType.APPLICATION_JSON)
		@Path("/teste")
		public Response testeRequest(@HeaderParam("headerValue") String headerValue, String value) {
			Teste teste = new Teste();
			teste.setId(1);
			teste.setName("Millfford");
			teste.setSurname("Bradshaw");
			return Response.status(200).entity(teste).build();
			// return "Erro";
		}
}
