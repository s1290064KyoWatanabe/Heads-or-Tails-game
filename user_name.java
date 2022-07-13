import java.util.Scanner;
class user_name{
    public static void main(String[] args){
	String name;
	System.out.printf("who are you？\n");
	Scanner sc=new Scanner(System.in);
	name=sc.next();
	System.out.printf("Hello, %s!\n",name);
    }
}
	
