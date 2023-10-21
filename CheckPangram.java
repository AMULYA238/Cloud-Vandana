package codeVandana;

public class CheckPangram {
	public static boolean isPangram(String s) {
		boolean[] letters = new boolean[26];
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				letters[ch - 'a'] = true;
			}
		}
		for (boolean present : letters) {
			if (!present) {
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {
		String str = "Today is the good day as I hear good news";
		if (isPangram(str)) {
			System.out.println("It is a pangram");
		} 
		else {
			System.out.println("It is not Pangram");
		}
	}
}
