
public class TeaParty {

	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		String greeting;
		if(isWoman == true) {
			 greeting = "Hello Ms. " + name;
		}
		else {
			greeting = "Hello Mr. " + name;
		}
		if(isKnighted == true) {
			greeting = "Hello Sir " + name;
		}
		return greeting;
	}
   
		

       }
       
