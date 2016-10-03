package br.com.ocpjp7.capitulo5.teste1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Teste1 {
	
	public static void main(String[] args) {
		
		String targetString = "I am fine to dine to nine";
		
		String regex = "[fdn]ine";
		
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(targetString);
		
		while (matcher.find()) {
			
			System.out.print(matcher.group());
			System.out.print(" ");
			System.out.print(matcher.start());
			System.out.print(" ");
			System.out.print(matcher.end());
			System.out.print(" ");
		
		}
		
	}
	
}