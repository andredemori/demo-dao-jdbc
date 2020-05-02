package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findById ===");
		Department newDepartment = departmentDao.findById(3);
		System.out.println(newDepartment);
				
		System.out.println("\n=== TEST 2: department INSERT ===");
		newDepartment = new Department(null, "Information Technology");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New Id = "+ newDepartment.getId());
		
		System.out.println("\n=== TEST 3: department UPDATE ===");
		newDepartment = departmentDao.findById(3);
		newDepartment.setName("Computer");
		departmentDao.update(newDepartment);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 4: seller findAll ===");
		List<Department> list = departmentDao.findAll();
		list = departmentDao.findAll();
		for(Department obj : list){
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 5: seller DELETE ===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");

		sc.close();
		
	}

}
