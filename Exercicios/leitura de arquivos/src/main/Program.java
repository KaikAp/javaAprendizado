package main;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite uma pasta: ");
		String strpath = sc.nextLine();
		File path = new File(strpath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Pastas: ");
		for(File folder: folders) {
			System.out.println(folder);
		}
		
		boolean success = new File(strpath+ "\\subdir").mkdir();
		
		System.out.println("diretorio criado com sucesso" + success);
		sc.close();
	}
	
	
	
	}

