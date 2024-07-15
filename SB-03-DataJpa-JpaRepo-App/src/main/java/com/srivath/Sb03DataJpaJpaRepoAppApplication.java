package com.srivath;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.srivath.entity.Employee;
import com.srivath.repository.EmployeeRepository;

@SpringBootApplication
public class Sb03DataJpaJpaRepoAppApplication {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Sb03DataJpaJpaRepoAppApplication.class, args);
		EmployeeRepository repo = context.getBean(EmployeeRepository.class);
		System.out.println(repo.getClass().toString());

//		Employee e1 = new Employee(1, "Dean", 2000.0, "Male", "HR");
//		Employee e2 = new Employee(2, "Carlos", 3000.0, "Male", "Account");
//		Employee e3 = new Employee(3, "Shine", 4000.0, "Male", "Admin");
//		Employee e4 = new Employee(4, "Lusy", 5000.0, "Female", "HR");
//		Employee e5 = new Employee(5, "Katrine", 6000.0, "Female", "Business");
//		Employee e6 = new Employee(6, "Monika", 7000.0, "Male", "Admin");

//		Employee employee=new Employee();
//		employee.setEmpName("Raj");
//		employee.setEmpGender("Male");
//		employee.setEmpSalary(5000.0);
//		employee.setEmpDept("Accounts");

		// insert a record
//		Employee emp1 = new Employee();
//		emp1.setEmpName("Robert");
//		emp1.setEmpSalary(3400.0);
//		emp1 = repo.save(emp1);
//		System.out.println("Record inserted...");

		// ******* updatig the record based on PK - S *******
//		if (repo.existsById(3)) {
//			Optional<Employee> optional = repo.findById(3);
//			Employee employee = optional.get();
//			employee.setEmpSalary(8000.0);
//			repo.save(employee);
//			System.out.println("Employee details updated");
//		} else {
//			System.out.println("No such emp");
//		}
		// ******* updatig the record based on PK - E *******

		// ******* update salary of emp -S *******
//		System.out.println("Enter employee name:");
//		String name = scanner.nextLine();
//		System.out.println("Enter the new salary:");
//		Double sal = scanner.nextDouble();
//		Employee emp = repo.findByEmpName(name);
//		if (!(emp == null)) {
//			emp.setEmpSalary(sal);
//			repo.save(emp);
//			System.out.println("Salary of "+name+" updated to "+sal);
//		} else {
//			System.out.println("Employee with name " + name + " doesn't exists.");
//		}
		// ******* update salary of emp -E *******

		/*
		 * CRUD operations
		 */
//		repo.saveAll(Arrays.asList(e1, e2, e3, e4, e5, e6, e7));
//		List<Employee> lst1 = repo.findAll();
//		lst1.stream().map(e->e.getEmpName()).forEach(System.out::println);
//		lst1.forEach(System.out::println);

		/*
		 * findBy methods
		 */
//		List<Employee> list = repo.findByEmpGender("FeMale");
//		list.forEach(System.out::println);

		/*
		 * Custom queries
		 */
//		List<Employee> list2 = repo.getEmpBySalAndDept(5000.0, "Manager");
//		list2.forEach(System.out::println);

		/*
		 * sorting
		 */
//		Sort sortByName = Sort.by("empName");
//		Sort sortBySalary = Sort.by("empSalary").descending();
//		Sort sortByNameAndSalary = Sort.by("empName","empSalary").descending();
//		List<Employee> lstOfEmps = repo.findAll(sortByNameAndSalary);
//		lstOfEmps.forEach(System.out::println);

		/*
		 * 
		 * pagination using JPA built in methods
		 */
//		System.out.println("Enter page number:");
//		int pageNumber = scanner.nextInt();
//		System.out.println("Enter page size:");
//		int pageSize = scanner.nextInt();
//
//		System.out.println("Pagination by JPA built in methods");
//		PageRequest pageRequest = PageRequest.of(pageNumber - 1, pageSize);
//		Page<Employee> page = repo.findAll(pageRequest);
//		List<Employee> lst = page.getContent();
//		lst.forEach(System.out::println);
//		System.out.println("=====================================");
//
//		/*
//		 * pagination using custom query
//		 */
//		System.out.println("Pagination using custom query");
//		int pageOffset = (pageNumber == 1) ? 0 : pageSize * (pageNumber - 1);
//		System.out.println("pageOffset=" + pageOffset);
//		List<Employee> list_01 = repo.getEmpPage(pageOffset, pageSize);
//		list_01.forEach(System.out::println);
//		System.out.println("=====================================");

		/*
		 * Query By Example - used for Dynamic Query Preparation
		 */

//		Employee employee = new Employee();
//		employee.setEmpGender("Male");
//		employee.setEmpDept("HR");
//		//employee.setEmpSalary(2000.0);
//		Example<Employee> example = Example.of(employee);
//		List<Employee> list_02 = repo.findAll(example);
//		list_02.forEach(System.out::println);

	}

}
