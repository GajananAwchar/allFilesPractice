package interfaceConcept;

import interfaceConcept.Automobile.ElectricAutomobile;

// interface Concept
interface Automobile{  // interface
	void getPowerSource(String name);
	// class implements interface
	class ElectricAutomobile implements Automobile {  
		@Override
		public void getPowerSource(String name) {
			System.out.println("power source of Electric Automobile is :"+name);
		}
		}
	}

public class Test_Demo extends ElectricAutomobile {

	public static void main(String[] args) {
		Test_Demo t= new Test_Demo();
		t.getPowerSource("Electric Power");
		
	}

}
