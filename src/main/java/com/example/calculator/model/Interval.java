package com.example.calculator.model;

import java.time.Duration;
import java.time.Instant;

public class Interval {

	int id;
	Instant start;
	Instant end;
	Duration duration;
	Duration breaks;
	public Duration getDuration() {
		return duration;
	}
	public void setDuration(Duration duration) {
		this.duration = duration;
	}
	public Duration getBreaks() {
		return breaks;
	}
	public void setBreaks(Duration breaks) {
		this.breaks = breaks;
	}
	public Interval(int id, Instant start, Instant end) {
		super();
		this.id = id;
		this.start = start;
		this.end = end;
	}
	public int getId() {
		return id;
	}
	public Instant getStart() {
		return start;
	}
	public Instant getEnd() {
		return end;
	}
	
}
