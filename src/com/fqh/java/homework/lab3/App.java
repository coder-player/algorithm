package com.fqh.java.homework.lab3;
import java.lang.Character;
import java.util.Scanner;

public class App {
	@SuppressWarnings("removal")
	private static boolean isSym(String inputStr) throws Exception {

		SeqStack stack = new SeqStack(inputStr.length());
		char[] chars = inputStr.toCharArray();
		for (char c : chars) {
			stack.push(c);
		}
		for (char c : chars) {
			if (c != (Character) stack.pop()) {
				return false;
			}
		}
		return true;
	 }
	 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = null;
		
		System.out.println("输入一个字符串: ");
		
		str = s.next();
		
		try {
			if(isSym(str)) {
				System.out.println("是回文串");
			}
			else {
				System.out.println("不是回文串");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	} // end main()
}
