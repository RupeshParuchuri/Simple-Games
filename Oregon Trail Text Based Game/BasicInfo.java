/*
System.out.println("\033[F\r" + "\t | SELECTED | "); //to return to previous line and display option entered
//use nextLine() to check if ENTER pressed
*/

import java.util.*;

public class BasicInfo
{
    Scanner input = new Scanner(System.in);

    public void homeScreen()
    {
        Occupation occ = new Occupation();
        
        System.out.println("     _________________________________________________________________________________________________________________________________________________"); //always put this in any new method
        
        System.out.println("\n\tWould you like to: ");
        System.out.println("\t | 1 | Traverse the Trail ");
        System.out.println("\t | 2 | Learn more about the Trail");
        System.out.println("\t | 3 | Inquire about the rules");
        System.out.println("\t | 4 | Quit game");
        System.out.println("\t | ! | EXTRA");
        System.out.print("\t | ? | ");
        String choice = input.nextLine();
        
        if (choice.equals("1") || choice.equalsIgnoreCase("traverse") || choice.equalsIgnoreCase("traverse the trail") || choice.equalsIgnoreCase("one") || choice.equalsIgnoreCase("t"))
        {
            System.out.println("\033[F\r" + "\t | SELECTED | Traverse the Trail "); //to return to previous line and display option entered
            Traverse travel = new Traverse();
            occ.occupation();
        }
        else if (choice.equals("2") || choice.equalsIgnoreCase("learn") || choice.equalsIgnoreCase("learn more about the trail") || choice.equalsIgnoreCase("two") || choice.equalsIgnoreCase("l"))
        {
            System.out.println("\033[F\r" + "\t | SELECTED | Learn more about the Trail"); //to return to previous line and display option entered
            learn();
        }
        else if (choice.equals("3") || choice.equalsIgnoreCase("inquire") || choice.equalsIgnoreCase("inqire about the rules") || choice.equalsIgnoreCase("three") || choice.equalsIgnoreCase("i"))
        {
            System.out.println("\033[F\r" + "\t | SELECTED | Inquire about the rules"); //to return to previous line and display option entered
            rules();
        }
        else if (choice.equals("4") || choice.equalsIgnoreCase("quit") || choice.equalsIgnoreCase("quit game") || choice.equalsIgnoreCase("q") || choice.isEmpty())
        {
            System.out.println("\033[F\r" + "\t | SELECTED | Quit game"); //to return to previous line and display option entered
            quit();
        }
        else if (choice.equals("!") || choice.equalsIgnoreCase("exclamation") || choice.equalsIgnoreCase("extra") || choice.equalsIgnoreCase("e"))
        {
            System.out.println("\033[F\r" + "\t | SELECTED | EXTRA"); //to return to previous line and display option entered
            extra();
        }
    }
    
    public void learn() //background info in the homescreen
    {
        System.out.println("     _________________________________________________________________________________________________________________________________________________");
        System.out.println("\n\t\tThe Oregon Trail was a roughly 100-mile route from Independence, Missouri, to Oregon City, Oregon,"); //the real trail is 2000+ miles, but my own twist
        System.out.println("\t\tthat was used by hundreds of thousands of American pioneers in the mid-1800s to emigrate west.");
        
        System.out.println("\n\t | ! | Press ENTER to continue to the homescreen ");
        System.out.print("\t | ? | ");
        String returns = input.nextLine();
        if (returns.equalsIgnoreCase("E") || returns.equalsIgnoreCase("ENTER") || returns.isEmpty())
        {
            System.out.println("\033[F\r" + "\t | SELECTED | ENTER");
            homeScreen();
        }
        else if (returns.equalsIgnoreCase("Q") || returns.equalsIgnoreCase("QUIT"))
        {
            System.out.println("\033[F\r" + "\t | SELECTED | QUIT GAME");
            quit();
        }
        
        System.out.println("     _________________________________________________________________________________________________________________________________________________");
        
    }
    
    public void rules() //rules of game in the homescreen
    {
        System.out.println("     _________________________________________________________________________________________________________________________________________________");
        System.out.println("\n\t\tEnter the corresponding number, word, or letter to which ever option is available!");
        System.out.println("\t\tYou can always type in \"Q\" or \"Quit\" to exit the game!");
        
        System.out.println("\n\t | ! | Press ENTER to continue to the homescreen ");
        System.out.print("\t | ? | ");
        String returns = input.nextLine();
        if (returns.equalsIgnoreCase("E") || returns.equalsIgnoreCase("ENTER") || returns.isEmpty())
        {
            System.out.println("\033[F\r" + "\t | SELECTED | ENTER");
            homeScreen();
        }
        else if (returns.equalsIgnoreCase("Q") || returns.equalsIgnoreCase("QUIT"))
        {
            System.out.println("\033[F\r" + "\t | SELECTED | QUIT GAME");
            quit();
        }
        
        System.out.println("     _________________________________________________________________________________________________________________________________________________");
        
    }
    
    public void occupationInfo() //job information in occupation
    {
        System.out.println("     _________________________________________________________________________________________________________________________________________________");
        System.out.println("\n\t\t\t\t\tA banker starts off with $250 and gets a %20 discount off at the store.");
        System.out.println("\n\t\t\t\t\tA carpenter starts off with $50 and gets 2 extra spare parts for the wagon.");
        System.out.println("\n\t\t\t\t\tA farmer starts off with $20 and gains a surplus of 25 lbs of food.");
        
        System.out.println("\n\t | ! | Press ENTER to continue to the homescreen ");
        System.out.print("\t | ? | ");
        String returns = input.nextLine();
        if (returns.equalsIgnoreCase("E") || returns.equalsIgnoreCase("ENTER") || returns.isEmpty())
        {
            System.out.println("\033[F\r" + "\t | SELECTED | ENTER");
            homeScreen();
        }
        else if (returns.equalsIgnoreCase("Q") || returns.equalsIgnoreCase("QUIT"))
        {
            System.out.println("\033[F\r" + "\t | SELECTED | QUIT GAME");
            quit();
        }
        
        System.out.println("     _________________________________________________________________________________________________________________________________________________");
        
    }
    
    public void extra() //extra information
    {
        System.out.println("     _________________________________________________________________________________________________________________________________________________");
        System.out.print("\n\t\t\t\t\t  This game is my own twist on the Oregon Trail and I wanted to make it different so I");
        System.out.println("\n\t\t\t\t\t\t\t\t\ttweaked a few things.");
        System.out.println("\n\t\t\t\t\t\t\t\tCreated by: ###### ##########");
        
        System.out.println("\n\t | ! | Press ENTER to continue to the homescreen ");
        System.out.print("\t | ? | ");
        String returns = input.nextLine();
        if (returns.equalsIgnoreCase("E") || returns.equalsIgnoreCase("ENTER") || returns.isEmpty())
        {
            System.out.println("\033[F\r" + "\t | SELECTED | ENTER");
            homeScreen();
        }
        else if (returns.equalsIgnoreCase("Q") || returns.equalsIgnoreCase("QUIT"))
        {
            System.out.println("\033[F\r" + "\t | SELECTED | QUIT GAME");
            quit();
        }
        
        System.out.println("     _________________________________________________________________________________________________________________________________________________");
    }
    
    public void quit()
    {
        System.out.println("     _________________________________________________________________________________________________________________________________________________");
        System.out.println("\n\t\t\t\t\t\t\t\tYou have quit the game!");
        System.out.println("     _________________________________________________________________________________________________________________________________________________");
        
    }
    
    public void ded()
    {
        System.out.println("\n\t\t\t\t\tYou and your party unfortunately couldn't finish the trail and ultimately died!");
        System.out.println("     _________________________________________________________________________________________________________________________________________________");
    }  
    
    public void win()
    {
        System.out.println("     _________________________________________________________________________________________________________________________________________________");
        System.out.println("\n\t\t\t\t\t\tYou traveled the 100-mile long Oregon Trail, arriving in Oregon City, Oregon! Congratulations!");
        System.out.println("\n     _________________________________________________________________________________________________________________________________________________");
    }
    
    public void title() //big title at beginning of game
    {
        System.out.println("\t$$$$$$$$\\ $$\\                        $$$$$$\\                                                          $$$$$$$$\\                 $$\\ $$\\ ");
        System.out.println("\t\\__$$  __|$$ |                      $$  __$$\\                                                         \\__$$  __|                \\__|$$ |");
        System.out.println("\t   $$ |   $$$$$$$\\   $$$$$$\\        $$ /  $$ | $$$$$$\\   $$$$$$\\   $$$$$$\\   $$$$$$\\  $$$$$$$\\           $$ | $$$$$$\\  $$$$$$\\  $$\\ $$ |");
        System.out.println("\t   $$ |   $$  __$$\\ $$  __$$\\       $$ |  $$ |$$  __$$\\ $$  __$$\\ $$  __$$\\ $$  __$$\\ $$  __$$\\          $$ |$$  __$$\\ \\____$$\\ $$ |$$ |");
        System.out.println("\t   $$ |   $$ |  $$ |$$$$$$$$ |      $$ |  $$ |$$ |  \\__|$$$$$$$$ |$$ /  $$ |$$ /  $$ |$$ |  $$ |         $$ |$$ |  \\__|$$$$$$$ |$$ |$$ |");
        System.out.println("\t   $$ |   $$ |  $$ |$$   ____|      $$ |  $$ |$$ |      $$   ____|$$ |  $$ |$$ |  $$ |$$ |  $$ |         $$ |$$ |     $$  __$$ |$$ |$$ |");
        System.out.println("\t   $$ |   $$ |  $$ |\\$$$$$$$\\        $$$$$$  |$$ |      \\$$$$$$$\\ \\$$$$$$$ |\\$$$$$$  |$$ |  $$ |         $$ |$$ |     \\$$$$$$$ |$$ |$$ |");
        System.out.println("\t   \\__|   \\__|  \\__| \\_______|       \\______/ \\__|       \\_______| \\____$$ | \\______/ \\__|  \\__|         \\__|\\__|      \\_______|\\__|\\__|");
        System.out.println("\t                                                                  $$\\   $$ |                                                             ");
        System.out.println("\t                                                                  \\$$$$$$  |                                                             ");
        System.out.println("\t                                                                   \\______/                                                              ");
    }
    
    
}