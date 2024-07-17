package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Comment c1 = new Comment("have a nice trip!!");
		Comment c2 = new Comment("wow thats awesome!");
		Post p1 =  new Post(sdf.parse("21/06/2018 13:05:44"),"viajando para nova zelandia","visitando esse belo pais", 12);
		p1.addcomment(c1);
		p1.addcomment(c2);
		System.out.println(p1);
	}
}
