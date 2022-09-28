package net.codejava;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
@Path("/ctofservice")
public class CtoFService {
    @GET
    @Produces("application/xml")
    public String convertCtoF() {
        Double fahrenheit;
        Double celsius = 36.8;
        fahrenheit = ((celsius * 9) / 5) + 32;
        String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
        return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
    }
    @Path("{c}/{d}")
    @GET
    @Produces("application/xml")
    public String convertCtoFfromInput(@PathParam("c") Double c, @PathParam("d") Double d) {
        Double fahrenheit;
        Double celsius = c;
        Double celsiusd = d;
        fahrenheit = ((celsius * 9) / 5) + 32;
        String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
        return "<ctofservice>" + "<celsiusd>" + celsiusd + "</celsiusd>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
    }
}
