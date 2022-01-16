package Managerment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Controller {

	private ArrayList<EmployeeParttime> lsEmployeeParttime;
	private ArrayList<EmployeeFulltime> lsEmployeeFulltime;

	public Controller() {
		this.lsEmployeeParttime = new ArrayList<EmployeeParttime>();
		this.lsEmployeeFulltime = new ArrayList<EmployeeFulltime>();
	}

	public void addListPT(EmployeeParttime ept) {
		this.lsEmployeeParttime.add(ept);
	}

	public void addListFT(EmployeeFulltime eft) {
		this.lsEmployeeFulltime.add(eft);
	}

	public void showListFT() {
		// TODO Auto-generated method stub
		for (EmployeeFulltime employeeFulltime : lsEmployeeFulltime) {
			System.out.println(employeeFulltime);
		}
	}

	public void showListPT() {
		// TODO Auto-generated method stub
		for (EmployeeParttime employeeParttime : lsEmployeeParttime) {
			System.out.println(employeeParttime);
		}
	}

	public void showSalaryList() {
		// TODO Auto-generated method stub
		long sum = 0;
		for (EmployeeParttime employeeParttime : lsEmployeeParttime) {
			sum = (long) (sum + employeeParttime.getSalary());
		}
		for (EmployeeFulltime employeeFulltime : lsEmployeeFulltime) {
			sum = (long) (sum + employeeFulltime.getSalary());
		}
		System.out.println(sum);

	}

	public void showSalaryListPT() {
		// TODO Auto-generated method stub
		long sum = 0;
		for (EmployeeParttime employeeParttime : lsEmployeeParttime) {
			sum = (long) (sum + employeeParttime.getSalary());
		}
		System.out.println(sum);

	}

	public void showSalaryListFT() {
		// TODO Auto-generated method stub
		long sum = 0;
		for (EmployeeFulltime employeeFulltime : lsEmployeeFulltime) {
			sum = (long) (sum + employeeFulltime.getSalary());
		}
		System.out.println(sum);
	}

	public void sortNamePT() {
		// TODO Auto-generated method stub
		Collections.sort(lsEmployeeParttime,new Comparator<EmployeeParttime>() {

			@Override
			public int compare(EmployeeParttime o1, EmployeeParttime o2) {
				String name1 = o1.getName().substring(o1.getName().lastIndexOf(" ")+1);
				String name2 = o2.getName().substring(o2.getName().lastIndexOf(" ")+1);
				int compareName = name1.compareTo(name2);
				if(compareName==0) {
					String ho1 = o1.getName().substring(0,o1.getName().lastIndexOf(" ")+1);
					String ho2 = o2.getName().substring(0,o2.getName().lastIndexOf(" ")+1);
					
					return ho1.compareTo(ho2);
				
				}else {
					
					return compareName;
					
				}
			}
		
		});
		showListPT();
	}

	public void sortNameFT() {
		// TODO Auto-generated method stub
				Collections.sort(lsEmployeeFulltime,new Comparator<EmployeeFulltime>() {
					
					@Override
					public int compare(EmployeeFulltime o1, EmployeeFulltime o2) {
						String name1 = o1.getName().substring(o1.getName().lastIndexOf(" ")+1);
						String name2 = o2.getName().substring(o2.getName().lastIndexOf(" ")+1);
						int compareName = name1.compareTo(name2);
						if(compareName==0) {
							String ho1 = o1.getName().substring(0,o1.getName().lastIndexOf(" ")+1);
							String ho2 = o2.getName().substring(0,o2.getName().lastIndexOf(" ")+1);
						    
							return ho1.compareTo(ho2);
						}else {
							
							return compareName;
						}
					}
				
				});
				showListFT();
	}

	public void searchName() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		boolean check = false;
		for (EmployeeParttime employeeParttime : lsEmployeeParttime) {
			String searchName = employeeParttime.getName().substring(employeeParttime.getName().lastIndexOf(" ") + 1);
			if (searchName.equalsIgnoreCase(name)) {
				System.out.println(employeeParttime);
				check = true;
			} else if (employeeParttime.getName().equalsIgnoreCase(name)) {
				System.out.println(employeeParttime);
				check = true;
			}
		}
		if (check == false) {
			System.out.println("Không tìm thấy dữ liệu!");
		}
		check = false;
		for (EmployeeFulltime employeeFulltime : lsEmployeeFulltime) {
			String searchName = employeeFulltime.getName().substring(employeeFulltime.getName().lastIndexOf(" ") + 1);
			if (searchName.equalsIgnoreCase(name)) {
				System.out.println(employeeFulltime);
				check = true;
			} else if (employeeFulltime.getName().equalsIgnoreCase(name)) {
				System.out.println(employeeFulltime);
				check = true;
			}
		}
		if (check == false) {
			System.out.println("Không tìm thấy dữ liệu!");
		}

	}
}
