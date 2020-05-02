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
				
<<<<<<< HEAD
		System.out.println("\n=== TEST 2: department INSERT ===");
=======
		System.out.println("=== TEST 2: department INSERT ===");
>>>>>>> 6da1439e3ee4c935a27d00024f86d1946607b4bf
		newDepartment = new Department(null, "Information Technology");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New Id = "+ newDepartment.getId());
		
<<<<<<< HEAD
		System.out.println("\n=== TEST 3: department UPDATE ===");
=======
		System.out.println("=== TEST 3: department UPDATE ===");
>>>>>>> 6da1439e3ee4c935a27d00024f86d1946607b4bf
		newDepartment = departmentDao.findById(3);
		newDepartment.setName("Computer");
		departmentDao.update(newDepartment);
		System.out.println("Update completed");
<<<<<<< HEAD
		
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
=======
>>>>>>> 6da1439e3ee4c935a27d00024f86d1946607b4bf

		sc.close();
		
	}

}
