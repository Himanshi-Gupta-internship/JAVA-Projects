import java.util.*;
class Question 
{
	Scanner sc=new Scanner(System.in);
	ArrayList<String>Questions= new ArrayList<>();
	ArrayList<String>Option1= new ArrayList<>();
	ArrayList<String>Option2= new ArrayList<>();
	ArrayList<String>Option3= new ArrayList<>();
	ArrayList<String>Option4= new ArrayList<>();
	ArrayList<Character>charList=new ArrayList<>();
	int Score=0;
	
	Question(){
	Questions.add("What is the capital of India? ");
	Questions.add("Which language is used for Android Development ?");
	Questions.add("Who is the founder of Microsoft ?");
	Questions.add("Which keyword is used to inherit a class ?");
	Questions.add("Which data structure uses FIFO ?");
		
	
	Option1.add("Mumbai");
	Option1.add("C");
	Option1.add("Elon Musk");
	Option1.add("Super");
	Option1.add("Stack");
		
	
	Option2.add("Kolkata");
	Option2.add("JAVA");
	Option2.add("Steve Jobs");
	Option2.add("This");
	Option2.add("Array");
		
	Option3.add("Delhi");
	Option3.add("Python");
	Option3.add("Mark Zuckerberg");
	Option3.add("Extends");
	Option3.add("Queue");
		
	
	Option4.add("UttarPradesh");
	Option4.add("C#");
	Option4.add("Bill Gates");
	Option4.add("Implements");
	Option4.add("Tree");
	
	Collections.addAll(charList,'C','B','D','C','C');
	}
	
	public void display(){
	System.out.println("\n===========>Welcome to the Java Quiz Game<===========");
	for(int i=0;i<5;i++){
		System.out.println("\nQuestion"+(i+1)+":"+Questions.get(i));
		
		String A=Option1.get(i);
		String B=Option2.get(i);
		String C=Option3.get(i);
		String D=Option4.get(i);
		System.out.println("\nA "+A);
		System.out.println("\nB "+B);
		System.out.println("\nC "+C);
		System.out.println("\nD "+D);
		
		System.out.println("\nEnter your Answer(A/B/C/D):  ");
		char UserInput=sc.next().charAt(0);
		
		char correct=charList.get(i);
		
		if (Character.toUpperCase(UserInput)==correct)
		{
			System.out.println("\nCorrect ");
			Score++;
		}
		else{
			System.out.println("\nIncorrect");
			System.out.println("\nCorrect option is :"+correct);
		}
	}
	System.out.println("\n******************************* Quiz Over! ************************************");
	System.out.println("\n************************  Your Score is :"+Score+" ****************************************");
	}
	
}
public class QuizGame
{
	public static void main(String[] args) 
	{
		Question q=new Question();
		q.display();
	}
}
