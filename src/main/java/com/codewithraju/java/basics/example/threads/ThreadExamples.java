package com.codewithraju.java.basics.example.threads;

public class ThreadExamples {
	public static void main(String[] args) {
		

		// Look at the Java code below
		downloadAndStoreBattingStatistics();
		downloadAndStoreBowlingStatistics();
		downloadAndStoreFieldingStatistics();

		mergeAndAnalyze();

		
		class BattingStatisticsThread extends Thread {
			// run method without parameters
			public void run() {
				for (int i = 0; i < 1000; i++)
					System.out.println("Running Batting Statistics " + i);
			}
		}

		
		class BowlingStatisticsThread implements Runnable {
			// run method without parameters
			public void run() {
				for (int i = 0; i < 1000; i++)
					System.out.println("Running Bowling Statistics " + i);
			}
		}

		// Starting or Running a Thread
		// When using inheritance. Create an object and call start method.
		BattingStatisticsThread battingThread1 = new BattingStatisticsThread();
		battingThread1.start();

		// When implementing RunnableInterface.
		// Create an object, then a Thread object having implementation of
		// interface as constructor argument
		// and call start method on thread object.
		BowlingStatisticsThread battingInterfaceImpl = new BowlingStatisticsThread();
		Thread battingThread2 = new Thread(battingInterfaceImpl);
		battingThread2.start();

	}

	private static void mergeAndAnalyze() {
		// TODO Auto-generated method stub

	}

	private static void downloadAndStoreBattingStatistics() {
		// TODO Auto-generated method stub

	}

	private static void downloadAndStoreFieldingStatistics() {
		// TODO Auto-generated method stub

	}

	private static void downloadAndStoreBowlingStatistics() {
		// TODO Auto-generated method stub

	}
}
