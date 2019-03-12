package Aaa;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		Random rand = new Random(100000);
		Map<Integer, Integer> m = new HashMap<>();
		for(int i= 0; i < 100000; i++) {
			int a = rand.nextInt(20);
			Integer freq = m.get(a);
			if (freq == null) {
				m.put(a, 1);
			}
			else {
				m.put(a, freq+1);
				
			}
			
		}
		System.out.println(m);

	}

}
