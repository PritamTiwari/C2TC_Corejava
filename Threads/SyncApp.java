package thread.packages;

import java.util.Iterator;


class Printer{
//	  synchronized
	void printDoc(int numofDoc,String docname ) {
	for (int i = 0; i <= numofDoc; i++) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	System.out.println(">>>printing " +docname+" "+i);	
	}
	}
}
//creating our own thread

class mythread extends Thread{
	
	Printer pRef;
	
	public mythread(Printer p) {
	//pRef:reference of the printer class
	pRef=p;
	
	}
	
	@Override
	public void run() {
		//Syc Block 
		synchronized (pRef) {
			
		
		pRef.printDoc(10, "RoshanProfile");
	}
	
	}
}	

	class Yourthread extends Thread{

		Printer pRef;
		public Yourthread(Printer p) {
			pRef=p;
		}
        @Override
		public void run() {
        	//syc block
        	synchronized (pRef) {
        		pRef.printDoc(10, "HrithikProfile");
        	}
		}
		
		
	}
	





public class SyncApp {
public static void main(String[] args) {
	System.out.println("==Application Starts==");
	
	
	Printer print=new Printer();

mythread tRef=new mythread(print);//mythread having the reference of printer object
Yourthread yRef=new Yourthread(print);

tRef.start();

	
yRef.start();
	
	
	
	System.out.println("==Application Ends==");

}
}
