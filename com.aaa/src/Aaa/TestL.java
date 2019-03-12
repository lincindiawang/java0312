package Aaa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestL {

	public static void main(String[] args) {
		
		Random rand = new Random();
		List<Integer> l = new ArrayList<>();
		for ( int i =0; i<20; i++) {
			l.add(0);
		}
		
		for (int i = 0; i<10000; i++) {
			
			int r = rand.nextInt(20);
			int f = l.get(r);
			l.set(r, f+1);
			
			
		}
		
		System.out.println(l);

	}

}
