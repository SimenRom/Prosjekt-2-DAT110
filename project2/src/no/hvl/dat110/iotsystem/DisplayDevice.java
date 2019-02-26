package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.messages.Message;
import no.hvl.dat110.messages.PublishMsg;

public class DisplayDevice {

	private static final int COUNT = 10;

	public static void main(String[] args) {

		Client c = new Client("DisplayDevice", Common.BROKERHOST, Common.BROKERPORT);
		c.connect();
		c.createTopic(Common.TEMPTOPIC);
		c.subscribe(Common.TEMPTOPIC);
		
		System.out.println("Display starting ...");

		for (int i = 0; i < COUNT; i++) {
			PublishMsg melding = (PublishMsg) c.receive();
			System.out.println("Temperaturen er " + melding.getMessage());
		}
		c.disconnect();
		
		System.out.println("Display stopping ... ");

	}
}
