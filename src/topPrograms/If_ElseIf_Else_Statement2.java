package classDemo;

public class If_ElseIf_Else_Statement2 {

	public static void main(String[] args) {
		int examScore=35;
		char examGrade;
		
		if(examScore>=90) {
	examGrade= 'A';		
	}
		else if (examScore>=80){
			examGrade= 'B';	
			} 
		else if (examScore>=70) {
				examGrade= 'C';			
	}
		else if (examScore>=60) {
			examGrade= 'D';
		}
		else if (examScore>=35) {
	examGrade= 'E';
		}
		else {
			examGrade='F';
		}
		System.out.println("The exam Grade is "+examGrade);
	}

}
