package logicalPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections4.map.HashedMap;

public class Count_Reapeating_Char_In_String_Using_Hashmap {

//		public static void main(String[] args) {
//			String str = "abcabcaaad";
//			
//			HashedMap<Character , Integer> hm = new HashedMap<Character , Integer>();
//			
//		for(int i =0; i<str.length(); i++) {
//			char charValue = str.charAt(i);
//			
//			if(hm.containsKey(charValue)) {
//				hm.put(charValue, (hm.get(charValue)+1));
//			}else {
//				hm.put(charValue, 1);
//			}
//		}
//		
//		Set<Character> keys = hm.keySet();
//				for(Character key:keys) {
//					System.out.println(key +" "+ hm.get(key));
//				}
//		
//		
//		}

	public static void main(String[] args) {
		String str = "abbvscaaabeefkhr";
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		
		for(int i = 0 ; i<str.length(); i++) {
			char singleChar = str.charAt(i);
			
			if(hashmap.containsKey(singleChar)) {
				hashmap.put(singleChar, (hashmap.get(singleChar)+1));
			}else {
				hashmap.put(singleChar, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> m : hashmap.entrySet()) {
			System.out.println(m.getKey()+" "+ m.getValue());
		}
	}
}
