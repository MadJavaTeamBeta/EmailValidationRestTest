package MadJavaBeta;
import com.sun.net.httpserver.HttpServer;
import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Created by Dave on 10/25/2015.
 * @author  Sullivan,Albee,Gundrum
 * @param
 */
// The Java class will be hosted at the URI path "/test"
@Path("/test")
public class EmailValidationBetaClient {

    // the path will have "/isEmailValid/{emailtest}"
    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    @Path("isEmailValid/{emailtest}")
//    public Boolean isEmailValid(@PathParam("emailtest") String email) {
    public String isEmailValid(@PathParam("emailtest") String email) {
        EmailValidationBeta newEmailTest = new EmailValidationBeta();
        Boolean testResult = newEmailTest.isEmailValid(email);
        String strResult = String.valueOf(testResult);
        return strResult;
    }

    // the path will have "/isEmailValid2/{emailtest}"
    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    @Path("isEmailValid2/{emailtest}")
//    public Boolean isEmailValid2(@PathParam("emailtest") String email) {
    public String isEmailValid2(@PathParam("emailtest") String email) {
        EmailValidationBeta newEmailTest = new EmailValidationBeta();
        Boolean testResult = newEmailTest.isEmailValid2(email);
        String strResult = String.valueOf(testResult);
        return strResult;
    }


// Next 2 methods, test the string return types of optional methods: isEmailValidstring and isEmailValid2string
// since Boolean might be hard to consume, give an option to consumer ... Dave testing suggestion...

// the path will have "/isEmailValidstring/{emailtest}"
// The Java method will process HTTP GET requests
@GET
// The Java method will produce content identified by the MIME Media type "text/plain"
@Produces("text/plain")
@Path("isEmailValidstring/{emailtest}")
public String isEmailValidstring(@PathParam("emailtest") String email) {
    EmailValidationBeta newEmailTest = new EmailValidationBeta();
    String testResult = newEmailTest.isEmailValidstring(email);
//        System.out.println(testResult);
    return testResult;
}

// the path will have "/isEmailValid2string/{emailtest}"
// The Java method will process HTTP GET requests
    @GET
// The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    @Path("isEmailValid2string/{emailtest}")
    public String isEmailValid2string(@PathParam("emailtest") String email) {
        EmailValidationBeta newEmailTest = new EmailValidationBeta();
        String testResult = newEmailTest.isEmailValid2string(email);
//        System.out.println(testResult);
        return testResult;
    }

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServerFactory.create("http://localhost:9998/");
        server.start();

        System.out.println("Server running");
        System.out.println("Visit: http://localhost:9998/test");
        System.out.println("Hit return to stop...");
        System.in.read();
        System.out.println("Stopping server");
        server.stop(0);
        System.out.println("Server stopped");
    }
}
