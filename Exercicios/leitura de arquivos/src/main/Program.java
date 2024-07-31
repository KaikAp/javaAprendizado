package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
	
		String[] Lines = new String[] { "good morning", "good afternoon"};
		String path = "B:\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){ //o true verifica se ele já existe sem o parametro ele recria ou cria o arquivo
			for(String line:Lines) {
				bw.write(line);
				bw.newLine();
				
			}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

