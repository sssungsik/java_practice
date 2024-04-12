package main.java.collection;

public class Airline {
	private int departure;
	private int arrival;
	
	public Airline(int departure, int arrival) {
		this.departure = departure;
		this.arrival = arrival;
	}
	
	public int getDeparture() {
		return departure;
	}

	public int getArrival() {
		return arrival;
	}

	public void setArrival(int arrival) {
		
		
		this.arrival = arrival;
	}

	public void setDeparture(int departure) {
		this.departure = departure;
	}

}
