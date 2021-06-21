package com.le.thread;
//Question asked in wallmart 1st round
class Test implements Runnable{
     Integer counter;
    Test(Integer counter){
        this.counter=counter;
    }

    public void run(){
        for(int i=0;i<100;i++){
                counter = counter + 1;
            System.out.println("Thread id - "+ Thread.currentThread().getId() + "counter : " + counter);
        }

    }

}
class A1{
	public void a() {
		
	}
}
class B1 extends A1{
	public void b() {
		
	}
}
public class Runner{
    public static void main(String[] args) {
    	/////////
        Integer i= 0;
        Test t = new Test(i);
        Thread t1= new Thread(new Test(0));
        Thread t2= new Thread(new Test(0));
        Thread t3= new Thread(new Test(0));

        t1.start();
        t2.start();
        t3.start();
        //////////
        A1 a = new B1();
    	((B1)a).b();
    	///////
    	A1 a1 = new A1();
    	((B1)a1).b();
    	//////////
    	A1 a2 = new A1();
//    	a2.b();
    }
}