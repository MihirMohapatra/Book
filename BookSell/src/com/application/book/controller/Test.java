package com.application.book.controller;

public class Test {
public static void main(String[] args) {
	  String str = "abcbaba";// abcba, bcb, bab, aba
	  int len = str.length();
	  for(int i=0; i<len; i++) {
		  if(str.substring(0, len-1).contains("abcba")) {
			  return null;
		  }
	  }
}
}
