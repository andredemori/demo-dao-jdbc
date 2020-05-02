package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findById ===");
		Department newDepartment = departmentDao.findById(3);
		System.out.println(newDepartment);
				
		System.out.println("=== TEST 2: department INSERT ===");
		newDepartment = new Department(null, "Information Technology");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New Id = "+ newDepartment.getId());
		
		System.out.println("=== TEST 3: department UPDATE ===");
		newDepartment = departmentDao.findById(3);
		newDepartment.setName("Computer");
		departmentDao.update(newDepartment);
		System.out.println("Update completed");

	}

}
