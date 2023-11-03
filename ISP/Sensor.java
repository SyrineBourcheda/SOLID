package com.directi.training.isp.exercice_refactored;
import java.util.Random;

public class Sensor {
	
	public void register(IProximitySensing proximityDetector) {
		while (true) {
			if (isPersonClose()) {
				proximityDetector.proximityCallback();
				break;
			}
		}
	}

	private boolean isPersonClose() {
		return new Random().nextBoolean();
	}

}
