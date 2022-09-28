package net.codejava;

import java.util.Date;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
 
@Path("/hello")
public class HelloResource {
 
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String direBonjour() {
        return "Hello World";
    }
    
    @GET
    @Path("/html")
    @Produces(MediaType.TEXT_HTML)
    public Response sayHTMLHello() {
    	//return "<html><title>Hello</title><body><h1>Bonjour, tout le monde!</h1><body></html>";
    	String output = "<html><title>Hello</title><body><h1>Hello World!</h1><h1>Bonjour, tout le monde!</h1>"
    			+ "<p>RESTful Service is running ...</p><br>Ping @ " + new Date().toString() + "</body></html>";
        return Response.status(200).entity(output).build();
    }
    
    @GET
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    public String sayJsonHello() {
        return "{\"name\":\"greeting\", \"message\":\"Bonjour tout le monde!\"}";
    }
}
