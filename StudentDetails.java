package Collection;

public class StudentDetails {

	int stdId;
	String stNname;
	int stdAge;
	int stdMarks;
	
	public StudentDetails(int stdId, String stNname, int stdAge, int stdMarks) {
		super();
		this.stdId = stdId;
		this.stNname = stNname;
		this.stdAge = stdAge;
		this.stdMarks = stdMarks;
	}

	@Override
	public String toString() {
		return "StudentDetails [stdId=" + stdId + ", stNname=" + stNname + ", stdAge=" + stdAge + ", stdMarks="
				+ stdMarks + "]";
	}
	
	
	
	
	
	
	
	
}
