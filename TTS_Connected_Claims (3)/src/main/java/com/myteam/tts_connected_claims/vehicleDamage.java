package com.myteam.tts_connected_claims;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class vehicleDamage implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "vehicleOverturned")
	private java.lang.Boolean vehicleOverturned;

	@org.kie.api.definition.type.Label(value = "airbagsDeployed")
	private java.lang.Boolean airbagsDeployed;

	@org.kie.api.definition.type.Label(value = "fluidsLeaking")
	private java.lang.Boolean fluidsLeaking;

	@org.kie.api.definition.type.Label(value = "bonnetCannotOpen")
	private java.lang.Boolean bonnetCannotOpen;

	@org.kie.api.definition.type.Label(value = "suspensionDamaged")
	private java.lang.Boolean suspensionDamaged;

	@org.kie.api.definition.type.Label(value = "wheelObstructed")
	private java.lang.Boolean wheelObstructed;

	public vehicleDamage() {
	}

	public java.lang.Boolean getVehicleOverturned() {
		return this.vehicleOverturned;
	}

	public void setVehicleOverturned(java.lang.Boolean vehicleOverturned) {
		this.vehicleOverturned = vehicleOverturned;
	}

	public java.lang.Boolean getAirbagsDeployed() {
		return this.airbagsDeployed;
	}

	public void setAirbagsDeployed(java.lang.Boolean airbagsDeployed) {
		this.airbagsDeployed = airbagsDeployed;
	}

	public java.lang.Boolean getFluidsLeaking() {
		return this.fluidsLeaking;
	}

	public void setFluidsLeaking(java.lang.Boolean fluidsLeaking) {
		this.fluidsLeaking = fluidsLeaking;
	}

	public java.lang.Boolean getBonnetCannotOpen() {
		return this.bonnetCannotOpen;
	}

	public void setBonnetCannotOpen(java.lang.Boolean bonnetCannotOpen) {
		this.bonnetCannotOpen = bonnetCannotOpen;
	}

	public java.lang.Boolean getSuspensionDamaged() {
		return this.suspensionDamaged;
	}

	public void setSuspensionDamaged(java.lang.Boolean suspensionDamaged) {
		this.suspensionDamaged = suspensionDamaged;
	}

	public java.lang.Boolean getWheelObstructed() {
		return this.wheelObstructed;
	}

	public void setWheelObstructed(java.lang.Boolean wheelObstructed) {
		this.wheelObstructed = wheelObstructed;
	}

	public vehicleDamage(java.lang.Boolean vehicleOverturned,
			java.lang.Boolean airbagsDeployed, java.lang.Boolean fluidsLeaking,
			java.lang.Boolean bonnetCannotOpen,
			java.lang.Boolean suspensionDamaged,
			java.lang.Boolean wheelObstructed) {
		this.vehicleOverturned = vehicleOverturned;
		this.airbagsDeployed = airbagsDeployed;
		this.fluidsLeaking = fluidsLeaking;
		this.bonnetCannotOpen = bonnetCannotOpen;
		this.suspensionDamaged = suspensionDamaged;
		this.wheelObstructed = wheelObstructed;
	}

}