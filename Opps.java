import java.util.*;
class Library
{
	ArrayList<String>book=new ArrayList<>();
	ArrayList<String>issued=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	Library(){
		System.out.println("\nWelcome to *** Himanshi Libraray ***");
		return;
	}
	public void AddBook(){
		System.out.print("\nYou want to add a book: (y) yes or(n) no: ");
		String ans=sc.nextLine();
		if(ans.equals("y")){
			System.out.print("\nEnter the name of book: ");
		    String book1=sc.nextLine();
			book.add(book1);
		}
		}
	public void IssueBook(){
		System.out.println("\nAvailable book are: "+book);
		System.out.print("\nEnter the name of book you want to issue: ");
		String book2=sc.nextLine();
		if(book.contains(book2)){
			System.out.println("\nBook issued");
			book.remove(book2);
			issued.add(book2);
		}
		else{
			System.out.println("\nBook are not available");
		}}
	public void ReturnBook(){
		System.out.print("\nYou want to return a book. enter the name of book: ");
		String book3=sc.nextLine();
		book.add(book3);
		System.out.print("\nThank you for return book in time.");
	}
	public void Available(){
		System.out.println("\nAvailable book are: "+book);
	}
}

public class Opps{
	public static void main(String[] args) 
	{
		Library obj=new Library();
		Scanner s=new Scanner(System.in);
		while(true){
		System.out.print("\nWhat do you want to do.");
		System.out.print("\nEnter add to addbook, enter issue to issuebook, enter return to return book and enter show to show available books: ");
		String what=s.nextLine();
		if(what.equalsIgnoreCase("add")){
			obj.AddBook();}
		else if(what.equalsIgnoreCase("issue")){
			obj.IssueBook();
		}
		else if(what.equalsIgnoreCase("return")){
			obj.ReturnBook();
		}
		else if(what.equalsIgnoreCase("show")){
			obj.Available();
		}
		else if(what.equalsIgnoreCase("exit")){
			System.out.println("\n****Thanks for visiting****");
			break;
		}
		else{
		System.out.println("Invalid Input");
		System.out.println("\n****Thanks for visiting****");
		break;
		}}
	}
}