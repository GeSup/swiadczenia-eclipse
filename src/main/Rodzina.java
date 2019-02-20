package main;

import java.util.List;

public class Rodzina extends Osoba {

	private List<Osoba> rodzina;

	Rodzina() {
	}

	Rodzina(Osoba osoba) {
		rodzina.add(osoba);
	}

	Rodzina(int index, Osoba osoba) {
		rodzina.add(index, osoba);
	}

	Rodzina(int index) {
		rodzina.get(index);
	}

	public void usuwanie(int index) {
		rodzina.remove(index);
	}

	public void podmaina(int index, Osoba osoba) {
		rodzina.set(index, osoba);
	}
	
	public void oczyszczenie(){
		rodzina.clear();
	}
}
