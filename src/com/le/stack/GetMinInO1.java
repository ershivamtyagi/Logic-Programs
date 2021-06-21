package com.le.stack;

import java.util.Stack;

public class GetMinInO1 extends Stack<Integer>{

//	static Stack<Integer> mainStack = new Stack<>();
	static Stack<Integer> minStack = new Stack<>();
	public Integer push(Integer value) {
		if(this.isEmpty()) {
			 minStack.push(value);
		} else {
			if (minStack.peek() > value) {
				minStack.push(value);
			} else {
				minStack.push(minStack.peek());
			}
		}
		return super.push(value);
	}
	@Override
	public Integer pop() {
		if(this.isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		minStack.pop();
		return super.pop();
	}
	public Integer getMin() {
		return minStack.peek();
	}
	
	public static void main(String[] args) {
		GetMinInO1 getMinInO1 = new GetMinInO1();
		getMinInO1.push(4);
		getMinInO1.push(2);
		getMinInO1.push(5);
		getMinInO1.push(8);
		getMinInO1.push(3);
		getMinInO1.push(1);
		System.out.println(getMinInO1.getMin());
		getMinInO1.pop();
		System.out.println(getMinInO1.getMin());
		
		
	}
}
