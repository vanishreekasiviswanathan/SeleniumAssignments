package week1.day3;

public class Library {

	void addBook(String bookTitle)
	{
		System.out.println("Book "+bookTitle+" is added successfully");
	}
	
	void issueBook()
	{
		System.out.println("Book issued successfully");
	}
	
	public static void main(String[] args) {
		Library librarian1 = new Library();
		librarian1.addBook("ONE DAY LIFE WILL CHANGE");
		librarian1.issueBook();
	}

}
