package com.company;

import com.company.algorithms.SortingAlgorithms;
import com.company.data_structures.queue.QueueUsingArray;
import com.company.data_structures.tree.BinaryTree;

import java.io.IOException;
import java.util.*;

public class Main {

	public static int operation(int v1, int v2, Character op){
		if(op.equals('+')){
			return v1 + v2;
		}
		else {
			return v1 - v2;
		}
	}

	public static int evalRPN(String tokens) {
		Stack<Integer> st = new Stack<>();

		for(int i = 0; i < tokens.length(); i++){
			Character s = tokens.charAt(i);
			if(s.equals('+') || s.equals('-')){
				int v2 = st.pop();
				int v1 = st.pop();
				int tempVal = operation(v1,v2,s);
				st.push(tempVal);
			}else{
				int x = Integer.parseInt(s.toString());
				st.push(x);
			}
		}
		int result = st.pop();
		return result;
	}

	public static String toPostfix(String s){
		Stack<Character> temp = new Stack<>();
		Stack<Character> ans = new Stack<>();
		Stack<Character> temp2 = new Stack<>();
		temp.push('(');
		for (int i=0;i<s.length();i++){
			if (s.charAt(i) == '+' || s.charAt(i) == '-'){
				temp.push(s.charAt(i));
			} else if (s.charAt(i) == '(') {
				while (!temp.empty() && temp.peek() != '(') {
					ans.push(temp.peek());
					temp.pop();
				}
				if (!temp.empty()) temp.pop();
			}else {
				ans.push(s.charAt(i));
			}
		}
		String str = new String("");
		while (!temp.empty()) {
			temp2.push(temp.peek());
			temp.pop();
		}
		while (!temp2.empty()) {
			str += temp2.peek();
			temp2.pop();
		}
		return str;
	}

	public static void main(String[] args) throws IOException {
		System.out.println(evalRPN(toPostfix("(1+(4+5+2)-3)+(6+8)")));
	}
}


