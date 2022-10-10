package com.fqh.java.homework.lab3;

public class SeqStack implements Stack{
	final int defaultSize = 10;
	int top;
	Object[] stack;
	int maxStackSize;
	
	public SeqStack(){
		initiate(defaultSize);
	}
	
	public SeqStack(int sz){
		initiate(sz);
	}
	
	private void initiate(int sz){
		maxStackSize = sz;
		top = 0;
		stack = new Object[sz];
	}
	
	public void push(Object obj) throws Exception{
		if(top == maxStackSize){
			throw new Exception("栈已满, 不能再添加元素");
		}
		stack[top] = obj;
		top ++;
	}
	
	public Object pop() throws Exception{
		if(top == 0){
			throw new Exception("栈为空");
		}
		top --;
		return stack[top];
	}
	
	public Object getTop() throws Exception{
		if(top == 0){
			throw new Exception("栈顶为空");
		}
		return stack[top - 1];
	}
	
	public boolean notEmpty(){
		return (top > 0);
	}
}