package Aaa;

import java.util.HashSet;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Random;
import java.util.Set;

public class TeatS {

	public static void main(String[] args) {
		Random rand = new Random();
		Set<Integer> l = new HashSet<>();
		int[] f = new int[20];
		for (int i = 0; i<10000; i++) {
			int r = rand.nextInt(20);
			l.add(r);
			f[r]++;
		}
		for (int i= 0; i< f.length; i++) {
			System.out.println(i+":"+f[i]);
		}

	}

}
