package com.le.main;

import java.util.HashSet;
import java.util.Set;

public class Client {

	public String longestSubstringWithKDistinctCharacter(String str,int k){
		String currentLongestSubstring ="";
		Set<String> set = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {

			for (int j = 0; 1+1 < str.length()+1; j++) {
			String subsstring=	str.substring(i, j);
			set.add(subsstring);
			if(set.size()==k) {
//				if(subsstring.length())
			}else {
				
			}
			}
		}

	}
}
