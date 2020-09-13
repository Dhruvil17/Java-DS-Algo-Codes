package ClassesObjects;

public class Students {

	// Attributes
	String studentname;
    String studentid;
    String degreetype;
    String degreename;  
    int semester,year;
    static float cgpa;
    
    // Constructor
    public Students(String studentname,String studentid,String degreetype,String degreename,int semester,int year,float cgpa)
    {
        this.studentname = studentname;
        this.studentid = studentid;
        this.degreetype = degreetype;
        this.degreename = degreetype;  
        this.semester = semester;
        this.year = year;
        this.cgpa = cgpa;
    }
	
	public String getStudentname() {
		System.out.println("Name of Student is "+studentname);
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getStudentid() {
		System.out.println("ID of Student is "+studentid);
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public String getDegreetype() {
		System.out.println("ID of Student is "+studentid);
		return degreetype;
	}

	public void setDegreetype(String degreetype) {
		this.degreetype = degreetype;
	}

	public String getDegreename() {
		return degreename;
	}

	public void setDegreename(String degreename) {
		this.degreename = degreename;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public float getCgpa() {
		return cgpa;
	}

	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	public String description()
	{
		return "My name is "+this.studentname+"\nMy ID is "+this.studentid+"\nMy degree type is "+this.degreetype+"\nMy Cgpa is "+cgpa;
	}

	public static void main(String[] args) {
		
	     Students students = new Students("Dhruvil","19BCP032","CS","B.Tech",3,2,(float)9.68);
	     System.out.println(students.description());
	     students.cgpa=10;
	     students.setCgpa(10);
	     System.out.println(students.cgpa);
	}
}
