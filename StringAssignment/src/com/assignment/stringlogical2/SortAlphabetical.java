 package com.assignment.stringlogical2;

public class SortAlphabetical {


		static boolean sortAlpha(String s) {
			int ct=1;
			System.out.println(s);
			String[] str=s.split("\\s");
			boolean flag;
			for (int i = 0; i < str.length; i++) {
				flag=true;
				if(str[i].length()>3) {
					for (int k = 0; k < str[i].length(); k++) {
						for (int j = k+1; j < str[i].length(); j++) {
							if(str[i].charAt(k)>str[i].charAt(j)) {
								flag=false;
								break;
							}
						}
					}
				}else {
					flag=false;
				}
				if(flag) {
					return flag;
				}
			}
			return false;
		}
		public static void main(String[] args) {
			String str1="Paula has a French accent";
			System.out.println(sortAlpha(str1));

			String str2="The biopsy returned negative results";
			System.out.println(sortAlpha(str2));
			String str3="She sells sea shells by the sea shore";
			System.out.println(sortAlpha(str3));
		}
	}

	


