package com.src;

public class StudentMarks 
{
	
	String name;
	int maths,science,social,total;
    float per;
    String grade;
    public StudentMarks(String name, int maths, int science, int social) {
		super();
		this.name = name;
		this.maths = maths;
		this.science = science;
		this.social = social;
		total=maths+science+social;
		per=total/3;
		if(per>=80)
		{
			grade="A";
		}
		else if(per>=70 && per<80)
		{
			grade="B";
		}
		else if(per>=50 && per<70)
		{
			grade="C";
		}
		else if(per>=35 && per<50)
		{
			grade="D";
		}
		else 
		{
			grade="F";
		}
		
    }
	@Override
	public String toString() {
		return "StudentMarks [name=" + name + ", maths=" + maths + ", science=" + science + ", social=" + social
				+ ", total=" + total + ", per=" + per + ", grade=" + grade + "]";
	}
	
    
	
	
    
}
