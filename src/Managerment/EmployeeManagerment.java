package Managerment;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagerment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		/*
		 * ArrayList<EmployeeParttime> listPT = new ArrayList<>();
		 * ArrayList<EmployeeFulltime> listFT = new ArrayList<>();
		 */

		Controller list = new Controller();
		/*
		 * for (int i = 0; i < 50; i++) System.out.println();
		 */
		while (true) {
			System.out.println("\t\tQuản lý nhân viên: ");
			System.out.println("\t\tChọn 1: Thêm nhân viên: ");
			System.out.println("\t\tChọn 2: Hiển thị danh sách nhân viên: ");
			System.out.println("\t\tChọn 3: Tổng số tiền công ty chi trả cho nhân viên: ");
			System.out.println("\t\tChọn 4: Tìm kiếm nhân viên theo tên : ");
			System.out.println("\t\tChọn 5: Sắp xếp danh sách nhân viên : ");
			System.out.println("\t\tChọn 0: Thoát khỏi chương trình: ");
			System.out.println("\t\t=========================================");
			System.out.println("\t\t\tNhập vào: ");
			try {
				int line = Integer.parseInt(sc.nextLine());
				switch (line) {
				// Nhập vào nhân viên
				case 1: {
					System.out.println("\t\tChọn 1: Thêm vào nhân viên PartTime: ");
					System.out.println("\t\tChọn 2: Thêm vào nhân viên FullTime: ");
					System.out.println("\t\t\tNhập vào: ");
					int type = Integer.parseInt(sc.nextLine());
					switch (type) {
					case 1: {
						
						String dk = "";
						do {
						EmployeeParttime ePT = new EmployeeParttime(0, null, null, null, 0);
						ePT.addEPT();
						list.addListPT(ePT);
						System.out.println("Tiếp tục nhập NV PT mới? Y/N ");
						dk = sc.nextLine();
						} while (dk.equalsIgnoreCase("Y"));
						break;
						
					}
					case 2: {
						/*
						 * System.out.println("\t\t\tNhập vào số nhân viên cần nhập: "); byte n =
						 * sc.nextByte(); for (int i = 0; i < n; i++) {
						 * System.out.println("\t\t\tNhập vào nhân fulltime viên thứ: " + (i + 1) +
						 * ":"); EmployeeFulltime eFT = new EmployeeFulltime(0, null, null, null, 0);
						 * eFT.addEFT(); list.addListFT(eFT); }
						 */
						String dk = "";
						do {
						EmployeeFulltime eFT = new EmployeeFulltime(0, null, null, null, 0);
						eFT.addEFT();
						list.addListFT(eFT);
						System.out.println("Tiếp tục nhập NV PT mới? Y/N ");
						dk = sc.nextLine();
						} while (dk.equalsIgnoreCase("Y"));
						break;
					}
					default: {
						System.out.println("Nhập vào không hợp lệ!(101)");
						break;
					}
					}
					break;
				}
				// Hiển thị nhân viên
				case 2: {
					System.out.println("\t\tChọn 1: Hiển thị nhân viên PartTime: ");
					System.out.println("\t\tChọn 2: Hiển thị nhân viên FullTime: ");
					System.out.println("\t\tChọn 3: Hiển thị toàn bộ nhân viên: ");
					System.out.println("\t\t\tNhập vào: ");
					int type = Integer.parseInt(sc.nextLine());

					switch (type) {
					case 1: {
						System.out.println("Ds nhân viên PT: ");
						list.showListPT();
						sc.nextLine();

					}
						break;
					case 2: {
						System.out.println("Ds nhân viên FT: ");
						list.showListFT();
						sc.nextLine();

					}
						break;
					case 3: {
						System.out.println("Ds toàn bộ nhân viên : ");
						list.showListPT();
						sc.nextLine();
						list.showListFT();
						sc.nextLine();

					}
						break;
					default: {
						System.out.println("Nhập vào khong hợp lệ!(102)");
						break;
					}
					}
					break;
				}
				case 3: {
					System.out.println("\t\tChọn 1: Tổng tiền chi trả cho nhân viên PartTime: ");
					System.out.println("\t\tChọn 2: Tổng tiền chi trả cho nhân viên FullTime: ");
					System.out.println("\t\tChọn 3: Tổng tiền chi trả cho toàn bộ nhân viên: ");
					System.out.println("\t\t\tNhập vào: ");
					int type = Integer.parseInt(sc.nextLine());

					switch (type) {
					case 1: {
						System.out.println("Tổng tiền chi trả cho nhân viên PT: ");
						list.showSalaryListPT();
						sc.nextLine();

					}
						break;
					case 2: {
						System.out.println("Tổng tiền chi trả cho nhân viên FT: ");
						list.showSalaryListFT();
						sc.nextLine();

					}
						break;
					case 3: {
						System.out.println("Tổng tiền chi trả cho toàn bộ nhân viên : ");
						System.out.println("Parttime");
						list.showSalaryListPT();
						sc.nextLine();
						System.out.println("Fulltime");
						list.showSalaryListFT();
						sc.nextLine();
						System.out.println("Tổng");
						list.showSalaryList();
						sc.nextLine();
					}
						break;
					default: {
						System.out.println("Nhập vào không hợp lệ!(103)");
						break;
					}
					}
					break;
				}
								case 4: {
					System.out.println("\t\t: Tìm kiếm nhân viên: ");
					System.out.println("\t\t\tNhập vào: ");
					list.searchName();

				}
					break;
								case 5: {
									System.out.println("\t\tChọn 1: Sắp xếp nhân viên PartTime: ");
									System.out.println("\t\tChọn 2: Sắp xếp nhân viên FullTime: ");
									System.out.println("\t\t\tNhập vào: ");
									int type = Integer.parseInt(sc.nextLine());

									switch (type) {
									case 1: {
										System.out.println("Sắp xếp nhân viên PT: ");
										list.sortNamePT();
										break;

									}
										
									case 2: {
										System.out.println("Sắp xếp nhân viên FT: ");
										list.sortNameFT();
										
										break;
									}
										

									default: {
										System.out.println("Nhập vào không hợp lệ!(104)");
										break;
									}
									}
									break;
								}

				case 0: {
					System.out.println("Kết thúc chương trình!");
					System.exit(0);
					break;
				}

				default: {
					System.out.println("Nhập vào không hợp lệ!(02)");
					sc.nextLine();
					break;
				}
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Vui lòng nhập lại!(01)");
				sc.nextLine();
			}

		}
	}

}
