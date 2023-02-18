package runs;



public class Commision {
	
	

String Name;

String Address;

int Sales_amt;

long phone_num;


Commision(int amt, String name, String add, long num){
	
	
	Name=name;
	Address= add;
	Sales_amt =amt;
	
	phone_num= num;
	
	
	if (Sales_amt >=100000) {
		
		System.out.println("commision is 10%");
		
	}else if (Sales_amt <100000) {
		System.out.println("commision is 5%");
		
		
	} 
	else  if(Sales_amt <50000) {
		System.out.println("commision is 3%");
	}
	
	
	else  if(Sales_amt <30000) {
		System.out.println("No commision %");
	}
	
	
}
	

public static void main(String[] args) {
	Commision Obj = new Commision(20000,"xxxx","Newyork",253435678);
	
	
	System.out.println(Obj.Name+ " "+Obj.Address+ " "+Obj.phone_num+" " +Obj.Sales_amt);
	
	
	
}
	
	
	
}