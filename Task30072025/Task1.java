package wrappertasks;


public class Task1 {
	public static void main(String[] args) {
		
	
	int a = 10;
	Integer intobj = Integer.valueOf(a);
	
	double b = 380.0d;
	Double doubleobj = Double.valueOf(b);
	
	char c = 'a';		
	Character charobj = c;
	
	System.out.println("Printing as wrapper objects");
	System.out.println(intobj);
	System.out.println(doubleobj);
	System.out.println(charobj);
	
	int a2 = intobj.intValue();
    double b2 = doubleobj.doubleValue();
    char c2 = charobj.charValue();
    
    System.out.println("\nPrinting back as primitive values:");
    System.out.println("int value: " + a2);
    System.out.println("double value: " + b2);
    System.out.println("char value: " + c2);
	}

}
