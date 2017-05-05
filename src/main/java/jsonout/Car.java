package jsonout;

public class Car {

	private String VIN;
	private String color;
	private Integer miles;

	public String getVIN() {
		return this.VIN;
	}
	
	public String getColor() {
		return this.color;
	}

	public void setVIN(String VIN) {
		this.VIN = VIN;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setMiles(Integer miles) {
		this.miles = miles;
	}

	public Integer getMiles() {
		return this.miles;
	}

}