package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		Department dep;
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("==== TESTE 1: Department findById ====");
		System.out.println("Enter an Id to find Department");
		int id = sc.nextInt();
		sc.nextLine();
		dep = depDao.findById(id);
		System.out.println("Resultado da busca:\n" + dep);*/
		
		/*System.out.println("==== TESTE 2: Department Insert ====");
		System.out.println("Digite o nome do departamento que deseja inserir");
		dep = new Department(null, sc.nextLine());
		depDao.insert(dep);
		System.out.println("Department " + dep.getName() + " sucessfull created!");*/
		
		/*System.out.println("==== TESTE 3: Department findAll ====");
		List<Department> list = depDao.findAll();
		for(Department obj : list) {
			System.out.println("Id: " + obj.getId() + " Department: " + obj.getName());
		}*/
		
		/*System.out.println("==== TESTE 4: Department update ====");
		System.out.println("Insert department id to update");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Insert new department name");
		String name = sc.nextLine();
		dep = new Department(id, name);
		depDao.update(dep);
		System.out.println("Update complete!");*/
		
		/*System.out.println("==== TESTE 4: Department update ====");
		System.out.println("Insert department id to be deleted");
		int id = sc.nextInt();
		sc.nextLine();
		depDao.deleteById(id);
		System.out.println("Department of id " + id + " sucessfull deleted");*/
		
		sc.close();
		
		
	}

}
