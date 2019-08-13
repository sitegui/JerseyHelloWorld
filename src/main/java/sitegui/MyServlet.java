package sitegui;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class MyServlet extends ResourceConfig {
    public MyServlet() {
        packages("sitegui");
    }
}
