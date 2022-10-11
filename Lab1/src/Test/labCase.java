package Test;

import java.util.Scanner;

public class labCase {

	public int getID() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter ID : ");
		String labCase = scanner.nextLine();
		String[] str_id = labCase.split("-");
		//System.out.print(Integer.parseInt(str_id[0])+5);
		return Integer.parseInt(str_id[0]);
	}
	
	public int idplus5 (int id) {
		return id + 5;
	}

	}


