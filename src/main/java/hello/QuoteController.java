package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.lang.Math;

/**
 * Created by shack on 2017-05-04.
 */

@RestController
public class QuoteController {

    private static final Logger log = LoggerFactory.getLogger(QuoteController.class);

    @RequestMapping(value="/fwdreq", method = RequestMethod.GET)
    public ResponseEntity<Quote> get() {
        Quote q = runny(new RestTemplate());
        q.setExtra(Double.toString(Math.random()));

        if (q.getValue().getId() < 4) {
            Quote badone = new Quote();
            badone.setType("failure");
            badone.setValue(null);
            return new ResponseEntity<Quote>(badone, HttpStatus.NOT_FOUND);
            //throw new IllegalArgumentException();
        }
        log.info(q.toString());
        return new ResponseEntity<Quote>(q, HttpStatus.OK);
    }

    public Quote runny(RestTemplate restTemplate) {
        return restTemplate.getForObject(
                "http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
    }
        //log.info(quote.toString());
        // };
}


