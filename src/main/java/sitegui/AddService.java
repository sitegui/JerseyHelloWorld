package sitegui;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class AddService {
    @GET
    @Path("/hi")
    public String sayHi() {
        return "Hi";
    }
}
