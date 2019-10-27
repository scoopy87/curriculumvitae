package curriculumvitae;

public class Nume {
	private final String nume;
	private final String prenume;
	
	public Nume(String nume, String prenume) {
		this.nume = nume;
		this.prenume = prenume;
	}
	
	public String toString() {
		return prenume + " " + nume;
	}
}
