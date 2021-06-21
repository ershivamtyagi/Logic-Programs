package com.le.thread;

class A {
	public synchronized void a(B b) {
		System.out.println(Thread.currentThread().getName()+"Start Execution of a() method");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		b.last();
	}

	public synchronized void last() {
		System.out.println("A Class Last method");
	}
}

class B {

	public synchronized void b(A a){
		System.out.println(Thread.currentThread().getName()+"Start Execution of b() method");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		a.last();
	}

	public synchronized void last() {
		System.out.println("B Class Last method");
	}
}

public class DeadLock {

	A aObj = new A();
	B b = new B();
	Thread t = new Thread() {
		public void run() {
			//t required the lock of class A obj to call the synchronized method of a 
			aObj.a(b);
		}
	};
	Thread t1 = new Thread() {
		public void run() {
			b.b(aObj);
		}
	};

	public static void main(String[] args) {
		new DeadLock().startThrads();
	}

	private void startThrads() {
		t.start();
		t1.start();
	}
}
