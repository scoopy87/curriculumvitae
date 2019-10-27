package curriculumvitae;

public abstract class Candidate {
	private Nume numePrenume;
	private Date dataNasterii;
	private Experience<Parcurs> experienta; 
	
	protected Candidate(Nume numePrenume, Date dataNasterii, Experience<Parcurs> experienta) {
		this.numePrenume = numePrenume;
		this.dataNasterii = dataNasterii;
		this.experienta = experienta;

	}
	
	protected Candidate(Nume numePrenume, Date dataNasterii) {
		this(numePrenume, dataNasterii, null);
	}
	
	protected Candidate(Nume numePrenume) {
		this(numePrenume, null);
	}
	
	Nume getNumePrenume() {
		return numePrenume;
	}

	void setNumePrenume(Nume numePrenume) {
		this.numePrenume = numePrenume;
	}

	Date getDataNasterii() {
		return dataNasterii;
	}

	void setDataNasterii(Date dataNasterii) {
		this.dataNasterii = dataNasterii;
	}

	Experience<Parcurs> getExperienta() {
		return experienta;
	}
	
	void setExperienta(Experience<Parcurs> experienta) {
		this.experienta = experienta;
	}
	
	public String toString() {
		return "Name: " + getNumePrenume() + " | Birthdate: " + getDataNasterii() + 
				"\n\nWork & Education:\n" + getExperienta();
	}
}
