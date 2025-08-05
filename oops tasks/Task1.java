package tasks;

class Book{
	String title, author;
	double price;
	void displayDetails() {
		System.out.println("Title is : " +title);
		System.out.println("Author is : " +author);
		System.out.println("Pirce is : " +price);
	}
	
}

public class Task1 {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.title = "Harry Potter";
		b1.author = "Joanne Rawling";
		b1.price = 999;
		
		Book b2 = new Book();
		b2.title = "The Big Bang Thoery";
		b2.author = "Jessica Radloff";
		b2.price = 599;
		
		System.out.println("Book1 Details : ");
		b1.displayDetails();
		
		System.out.println("-------------");
		
		System.out.println("Book2 Details :");
		b2.displayDetails();
		
		
	}

}
