package EX1;

public class StudentApp {

	public static void main(String[] args) {
		
		//Array with length
		Student studentArray[] = new Student[5];
		 
	   //Using Constructor
        studentArray[0] = new Student("Amali","Bsc","0714567891");
		//studentArray[0].print();
		
		studentArray[1] = new Student("kamal","msc","0714563211");
		//studentArray[1].print();
		
		//using setters and getters
		studentArray[2]= new Student();
		studentArray[3]= new Student();
		studentArray[4]= new Student();
		
		studentArray[2].setName("Nimal");
		studentArray[2].setDegree("MSc");
		studentArray[2].setMobile("0112365489");
		//studentArray[2].print();
		
		studentArray[3].setName("Kamal");
		studentArray[3].setDegree("PHd");
		studentArray[3].setMobile("0112365489");
		//studentArray[3].print();
		
		studentArray[4].setName("Sunil");
		studentArray[4].setDegree("MSc");
		studentArray[4].setMobile("0352365489");
		//studentArray[4].print();
		
		for(int i=0;i<=4;i++) {
			studentArray[i].print();
		}
	}
	
	

}
