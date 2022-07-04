package com.example.calculator.REST;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.calculator.DAO.IntervalDao;
import com.example.calculator.model.Interval;
import com.example.calculator.service.IntervalService;

@RestController
public class IntervalController {

	IntervalService intervalService;

	@Autowired
	public IntervalController(IntervalService intervalService) {
		super();
		this.intervalService = intervalService;
	}

	@GetMapping("/interval/{id}")
	public Interval get(@PathVariable("id") int id) {
		return intervalService.get(id);
	}

	@PostMapping("/interval")
	String insert(@RequestBody Interval interval) {
		return "Data Inserted " + intervalService.insertInterval(interval);
	}

	@GetMapping("/interval")
	public List<Interval> get() {
		return intervalService.getAll();
	}

	@DeleteMapping("/interval/{id}")
	public int delete(@PathVariable("id") int id) {
		return intervalService.delete(id);
	}

	@PostMapping("/insertSet")
	List<Interval> insertSet(@RequestBody List<Interval> intervals) {
		return intervalService.processIntervals(intervals);
	}

}
