package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;

public class TemperatureDevice {
	
	private static final int COUNT = 10;
	
	public static void main(String[] args) {
		
		TemperatureSensor sn = new TemperatureSensor();
		Client c = new Client("TemperatureDevice", Common.BROKERHOST, Common.BROKERPORT);
		c.connect();
		for(int i = 0; i < COUNT; i++) {
			int temp = sn.read();
			c.publish(Common.TEMPTOPIC, "Temperaturen er " + temp + " Celsius.");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		c.disconnect();		
		System.out.println("Temperature device stopping ... ");
		
		
	}
}
