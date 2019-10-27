package curriculumvitae;

public class JavaJunior extends Candidate {
	
	public JavaJunior(Nume numePrenume, Date dataNasterii, Experience<Parcurs> experienta) {
		super(numePrenume, dataNasterii, experienta);
	}
	
	public JavaJunior(Nume numePrenume, Date dataNasterii) {
		super(numePrenume, dataNasterii);
	}
	
	public String toString() {
		return super.toString();
	}
	
}
