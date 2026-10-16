package com.example.demo.resources.bean;

import org.springframework.stereotype.Component;

@Component
public class Limits {

	private int minimum;
	private int maximum;
	public Limits() {
		
	}
	public Limits(int minimum2, int maximum2) {
		this.minimum=minimum2;
		this.maximum=maximum2;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	
}
