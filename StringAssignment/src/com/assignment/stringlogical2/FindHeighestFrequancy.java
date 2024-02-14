package com.assignment.stringlogical2;

import java.util.Arrays;

public class FindHeighestFrequancy {
	
	static void mostrepet(String s) {
		String[] ar = s.split(" ");
		int ct;
		String[] max = new String[400];
		int[] mxct = new int[400];
		int mxin = 0, mx = 0;
		boolean flag;
		for (int k = 0; k < ar.length; k++) {
			ct = 0;
			flag = false;
			for (int i = k - 1; i >= 0; i--) {
				if (ar[i].equals(ar[k])) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				for (int j = k + 1; j < ar.length; j++) {
					if (ar[k].equals(ar[j])) {
						ct++;

					}

				}
				if (ct > 1) {
					mxct[mxin++] = ct;
					max[mx++] = ar[k];
				}

			}
		}
		for (int i = 0; i < mx; i++) {
			System.out.println(max[i] + " ");
		}

	}
	

	

		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String str = "world is a very big world is beutyful world is wonderful";
			mostrepet(str);
		}

	}


