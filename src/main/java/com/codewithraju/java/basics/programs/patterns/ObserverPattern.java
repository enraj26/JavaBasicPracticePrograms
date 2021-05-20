package com.codewithraju.java.basics.programs.patterns;

import java.util.ArrayList;
import java.util.List;

public class ObserverPattern {
	static class SachinCenturyNotifier{
		List<SachinFan> fans = new ArrayList<SachinFan>();
		void register(SachinFan fan){
			fans.add(fan);
		}
		void sachinScoredACentury(){
			for(SachinFan fan:fans){
				fan.announce();
			}
		}
	}
	
	static class SachinFan {
		private String name;
		SachinFan(String name){
			this.name = name;
		}
		void announce(){
			System.out.println(name + "  notified");
		}
	}
	
	public static void main(String[] args) {
		SachinCenturyNotifier notifier = new SachinCenturyNotifier();
		notifier.register(new SachinFan("Raju"));
		notifier.register(new SachinFan("Ramana"));
		notifier.register(new SachinFan("Veeranji"));
		notifier.sachinScoredACentury();	
		
		/*
		 * Raju  notified
Ramana  notified
Veeranji  notified

		 */
	}
}
