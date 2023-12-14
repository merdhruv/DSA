package in.cdac.blr.day7;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	
	// Comparable Interface, Comparator interface, Collections.sort()
	public static void main(String[] args) {
		PriorityQueue<String> pqueue = new PriorityQueue<String>();
		pqueue.add("fuoyu");
		pqueue.add("lsdff");
		pqueue.add("ajmhjk");
		pqueue.add("owercs");
		pqueue.add("djykljh");
		
		System.out.println(pqueue.peek());
	}

}
