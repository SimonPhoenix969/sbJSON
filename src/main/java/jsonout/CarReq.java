package jsonout;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.Iterator;
import java.util.List;


@RestController
public class CarReq {

	@RequestMapping(value ="/car")
	public ResponseEntity<Car> get() {
		Car car = new Car();
		car.setColor("Red");
		car.setVIN("1234");
		car.setMiles(3679);
		
		return new ResponseEntity<Car>(car, HttpStatus.OK);
	}

	@RequestMapping(value="/updatecar", method = RequestMethod.POST)
	public ResponseEntity<Car> update(@RequestBody Car car) {

		if (car != null) {
			car.setMiles(car.getMiles()+1000);
		}

		return new ResponseEntity<Car>(car, HttpStatus.OK);
	}

	@RequestMapping(value="/updatecars", method = RequestMethod.POST)
	public ResponseEntity<List<Car>> updatemulti(@RequestBody List<Car> cars) {

	//	cars.stream().forEach(c -> c.setMiles(c.getMiles() + 100));

		Iterator<Car> i = cars.iterator();

		while (i.hasNext()) {
			Car cuu= i.next();
			cuu.setMiles(cuu.getMiles()+1000);
		}

		return new ResponseEntity<List<Car>>(cars, HttpStatus.OK);
	}
}