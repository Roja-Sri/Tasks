package wrappertasks;

public class Task4 {
    public static void main(String[] args) {
     
        Integer a = 100;
        Integer b = 100;

        
        Integer c = Integer.valueOf(100);
        Integer d = Integer.valueOf(100);


        System.out.println("a == b (autoboxed): " + (a == b));             
        System.out.println("a.equals(b): " + a.equals(b));                 


        System.out.println("c == d (valueOf): " + (c == d));               
        System.out.println("c.equals(d): " + c.equals(d));                 

        System.out.println("a == c (autoboxed vs valueOf): " + (a == c));  
        System.out.println("a.equals(c): " + a.equals(c));                 
    }
}

