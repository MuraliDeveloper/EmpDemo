package com.mythri.dao;

import java.util.List;

import com.mythri.dto.CreateEmpDetails;
import com.mythri.dto.EmployeeRequest;
import com.mythri.dto.ResponseDTO;
import com.mythri.entity.Employee;

public interface EmployeeDao {
	
	public Employee addEmployee(Employee employee);

	public boolean isEmployeeExists(String str);
	
	public ResponseDTO<Employee> getEmployees(int pageNo);
	
	public CreateEmpDetails getManagerAndDepts();

	public Employee getValidEmpByAuth(Employee employee);
	
	public Employee getEmployee(int id);
	
	public void deleteEmployee(Employee employee);

	public Employee getEmployeeByName(String name);

	public ResponseDTO<Employee> getAdvancedSearchResult(EmployeeRequest employeeReq);

	public Employee updateEmployee(Employee employee);

	public ResponseDTO<Employee> getAllEmps(String sortBy);

	public List<Employee> getBasicEmpDetails();

	public void updatePwd(Integer id, String newPass);

	public Integer  isValidLoginName(String loginName);

	public ResponseDTO<Employee> getAllSubordinates(Integer managerId);

}
