package titutionAssistanceProgram.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WorkAddress {

	@Id
	//@Column(name = "Location ID")
	private int locationID;
	
	//@Column(name = "Employee ID")
	//private int employeeID;
	
	//@Column(name = "Street Line1")
	private String streetLine1;
	
	//@Column(name = "Street Line2")
	private String streetLine2;
	
	//@Column(name = "City")
	private String city;
	
	//@Column(name = "State")
	private String state;
	
	//@Column(name = "Zip Code")
	private int zipCode;

	@Override
	public String toString() {
		return "WorkAddress [locationID=" + locationID + ", streetLine1=" + streetLine1
				+ ", streetLine2=" + streetLine2 + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + "]";
	}

	public WorkAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WorkAddress(int locationID, String streetLine1, String streetLine2, String city,
			String state, int zipCode) {
		super();
		this.locationID = locationID;
		//this.employeeID = employeeID;
		this.streetLine1 = streetLine1;
		this.streetLine2 = streetLine2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public int getLocationID() {
		return locationID;
	}

	public void setLocationID(int locationID) {
		this.locationID = locationID;
	}

//	public int getEmployeeID() {
//		return employeeID;
//	}
//
//	public void setEmployeeID(int employeeID) {
//		this.employeeID = employeeID;
//	}

	public String getStreetLine1() {
		return streetLine1;
	}

	public void setStreetLine1(String streetLine1) {
		this.streetLine1 = streetLine1;
	}

	public String getStreetLine2() {
		return streetLine2;
	}

	public void setStreetLine2(String streetLine2) {
		this.streetLine2 = streetLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

}
