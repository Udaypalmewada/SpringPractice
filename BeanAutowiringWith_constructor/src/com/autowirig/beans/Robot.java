package com.autowirig.beans;

public class Robot {
	private MicroProcessor microProcessor;
	private Sensor sensor;
	
	
	public Robot(Sensor sensor) {
		this.sensor = sensor;
	}
	public Robot(MicroProcessor microProcessor) {
		this.microProcessor = microProcessor;
	}
	public Robot(MicroProcessor microProcessor, Sensor sensor) {
		this.microProcessor = microProcessor;
		this.sensor = sensor;
	}
	@Override
	public String toString() {
		return "Robot [microProcessor=" + microProcessor + ", sensor=" + sensor + "]";
	}
	
	
}
