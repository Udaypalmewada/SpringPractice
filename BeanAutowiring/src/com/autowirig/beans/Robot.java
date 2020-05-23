package com.autowirig.beans;

public class Robot {
	private MicroProcessor microProcessor;
	private Sensor sensor;
	public void setMicroProcessor(MicroProcessor microProcessor) {
		this.microProcessor = microProcessor;
	}
	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}
	@Override
	public String toString() {
		return "Robot [microProcessor=" + microProcessor + ", sensor=" + sensor + "]";
	}

	
}
