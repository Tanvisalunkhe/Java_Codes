package com.service;
import com.deo.EmployeeDao;

public class EmployeeService {
	public void create() {
		EmployeeDao dao = new EmployeeDao();
		dao.create();
	}

	public void deleteData() {
		EmployeeDao dao = new EmployeeDao();
		dao.deleteData();
	}

	public void update() {
		EmployeeDao dao = new EmployeeDao();
		dao.update();
		
	}
	public void getAllData() {
		EmployeeDao dao = new EmployeeDao();
		dao.getAllData();
		
	}
	public void getSingleRecord() {
		EmployeeDao dao = new EmployeeDao();
		dao.getSingleRecord();
		
	}
	public void deleteSingleRecord() {
		EmployeeDao dao = new EmployeeDao();
		dao.deleteSingleRecord();
		
	}
}
