package hello;

import jsonout.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
       /* RestTemplate restTemplate = new RestTemplate();
        Quote q  = restTemplate.getForObject(
                "http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        log.info(q.toString()); */
    }

  /*  @RequestMapping(value="/fwdreq", method = RequestMethod.POST)
    public ResponseEntity<Quote> update() {

         return new ResponseEntity<Quote>(runny(new RestTemplate()), HttpStatus.OK);
    }

    public Quote runny(RestTemplate restTemplate) {
            return restTemplate.getForObject(
                    "http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
            //log.info(quote.toString());
       // };
    } */
}