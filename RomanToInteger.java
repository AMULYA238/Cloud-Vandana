//Enter a Roman Number as input and convert it to an integer.
package codeVandana;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Character, Integer> hm = new HashMap<>();
		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		hm.put('L', 50);
		hm.put('C', 100);
		hm.put('D', 500);
		hm.put('M', 1000);
		System.out.println("Enter the Roman Number:");
		String roman = sc.next();
		int n = roman.length();
		int num = 0;
		for (int i = 0; i < n; i++) {
			int first = hm.get(roman.charAt(i));
			int last = (i + 1 < n) ? hm.get(roman.charAt(i + 1)) : 0;
			if (first < last) {
				num -= first;
			} else {
				num += first;
			}
		}
		System.out.println("Integer value of " + roman + " is " + num);
		sc.close();
	}

}
