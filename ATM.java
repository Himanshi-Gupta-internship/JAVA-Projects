import java.util.Scanner;
class Bank
{
int AccountNumber=38918;
String HolderName="Himanshi Gupta";
String AccountType="Saving";
}
class Account extends Bank
{
public void Details(){
System.out.println("Account Number : "+this.AccountNumber);
System.out.println("Account Holder : "+this.HolderName);
System.out.println("Account Type : "+this.AccountType);
}
}
public class ATM
{
public static void main(String[] args)
{
int bal=5000;
int pin=1234;
System.out.println("***WELCOME***");
Account obj=new Account();
obj.Details();
Scanner sc= new Scanner(System.in);
System.out.print("\n enter your pin: ");
int x= sc.nextInt();
System.out.println("\n                sucessful Login");
while(true){
if(x==pin){
System.out.println("\n1. Check Balance");
System.out.println("\n2. Withdraw money");
System.out.println("\n3. Exit");
System.out.print("\nenter your choice: ");
int d=sc.nextInt();
if(d==1){
System.out.print("\n                   Balance is: ");
System.out.print(bal+"\n");
}
else if(d==2){
System.out.print("\nenter the amount: ");
int amount=sc.nextInt();
if(amount<=bal){
System.out.println("\n                **withdraw sucessfully**");
bal=bal-amount;
}
else {
System.out.println("\n               **Insufficent balance**");
}
}
else if(d==3) {
	System.out.println("\n               **sucessful Logout**");
break;
}
}
else{
System.out.println("\n                  **Invalid PIN**");
}
}

}
}
