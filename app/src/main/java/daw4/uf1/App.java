package daw4.uf1;

import java.net.URI;

/* 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
*/

import org.eclipse.jetty.server.Server;
import org.glassfish.jersey.jetty.JettyHttpContainerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        final ResourceConfig config = new ResourceConfig().packages("daw4.uf1");
        final Server server = JettyHttpContainerFactory.createServer(
                URI.create("http://localhost:8080/"), config);
        try {
            server.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
 * @Path("/CurrencyService")
 * class CurrencyResource {
 * 
 * @GET
 * 
 * @Path("/hello")
 * 
 * @Produces(MediaType.TEXT_PLAIN)
 * public String helloWorld() {
 * return "Hello!";
 * }
 * }
 */