package com.bridgelabz.employeewage;

public interface EmployeeService {

	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfworkingDays, int maxHoursPerMonth);

	public void computeEmpWage();
	int getTotalWage (String company);
}