package curriculumvitae;

public abstract class Parcurs {
	private final Date dataInceput;
	private final Date dataFinal;
	private final String firma;
	private final String rol;
	private String atributii;
	
	public Parcurs(Date dataInceput, Date dataFinal, String firma, String rol, String atributii) {
		this.dataInceput = dataInceput;
		this.dataFinal = dataFinal;
		this.firma = firma;
		this.rol = rol;
		this.atributii = atributii;
	}
	
	public Parcurs(Date dataInceput, Date dataFinal, String firma, String rol) {
		this(dataInceput, dataFinal, firma, rol, " ");
	}
	
	public void setAtributii(String atributii) {
		this.atributii = atributii;
	}
	
	public String toString() {
		return "\n" + dataInceput + " -> " + dataFinal + " \"" + firma + "\"" + " | " + rol +
				"\n" + atributii;
	}
	
	public String getXP() {
		return firma + " " + rol;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parcurs other = (Parcurs) obj;
		if (dataFinal == null) {
			if (other.dataFinal != null)
				return false;
		} else if (!dataFinal.equals(other.dataFinal))
			return false;
		if (dataInceput == null) {
			if (other.dataInceput != null)
				return false;
		} else if (!dataInceput.equals(other.dataInceput))
			return false;
		if (firma == null) {
			if (other.firma != null)
				return false;
		} else if (!firma.equals(other.firma))
			return false;
		if (rol == null) {
			if (other.rol != null)
				return false;
		} else if (!rol.equals(other.rol))
			return false;
		return true;
	}
	
	
}
