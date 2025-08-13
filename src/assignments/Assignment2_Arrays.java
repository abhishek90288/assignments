package assignments;

public class Assignment2_Arrays {

	public static void main(String[] args) {
		
		String  [][][]academics= new String [5][6][6];
		
		//Semester1-->With all subjects
		
		academics[0][0][0]="\n Mathematics I |Pass | 78"; 
		academics[0][0][1]="\n Physics |Pass | 85";
		academics[0][0][2]="\n Chemistry |Fail | 21";
		academics[0][0][3]="\n Computer Programming |Pass | 74";
		academics[0][0][4]="\n Engineering Drawing |Pass | 88";
		academics[0][0][5]="\n Basic Electrical Engineering |Pass | 79";
		
		//Semester2-->With all subjects

		academics[1][1][0]="\n Mathematics II  |Pass | 82"; 
		academics[1][1][1]="\n Mechanics |Pass | 77 ";
		academics[1][1][2]="\n Environmental Sceince |Pass | 93";
		academics[1][1][3]="\n Basic Electronics |Fail | 19";
		academics[1][1][4]="\n Engineering Physics |Fail | 24";
		academics[1][1][5]="\n Engineering Graphics |Pass | 90";
		
		
		//Semester3-->With all subjects
		
		academics[2][2][0]="\n Data Structure  |Pass | 88"; 
		academics[2][2][1]="\n Discrete Mathematics |Pass | 81 ";
		academics[2][2][2]="\n Digital Electronics |Pass | 76";
		academics[2][2][3]="\n Operating Systems |Fail | 32";
		academics[2][2][4]="\n Signals and Systems|Pass | 85";
		academics[2][2][5]="\n Object Orirnted Programming |Pass | 78";
		
		//Semester4-->With all subjects
		
		
		academics[3][3][0]="\n Algorithms  |Pass | 91"; 
		academics[3][3][1]="\n Computer Networks |Pass | 73 ";
		academics[3][3][2]="\n Database Systems |Fail | 19";
		academics[3][3][3]="\n Microprocessors |Pass | 80";
		academics[3][3][4]="\n Communication Engineering |Pass | 76";
		academics[3][3][5]="\n Software Engineering |Pass | 87";
		
		
		//Semester5-->With all subjects
		
		academics[4][4][0]="\n Probability and Stats  |Pass | 86"; 
		academics[4][4][1]="\n Machine Learning |Pass | 88 ";
		academics[4][4][2]="\n Compiler Design |Pass | 84";
		academics[4][4][3]="\n Theory of Computation |Pass | 95";
		academics[4][4][4]="\n Embedded Systems |Pass | 73";
		academics[4][4][5]="\n Computer Graphics |Pass | 90";
				
				
//Printing Semester 2 subject 4 and 5 names
				
System.out.println("\n Semester 2: Subject 4 and 5 names:"+ academics[1][1][3] + academics[1][1][4]+ "\n");

//Semester 4 status and marks for subject 3 and subject 6

System.out.println("\n Semester 4: Subject 3 and 6 names:"+ academics[3][3][2] + academics[3][3][5]+ "\n");

		
System.out.println("Semister 1 marks : "+ academics [0][0][0] + academics[0][0][1] +academics[0][0][2]+academics[0][0][3]+academics[0][0][4]+academics[0][0][5]);
System.out.println("\n=================================\n");
System.out.println("Semister 2 marks : "+ academics [1][1][0] + academics[1][1][1] +academics[1][1][2]+academics[1][1][3]+academics[1][1][4]+academics[1][1][5]);
System.out.println("\n=================================\n");
System.out.println("Semister 3 marks : "+ academics [2][2][0] + academics[2][2][1] +academics[2][2][2]+academics[2][2][3]+academics[2][2][4]+academics[2][2][5]);
System.out.println("\n=================================\n");
System.out.println("Semister 4 marks : "+ academics [3][3][0] + academics[3][3][1] +academics[3][3][2]+academics[3][3][3]+academics[3][3][4]+academics[3][3][5]);
System.out.println("\n=================================\n");
System.out.println("Semister 5 marks : "+ academics [4][4][0] + academics[4][4][1] +academics[4][4][2]+academics[4][4][3]+academics[4][4][4]+academics[4][4][5]);


	
	
	

		
		
		

	}

}
