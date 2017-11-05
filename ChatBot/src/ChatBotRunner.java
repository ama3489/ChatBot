import java.util.Scanner;

/**
 * A simple class to run our chatbot teams.
 * @author Mr. Levin
 * @version September 2017
 */
public class ChatBotRunner
{

	/**
	 * Create instances of each chatbot, give it user input, and print its replies. Switch chatbot responses based on which chatbot the user is speaking too.
	 */
	  static void main(String[] args)
	{
		String statement = "";
		System.out.println("Good Morning!");
		Scanner main = new Scanner(System.in);
		String welcome = main.nextLine();
		int i = 0;
		i= welcome.length();
		String closure ="" ;
		
		while( i > 0 || closure.equals("Bye")){
			System.out.print("Welcome to the main menu! Please pick a selection for the chat bot you wish to speak to. \n0. Exit\n1.Potato\n2.Potato\n3.Potato\n4.Potato\n\nSelection: ");
			Scanner selection = new Scanner(System.in);
			String choice = selection.nextLine();
			closure = "";
			switch(choice) {
				case "0":
					System.out.println("good bye");
				    i = 0;
					statement = "bye";
					break;
				case "1":
					//i=0;
					LLiBot chatbot1 = new LLiBot();
					
					System.out.println (chatbot1.getGreeting());
					Scanner in = new Scanner (System.in);
					statement = in.nextLine();
					while (!closure.equals("Bye"))
					{
						System.out.println (chatbot1.getResponse(statement));
						statement = in.nextLine();
						closure = chatbot1.returnToMianMenu(statement);
					}
					break;
				case "2":
					System.out.print("2");
					break;
			}
		
		}
		
		/*
		LLiBot chatbot1 = new LLiBot();
		
		System.out.println (chatbot1.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (chatbot1.getResponse(statement));
			statement = in.nextLine();
		}
		*/
		
		main.close();
	}
	public static String gameinput()
	{
		Scanner ga = new Scanner(System.in);
		return ga.nextLine();
	}
}
