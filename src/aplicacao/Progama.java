package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidade.Comentario;
import entidade.Postagens;

public class Progama {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Uau que fantastico");
		Comentario c2 = new Comentario("Maravilhoso");
		Postagens p1 = new Postagens(sdf.parse("15/04/2024 15:28:00"),"VIAGEM A NATAL","VOU VISITAR UM LOCAL MASSA",12);
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		Comentario c3 = new Comentario("BOA NOITE, PRINCESA!!!!");
		Comentario c4 = new Comentario("POR FAVOR, SENTI NA CLOCK!!!");
		Postagens p2 = new Postagens(sdf.parse("15/04/2024 18:32:35"),"UMA BAIXARIA PARA ANIMAR!!",
				"BAGULHO É LOUCO E O PAPO É RETO",35);
		p2.addComentario(c3);
		p2.addComentario(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}