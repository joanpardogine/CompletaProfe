package Objectes;

public class Persona {
	//Definició d'atributs
	private String nomPers;
	private Adressa adressaPers;
	private String telefon;
	private String correuElectronic;

	//SETTERS

	public Persona(String nomPersRebut,
			Adressa adressaRebuda,
			String telefonRebut,
			String correuElectronicRebut) {

		this.nomPers = nomPersRebut;
		this.adressaPers = adressaRebuda;
		this.telefon = telefonRebut;
		this.correuElectronic = correuElectronicRebut;
	}

	public String getNomPers() {
		return nomPers;
	}

	public void setNomPers(String nomPers) {
		this.nomPers = nomPers;
	}

	public Adressa getAdressaPers() {
		return adressaPers;
	}

	public void setAdressaPers(Adressa adressaPers) {
		this.adressaPers = adressaPers;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getCorreuElectronic() {
		return correuElectronic;
	}

	public void setCorreuElectronic(String correuElectronic) {
		this.correuElectronic = correuElectronic;
	}

	@Override
	public String toString() {
		return "Persona\n" +
				"   nom =" + this.nomPers +
				"   adressa          = " + this.adressaPers + "\n" +
				"   correuElectronic = " + this.correuElectronic + "\n" +
				"   telefon          = " + this.telefon + "\n";
	}

}
