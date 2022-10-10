package com.fqh.java.homework.lab4_II;

public class SeqPQueue{

	static final int defaultSize = 10;
	int front;									//队头
	int rear; 									//队尾
	int count;									//计数器
	int maxSize;								//元素最大个数
	Element[] data;								//数据元素
	private static final int INCR_VALUE = 10; //增量

	public SeqPQueue(){							//无参构造函数
		this.initiate(10);
	}

	public SeqPQueue(int sz){
		this.initiate(sz);  //带参构造函数
	}

	private void initiate(int sz){				//初始化
		maxSize = sz;
		front = rear = 0;
		count = 0;
		data = new Element[sz];
	}

	//每次append元素给最低优先级加优先级
	public void updatePriority() {
		int minPriorityIndex = 0; //最低优先级的索引
		for (int i = 1; i < this.count; i++) {
			if (data[i].getPriority() < data[minPriorityIndex].getPriority()) {
				minPriorityIndex = i;
			}
		}
		//给最低优先级的加优先级
		data[minPriorityIndex].setPriority(data[minPriorityIndex].getPriority() + INCR_VALUE);
	}

	public void append(Object obj) throws Exception{		//插入
		if(count >= maxSize){
			throw new Exception("队列已满！");
		}
		data[rear] = (Element)obj;				//插在队尾
		rear = rear + 1;
		updatePriority(); //每执行一次append就给最低优先级加优先级
		count ++;
	}

	public Element delete() throws Exception{		//删除
		if(count == 0){
			throw new Exception("队列已空！");
		}

		//寻找优先级最小的数据元素，且保存在临时变量min中
		Element min = data[0];
		int minIndex = 0;
		for(int i = 1; i < count; i ++) {
			if (data[i].getPriority() < min.getPriority()) {
				min = data[i];
				minIndex = i;
			}
		}

		//从优先级最小数据元素的下标minIndex+1开始至count依次移位
		for (int i = minIndex + 1; i < count; i++){
			data[i - 1] = data[i];
		}
		rear = rear - 1;
		count --;
		return min;						//返回优先级最小的数据元素
	}

	public Object getFront() throws Exception{		//取队头数据元素
		if(count == 0){
			throw new Exception("队列已空！");
		}

		//寻找优先级最小的数据元素，且保存在临时变量min中
		Element min = data[0];

		for(int i = 0; i < count; i ++){
			if(data[i].getPriority() < min.getPriority()){
				min = data[i];

			}
		}
		return min; 						//返回优先级最小的数据元素
	}

	public boolean notEmpty(){						//非空否
		return count != 0;
	}
}



