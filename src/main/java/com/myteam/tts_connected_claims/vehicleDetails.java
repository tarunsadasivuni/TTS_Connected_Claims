package com.myteam.tts_connected_claims;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class vehicleDetails implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("description")
	private java.lang.String description;

	@org.kie.api.definition.type.Label("year")
	private String year;

	@org.kie.api.definition.type.Label("registrationNumber")
	private java.lang.String registrationNumber;

	@org.kie.api.definition.type.Label("make")
	private java.lang.String make;

	@org.kie.api.definition.type.Label("model")
	private java.lang.String model;

	public vehicleDetails() {
	}

	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.lang.String getRegistrationNumber() {
		return this.registrationNumber;
	}

	public void setRegistrationNumber(java.lang.String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public java.lang.String getMake() {
		return this.make;
	}

	public void setMake(java.lang.String make) {
		this.make = make;
	}

	public java.lang.String getModel() {
		return this.model;
	}

	public void setModel(java.lang.String model) {
		this.model = model;
	}

	public java.lang.String getYear() {
		return this.year;
	}

	public void setYear(java.lang.String year) {
		this.year = year;
	}

	public vehicleDetails(java.lang.String description, java.lang.String year,
			java.lang.String registrationNumber, java.lang.String make,
			java.lang.String model) {
		this.description = description;
		this.year = year;
		this.registrationNumber = registrationNumber;
		this.make = make;
		this.model = model;
	}

}