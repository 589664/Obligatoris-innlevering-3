package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	
	private int id, likes;
	private String bruker, dato;
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = 0;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {
		
		this.id = id;
		this.bruker = bruker;
		this.likes = likes;
		this.dato = dato;
	}
	
	public String getBruker() {
		
		return bruker;

	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {
		return id;
	}

	public int getLikes() {
		return likes;
	}
	
	public void doLike () {
		this.likes = (getLikes()+1);
	}
	
	public boolean erLik(Innlegg innlegg) {
		
		if (id == innlegg.getId()) {
			return true;
		}
		
		return false;
		
	}
	
	@Override
	public String toString() {
		String s;
		
		s = getId() + "\n" + getBruker() + "\n" + getDato() + "\n" + getLikes() + "\n";
		
		return s;
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		String s;
		s = "\t\t<h2>" + getBruker() + "@" + getDato() + "[" + getLikes() + "]" + "<h2>\n";
		
		return s;
	}
}
