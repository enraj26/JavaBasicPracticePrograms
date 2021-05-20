package com.codewithraju.java.basics.example.threads;

public class ThreadPriority {
	public static void main(String[] args) throws InterruptedException {
		
		// Consider the thread example declared below:
		class ThreadExample extends Thread {
			public void run() {
				for (int i = 0; i < 1000; i++)
					System.out.println(this.getName() + " Running " + i);
			}
		}

		
		ThreadExample thread1 = new ThreadExample();
		thread1.setPriority(8);

		// Java also provides predefined constants Thread.MAX_PRIORITY(10),
		// Thread.MIN_PRIORITY(1), Thread.NORM_PRIORITY(5) which can be used to
		// assign priority to a thread.

		// Thread Join method
		// Join method is an instance method on the Thread class. Let's see a
		// small example to understand what join method does.

		// Lets consider the thread's declared below : thread2, thread3, thread4

		ThreadExample thread2 = new ThreadExample();
		ThreadExample thread3 = new ThreadExample();
		ThreadExample thread4 = new ThreadExample();

		// We would want to run thread2 and thread3 in parallel but thread4 can
		// only run when thread3 is finished. This can be achieved using join
		// method. Look at the example code below.
		thread3.start();
		thread2.start();
		thread3.join();// wait for thread 3 to complete
		System.out.println("Thread3 is completed.");
		thread4.start();

		// thread3.join() method call force the execution of main method to stop
		// until thread3 completes execution. After that, thread4.start() method
		// is invoked, putting thread4 into a Runnable State.

		// Overloaded Join method
		// Join method also has an overloaded method accepting time in
		// milliseconds as a parameter.
		thread4.join(2000);
		// In above example, main method thread would wait for 2000 ms or the
		// end of execution of thread4, whichever is minimum.

		
	}

}
