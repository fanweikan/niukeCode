package 剑指offer;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class a {
	
	public static int firstUniqChar(String s) {
		// TODO Auto-generated method stub
		int[] value = new int[2];
		value[0] = 0;
        value[1] = 0;
        Map<Character,int[]> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            if (map.containsKey(Character.valueOf(s.charAt(i)))) {
            	Character key = s.charAt(i);
                value = map.get(key);
                value[1] = value[1] + 1;
                map.put(key,value);
                System.out.println("key:"+key+"   value:"+ value[1]);
            } else {
            	Character key = Character.valueOf(s.charAt(i));
                value[0] = i;
                value[1] = 1;
                map.put(key, value);
                System.out.println("key:"+key+"   value:"+ value[1]);
            }
        }
        Set<Character> set = map.keySet();
        for (Character in : set) {
        	value = map.get(in);
//       	System.out.println("value[1]:" + value[1]);
        	if (value[1] == 1) {
        		System.out.println("value[0]:" + value[0]);
        		return value[0];
        	}
        }
        return value[0];
	}
	public static void main(String[] args) {
		String s = "leetetee";
		int i = firstUniqChar(s);
		System.out.println(i);
	}
}


