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
		
		/*System.out.println("==== TESTE 1: findById ====");
		System.out.println("Enter an Id to find Department");
		int id = sc.nextInt();
		sc.nextLine();
		dep = depDao.findById(id);
		System.out.println("Resultado da busca:\n" + dep);*/
		
		/*System.out.println("==== TESTE 2: Insert ====");
		System.out.println("Digite o nome do departamento que deseja inserir");
		dep = new Department(null, sc.nextLine());
		depDao.insert(dep);
		System.out.println("Department " + dep.getName() + " sucessfull created!");*/
		
		/*System.out.println("==== TESTE 3: findAll ====");
		List<Department> list = depDao.findAll();
		for(Department obj : list) {
			System.out.println("Id: " + obj.getId() + " Department: " + obj.getName());
		}*/
		
		sc.close();
		
		
	}

}
