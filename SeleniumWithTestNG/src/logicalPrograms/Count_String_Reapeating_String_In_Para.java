package logicalPrograms;

import java.util.HashMap;
import java.util.Map;

public class Count_String_Reapeating_String_In_Para {

	public static void main(String[] args) {
		
		String str = "abc abcd abc abcd abc xyz abc abc xyz xyz xyz ab";
		String strArray[] = str.split(" ");
		
		HashMap<String, Integer> hs = new HashMap<String, Integer>();
		
		for(int i = 0 ; i<strArray.length; i++) {
			
			String s = strArray[i];
			if(hs.containsKey(s)) {
				hs.put(s, (hs.get(s)+1));
			}else {
				hs.put(s,1);
			}
		}
		
		for(Map.Entry<String, Integer> m : hs.entrySet()) {
			System.out.println(m.getKey() +" "+m.getValue()  );
		}
	}
}
