package map;

import java.util.HashMap;
import java.util.Map;

public class LearningMap {

	public static void main(String[] args) {
		Map<Character, Integer> Compname = new HashMap<Character, Integer>();
		//Compname.put(Cognizant, 01);
		//System.out.println(Compname);
		String Companyname = "Cognizant";
		//System.out.println(Companyname.length());
		//int length =Companyname.length();
		char[] eachchar = Companyname.toCharArray();
		for(int i=0;i<eachchar.length; i++){
			char chr2=Companyname.charAt(i);
		Compname.put(chr2, 1);
		System.out.println(chr2);
		}
		
	}

}
