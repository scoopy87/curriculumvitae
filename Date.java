package curriculumvitae;

public class Date{

	private final int zi;
	private final String luna;
	private final int an;
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		if (an != other.an)
			return false;
		if (luna == null) {
			if (other.luna != null)
				return false;
		} else if (!luna.equals(other.luna))
			return false;
		if (zi != other.zi)
			return false;
		return true;
	}

	public Date(int zi, String luna, int an) {
		this.zi = zi;
		this.luna = luna;
		this.an = an;;
	}
	
	public Date(int an) {
		this(0, "", an);
	}
	
	public String toString() {
		if (an == 0) {
			return "Present:";
		}
		
		if (zi == 0) {
			return this.luna + ", " + this.an + "";
		}
		
		switch (zi) {
			case 1:
			case 21:
			case 31:
				return this.luna + " " + this.zi + "st, " + this.an;
			case 2:
			case 22:
				return this.luna + " " + this.zi + "nd, " + this.an;
			case 3:
			case 23:
				return this.luna + " " + this.zi + "rd, " + this.an;
			default:
				return this.luna + " " + this.zi + "th, " + this.an;
		}

	}
}
