package main;

public class Osoba {

	private String imie;
	private String nazwisko;
	private String pesel;
	private String plec;
	private String stanCywil;
	private String obywatelstwo;
	private String dataUrodzin;
	private String ulicaZamieszkania;
	private String ulicaZameldowania;
	private String ulicaKorespondencji;
	private String nrDomuZamieszkania;
	private String nrDomuZameldowania;
	private String nrDomuKorespondencji;
	private String miejscowoscZamieszkania;
	private String miejscowoscZameldowania;
	private String miejscowoscKorespondencji;
	private String pocztaZamieszkania;
	private String pocztaZameldowania;
	private String pocztaKorespondencji;
	private String kodPocztowyZamieszkania;
	private String kodPocztowyZameldowania;
	private String kodPocztowyKorespondencji;
	private String emailZamieszkania;
	private String emailZameldowania;
	private String emailKorespondencji;
	private String nrTelZamieszkania;
	private String nrTelZameldowania;
	private String nrTelKorespondencji;
	private String nrKonta;
	private String nazwaBanku;
	private String wlascicielKonta;
	private String sposobRealizacji;
	private int id;
	private double dochodOpodatkowany;
	private double dochodUzyskany;
	private double dochodUtracony;
	private double dochodNieopodatkowane;
	private double dochodZryczaltowany;

	Osoba() {

	}

	// wnioskodawca
	Osoba(String imie, String nazwisko, String pesel, String plec,
			String dataUrodzenia, String stanCywilny, String obywatelstwo,
			String nrTelefonuZamieszkania, String emailZamieszkania,
			String miejscowoscZamieszkania, String ulicaZamieszkania,
			String nrDomuZamieszkania, String kodPocztowyZamieszkania,
			String pocztaZamieszkania, String nrTelefonuZameldowania,
			String emailZameldowania, String miejscowoscZameldowania,
			String ulicaZameldowania, String nrDomuZameldowania,
			String kodPocztowyZameldowania, String pocztaZameldowania,
			String nrTelefonuKorespondencji, String emailKorespondencji,
			String miejscowoscKorespondencji, String ulicaKorespondencji,
			String nrDomuKorespondencji, String kodPocztowyKorespondencji,
			String pocztaKorespondencji, String nrKonta, String nazwaBanku,
			String wlascicielKonta, String sposobRealizacji) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.pesel = pesel;
		this.plec = plec;
		this.dataUrodzin = dataUrodzenia;
		this.stanCywil = stanCywilny;
		this.obywatelstwo = obywatelstwo;
		this.nrTelZamieszkania = nrTelefonuZamieszkania;
		this.emailZamieszkania = emailZamieszkania;
		this.miejscowoscZamieszkania = miejscowoscZamieszkania;
		this.ulicaZamieszkania = ulicaZamieszkania;
		this.nrDomuZamieszkania = nrDomuZamieszkania;
		this.kodPocztowyZamieszkania = kodPocztowyZamieszkania;
		this.pocztaZamieszkania = pocztaZamieszkania;
		this.nrTelZameldowania = nrTelefonuZameldowania;
		this.emailZameldowania = emailZameldowania;
		this.miejscowoscZameldowania = miejscowoscZameldowania;
		this.ulicaZameldowania = ulicaZameldowania;
		this.nrDomuZameldowania = nrDomuZameldowania;
		this.kodPocztowyZameldowania = kodPocztowyZameldowania;
		this.pocztaZameldowania = pocztaZameldowania;
		this.nrTelKorespondencji = nrTelefonuKorespondencji;
		this.emailKorespondencji = emailKorespondencji;
		this.miejscowoscKorespondencji = miejscowoscKorespondencji;
		this.ulicaKorespondencji = ulicaKorespondencji;
		this.nrDomuKorespondencji = nrDomuKorespondencji;
		this.kodPocztowyKorespondencji = kodPocztowyKorespondencji;
		this.pocztaKorespondencji = pocztaKorespondencji;
		this.nrKonta = nrKonta;
		this.nazwaBanku = nazwaBanku;
		this.wlascicielKonta = wlascicielKonta;
		this.sposobRealizacji = sposobRealizacji;
	}

	// osoba w rodzinie
	Osoba(String imie, String nazwisko, String pesel, String plec,
			String dataUrodzenia, String stanCywilny, String obywatelstwo,
			String nrTelefonuZamieszkania, String emailZamieszkania,
			String miejscowoscZamieszkania, String ulicaZamieszkania,
			String nrDomuZamieszkania, String kodPocztowyZamieszkania,
			String pocztaZamieszkania, String nrTelefonuZameldowania,
			String emailZameldowania, String miejscowoscZameldowania,
			String ulicaZameldowania, String nrDomuZameldowania,
			String kodPocztowyZameldowania, String pocztaZameldowania,
			String nrTelefonuKorespondencji, String emailKorespondencji,
			String miejscowoscKorespondencji, String ulicaKorespondencji,
			String nrDomuKorespondencji, String kodPocztowyKorespondencji,
			String pocztaKorespondencji, double dochodOpodatkowany,
			double dochodNieopodatkowany, double dochodZryczaltowany,
			double dochodUtracony, double dochodUzyskany) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.pesel = pesel;
		this.plec = plec;
		this.dataUrodzin = dataUrodzenia;
		this.stanCywil = stanCywilny;
		this.obywatelstwo = obywatelstwo;
		this.nrTelZamieszkania = nrTelefonuZamieszkania;
		this.emailZamieszkania = emailZamieszkania;
		this.miejscowoscZamieszkania = miejscowoscZamieszkania;
		this.ulicaZamieszkania = ulicaZamieszkania;
		this.nrDomuZamieszkania = nrDomuZamieszkania;
		this.kodPocztowyZamieszkania = kodPocztowyZamieszkania;
		this.pocztaZamieszkania = pocztaZamieszkania;
		this.nrTelZameldowania = nrTelefonuZameldowania;
		this.emailZameldowania = emailZameldowania;
		this.miejscowoscZameldowania = miejscowoscZameldowania;
		this.ulicaZameldowania = ulicaZameldowania;
		this.nrDomuZameldowania = nrDomuZameldowania;
		this.kodPocztowyZameldowania = kodPocztowyZameldowania;
		this.pocztaZameldowania = pocztaZameldowania;
		this.nrTelKorespondencji = nrTelefonuKorespondencji;
		this.emailKorespondencji = emailKorespondencji;
		this.miejscowoscKorespondencji = miejscowoscKorespondencji;
		this.ulicaKorespondencji = ulicaKorespondencji;
		this.nrDomuKorespondencji = nrDomuKorespondencji;
		this.kodPocztowyKorespondencji = kodPocztowyKorespondencji;
		this.pocztaKorespondencji = pocztaKorespondencji;
		this.dochodOpodatkowany = dochodOpodatkowany;
		this.dochodNieopodatkowane = dochodNieopodatkowany;
		this.dochodZryczaltowany = dochodZryczaltowany;
		this.dochodUtracony = dochodUtracony;
		this.dochodUzyskany = dochodUzyskany;
	}

	public void realizacja(String realizuj) {
		this.sposobRealizacji = realizuj;
	}

	public String pobierzRealizacja() {
		return sposobRealizacji;
	}

	public void Konto(String konto) {
		this.nrKonta = konto;
	}

	public String pobierzKonto() {
		return nrKonta;
	}

	public void ustawImie(String imie) {
		this.imie = imie;
	}

	public String pobierzImie() {
		return imie;
	}

	public void ustawNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String pobierzNazwisko() {
		return nazwisko;
	}

	public void ustawUliceZameldowania(String ulica) {
		this.ulicaZameldowania = ulica;
	}

	public String pobierzUliceZameldowania() {
		return ulicaZameldowania;
	}

	public void ustawNrDomuZameldowania(String nrDomu) {
		this.nrDomuZameldowania = nrDomu;
	}

	public String pobierzZameldowaniaNrDomu() {
		return nrDomuZameldowania;
	}

	public void ustawMiejscowoscZameldowania(String miejscowosc) {
		this.miejscowoscZameldowania = miejscowosc;
	}

	public String pobierzMiejscowoscZameldowania() {
		return miejscowoscZameldowania;
	}

	public void ustawPocztaZameldowania(String poczta) {
		this.pocztaZameldowania = poczta;
	}

	public String pobierzPocztaZameldowania() {
		return pocztaZameldowania;
	}

	public void ustawKodPocztowyZameldowania(String kodPocztowy) {
		this.kodPocztowyZameldowania = kodPocztowy;
	}

	public String pobierzKodPocztowyZameldowania() {
		return kodPocztowyZameldowania;
	}

	public void ustawEmailZameldowania(String email) {
		this.emailZameldowania = email;
	}

	public String pobierzEmailZameldowania() {
		return emailZameldowania;
	}

	public void telZameldowania(String tel) {
		this.nrTelZameldowania = tel;
	}

	public void ustawUliceKorespondencji(String ulica) {
		this.ulicaKorespondencji = ulica;
	}

	public String pobierzUliceKorespondencji() {
		return ulicaKorespondencji;
	}

	public void ustawNrDomuKorespondencji(String nrDomu) {
		this.nrDomuKorespondencji = nrDomu;
	}

	public String pobierzKorespondencjiNrDomu() {
		return nrDomuKorespondencji;
	}

	public void ustawMiejscowoscKorespondencji(String miejscowosc) {
		this.miejscowoscKorespondencji = miejscowosc;
	}

	public String pobierzMiejscowoscKorespondencji() {
		return miejscowoscKorespondencji;
	}

	public void ustawPocztaKorespondencji(String poczta) {
		this.pocztaKorespondencji = poczta;
	}

	public String pobierzPocztaKorespondencji() {
		return pocztaKorespondencji;
	}

	public void ustawKodPocztowyKorespondencji(String kodPocztowy) {
		this.kodPocztowyKorespondencji = kodPocztowy;
	}

	public String pobierzKodPocztowyKorespondencji() {
		return kodPocztowyKorespondencji;
	}

	public void ustawEmailKorespondencji(String email) {
		this.emailKorespondencji = email;
	}

	public String pobierzEmailKorespondencji() {
		return emailKorespondencji;
	}

	public void telKorespondencji(String tel) {
		this.nrTelKorespondencji = tel;
	}

	public void ustawUliceZamieszkania(String ulica) {
		this.ulicaZamieszkania = ulica;
	}

	public String pobierzUliceZamieszkania() {
		return ulicaZamieszkania;
	}

	public void ustawNrDomuZamieszkania(String nrDomu) {
		this.nrDomuZamieszkania = nrDomu;
	}

	public String pobierzZamieszkaniaNrDomu() {
		return nrDomuZamieszkania;
	}

	public void ustawMiejscowoscZamieszkania(String miejscowosc) {
		this.miejscowoscZamieszkania = miejscowosc;
	}

	public String pobierzMiejscowoscZamieszkania() {
		return miejscowoscZamieszkania;
	}

	public void ustawPocztaZamieszkania(String poczta) {
		this.pocztaZamieszkania = poczta;
	}

	public String pobierzPocztaZamieszkania() {
		return pocztaZamieszkania;
	}

	public void ustawKodPocztowyZamieszkania(String kodPocztowy) {
		this.kodPocztowyZamieszkania = kodPocztowy;
	}

	public String pobierzKodPocztowyZamieszkania() {
		return kodPocztowyZamieszkania;
	}

	public void ustawEmailZamieszkania(String email) {
		this.emailZamieszkania = email;
	}

	public String pobierzEmailZamieszkania() {
		return emailZamieszkania;
	}

	public void telZamieszkania(String tel) {
		this.nrTelZamieszkania = tel;
	}

	public void ustawId(int id) {
		this.id = id;
	}

	public Integer pobierzId() {
		return id;
	}

	public void ustawPesel(String pesel) {
		this.pesel = pesel;
	}

	public String pobierzPesel() {
		return pesel;
	}

	public void ustawDateUrodzenia(String dataUrodzenia) {
		this.dataUrodzin = dataUrodzenia;
	}

	public void ustawPlec(String plec) {
		this.plec = plec;
	}

	public String pobierzPlec() {
		return plec;
	}

	public void ustawdochodUzyskany(double dochodUzyskany) {
		this.dochodUzyskany = dochodUzyskany;
	}

	public Double pobierzdochodUzyskany() {
		return dochodUzyskany;
	}

	public void ustawdochodUtracony(double dochodUtracony) {
		this.dochodUtracony = dochodUtracony;
	}

	public Double pobierzdochodUtracony() {
		return dochodUtracony;
	}

	public void ustawdochodNieopodatkowane(double dochodNieopodatkowane) {
		this.dochodNieopodatkowane = dochodNieopodatkowane;
	}

	public Double pobierzdochodNieopodatkowane() {
		return dochodNieopodatkowane;
	}

	public void ustawdochodZryczaltowany(double dochodZryczaltowany) {
		this.dochodZryczaltowany = dochodZryczaltowany;
	}

	public Double pobierzdochodZryczaltowany() {
		return dochodZryczaltowany;
	}

}