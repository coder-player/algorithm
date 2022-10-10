package com.fqh.java.homework.lab4_I;

public class Element implements Comparable<Element> {
	private static final long SHIFT= 3 * 60 * 1000;
	private Object elem;						//原先意义上的数据元素
	private int priority;						//优先级
	private long time;

	Element(Object obj, int i){					//构造函数
		elem = obj;
		priority = i;
		time = System.currentTimeMillis(); //对象创建的时间

	}
	public Object getElem(){
		return elem;
	}

	public void setElem(Object obj){
		elem = obj;
	}

	public int getPriority(){
		return priority;
	}

	public void setPriority(int i){
		priority = i;
	}

	//出现的时间又早优先级又低-->先被消费
	@Override
	public int compareTo(Element o) {
		long th = this.time - this.priority * SHIFT;
		long ot = o.time - o.priority * SHIFT;
		if (th < ot) {
			return 1;
		}
		if (th > ot) {
			return -1;
		}
		return 0;
	}
}
