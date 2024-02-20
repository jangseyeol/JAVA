package ex03;

import ex01.Ga;

public class Computer {

		Speaker3 sp = new Speaker3();
		
		void powerON() {
			sp.powerOn();
		}
		
		void powerOff() {
			sp.powerOff();
		}
		
		void volumeUp() {
			sp.soundUp();
		}
		
		void volumeDown() {
			sp.soundDown();
		}
}
