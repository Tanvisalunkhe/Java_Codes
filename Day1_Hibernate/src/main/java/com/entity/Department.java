package com.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
 public class Department { // One

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		int deptId;
		String deptName;

		@OneToMany(mappedBy = "d")
		List<Employee1> emp;

		public Department(int deptId, String deptName, List<Employee1> emp) {
			super();
			this.deptId = deptId;
			this.deptName = deptName;
			this.emp = emp;
		}

		public Department() {
			super();
			// TODO Auto-generated constructor stub
		}

		public int getDeptId() {
			return deptId;
		}

		public void setDeptId(int deptId) {
			this.deptId = deptId;
		}

		public String getDeptName() {
			return deptName;
		}

		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}

		public List<Employee1> getEmp() {
			return emp;
		}

		public void setEmp(List<Employee1> emp) {
			this.emp = emp;
		}

		@Override
		public String toString() {
			return "Department [deptId=" + deptId + ", deptName=" + deptName + ", emp=" + emp + "]";
		}

	}


