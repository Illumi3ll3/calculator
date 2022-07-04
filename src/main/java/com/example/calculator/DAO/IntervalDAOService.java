package com.example.calculator.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.calculator.model.Interval;

@Repository
public class IntervalDAOService implements IntervalDao {

	private static List<Interval> intervals = new ArrayList<>();

	@Override
	public int insertInterval(Interval interval) {
		intervals.add(interval);
		return 0;
	}

	@Override
	public Interval get(int id) {
		return intervals.get(id);
	}

	@Override
	public List<Interval> getAll() {
		return intervals;
	}

	@Override
	public int delete(int id) {
		intervals.remove(id);
		return id;
	}	

}
