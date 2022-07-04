package com.example.calculator.service;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.calculator.DAO.IntervalDao;
import com.example.calculator.model.Interval; 


	@Service
	public class IntervalService {

		
		private IntervalDao intervalDao;
		
		
		@Autowired
		public IntervalService(IntervalDao intervalDao) {
			super();
			this.intervalDao = intervalDao;
		}

		public int insertInterval(Interval interval) {
			// TODO Auto-generated method stub
			intervalDao.insertInterval(interval);
			return interval.getId();
		}
		
		public Interval get(int id) {
			// TODO Auto-generated method stub
			return intervalDao.get(id);
		}
		
		public List<Interval> getAll() {
			// TODO Auto-generated method stub
			return intervalDao.getAll();
		}
		
		public int delete(int id) {
			// TODO Auto-generated method stub
			 intervalDao.delete(id);
			 return id;
		}
		
		
		public List<Interval> processIntervals(List<Interval> intervals) {
			// TODO Auto-generated method stub
			
			
			intervals.get(0).setDuration(Duration.between(intervals.get(0).getStart(), intervals.get(0).getEnd()));
			for(int i=1;i<intervals.size();i++) {
				intervals.get(i).setDuration(Duration.between(intervals.get(i).getStart(), intervals.get(i).getEnd()));
				intervals.get(i).setBreaks(Duration.between(intervals.get(i-1).getEnd(), intervals.get(i).getStart()));
				
			}
			return intervals;
		}

	}

