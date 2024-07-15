package com.srivath.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.srivath.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	/*
	 * findBy Methods
	 */

	public Employee findByEmpName(String name);

	public List<Employee> findByEmpSalary(Double salary);

	public List<Employee> findByEmpSalaryGreaterThan(Double salary);

	public List<Employee> findByEmpDept(String dept);

	public List<Employee> findByEmpGender(String empGender);

	/*
	 * Custom queries
	 */

	@Query(value = "select * from employee_tbl", nativeQuery = true)
	public List<Employee> getAllEmployeesNative();

	@Query(value = "From Employee")
	public List<Employee> getAllEmployeesJqpl();

	@Query(value = "FROM Employee e WHERE e.empSalary>?1 AND e.empDept=?2")
	public List<Employee> getEmpBySalAndDept(Double salary, String dept);

	@Query(value = "select * from employee_tbl limit ?,?", nativeQuery = true)
	// select * from employee_tbl limit ?,?
	// here 1st positional parameter = offset, 2nd 1st positional parameter = limit
	public List<Employee> getEmpPage(Integer pageOffset, Integer pageSize);
}
