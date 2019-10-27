package curriculumvitae;

import java.util.ArrayList;

public class Experience<E extends Parcurs> {
	private ArrayList<E> joburi = new ArrayList<>();
	
	public Experience() {
		this.joburi = new ArrayList<E>();
	}
	
	public Experience(ArrayList<E> joburi) {
		this.joburi = joburi;
	}
	
	public ArrayList<E> getJoburi(){
		return joburi;
	}
	
	public boolean addJob(E job) {
		if (joburi.contains(job)) {
			return false;
		}
		 
		joburi.add(job);
		return true;
	}
	  
	public String toString() {
		String xp = "";
		for (int i = 0; i<joburi.size(); i++) {
			xp += joburi.get(i).toString();
		}
		return xp;
	}
}
