package com.example.calculator.DAO;

import java.util.List;

import com.example.calculator.model.Interval;

public interface IntervalDao {

	int insertInterval(Interval interval);

	Interval get(int id);

	List<Interval> getAll();

	int delete(int id);

}
