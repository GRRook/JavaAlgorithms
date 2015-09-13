package cameraShop;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Order{
	private int customerId;
	private int Id;
	private Boolean processing;;
	private String startTime;
	private String duration;
	private Boolean complete;;
	private Boolean whileYouWait;
	
	PriorityQueue<Order> queue = new PriorityQueue<Order>();
	
	public Order(int customerid){
		// TODO: Build the constructor
		
	}
}
