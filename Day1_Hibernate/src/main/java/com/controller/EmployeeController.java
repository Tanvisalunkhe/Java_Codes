package com.controller;
import com.service.EmployeeService;

public class EmployeeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService service = new EmployeeService();
		//service.create();
	//service.deleteData();
		//service.update();
		//service.getAllData();
		//service.getSingleRecord();
		service.deleteSingleRecord();

	}

}
