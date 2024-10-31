/*
System.out.println("\033[F\r" + "\t | SELECTED | ");
*/

import java.util.*;
import java.text.*;


public class Occupation
{
    public int day = 1;
    private String month;
    public int oxenCount = 0,foodCount = 0,m;
    public double oxenCash = 0.00, foodCash = 0.00,startingMoney;
    public double oxenM = 10.00, foodM = 0.50;
    public int milesLeft = 100;
    public int year = 1848;
    public int pace = 1, foodMinus = 1;
    public int daysLeft;
    public int x = 1;
    
    Scanner input = new Scanner(System.in);
    
    public Occupation()
    {
    }
    
    public Occupation(int m,String month,double startingMoney)
    {
        System.out.println("\t | ! | "+ m +" months left!");
        System.out.println("     _________________________________________________________________________________________________________________________________________________");
        this.m=m;
        this.month=month;
        this.startingMoney=startingMoney;
        daysLeft = (m + 1) * 30;
    }
    
    public String occupation()
    {
        Traverse travel = new Traverse();
        BasicInfo begin = new BasicInfo();

        System.out.println("     _________________________________________________________________________________________________________________________________________________");
        
        System.out.println("\n\tYou can: ");
        System.out.println("\t | 1 | Become an esteemed banker hailing from New England");
        System.out.println("\t | 2 | Become a poor farmer journeying from Ohio");
        System.out.println("\t | 3 | Learn about the occupations");
        System.out.print("\t | ? | ");
        
        String occupationChoice = input.nextLine();
        
        System.out.println("     _________________________________________________________________________________________________________________________________________________");
        
        System.out.println("\n\t | ! | What is your name? Press ENTER to generate random name!");
        System.out.print("\t | ? | ");
        
        String name = input.nextLine();
        
        if (name.equalsIgnoreCase("E") || name.equalsIgnoreCase("ENTER") || name.isEmpty())
        {
            System.out.println("\033[F\r" + "\t | ENTERED | ENTER ");
        }
        
        travel.leaderName(name);
        
        System.out.println("     _________________________________________________________________________________________________________________________________________________");
        
        System.out.println("\n\t\t\tYou must travel the trail without assistance from your party. You cannot give help either.");
        System.out.println("\t\t\tIt is the year 1848. You are departing from Missouri and arriving in Oregon at a certain time.");
        System.out.println("\t\t\tEnter which month you want to leave Missouri! Keep in mind you must arrive by the end of the year!");
        
        System.out.println("\t | 1 | April");
        System.out.println("\t | 2 | July");
        System.out.println("\t | 3 | October");
        
        System.out.print("\t | ? | ");
        
        String monthChoice = input.nextLine();
        int monthsLeft = 0;
        
        if (monthChoice.equalsIgnoreCase("April") || monthChoice.equals("1") || monthChoice.equalsIgnoreCase("one") || monthChoice.equalsIgnoreCase("o") || monthChoice.equalsIgnoreCase("a"))
        {
            monthsLeft = 8;
            monthChoice = "April";
        }
        else if (monthChoice.equalsIgnoreCase("July") || monthChoice.equals("2") || monthChoice.equalsIgnoreCase("two") || monthChoice.equalsIgnoreCase("t") || monthChoice.equalsIgnoreCase("j"))
        {
            monthsLeft = 5;
            monthChoice = "July";
        }
        else if (monthChoice.equalsIgnoreCase("October") || monthChoice.equals("3") || monthChoice.equalsIgnoreCase("three") || monthChoice.equalsIgnoreCase("th") || monthChoice.equalsIgnoreCase("o"))
        {
            monthsLeft = 2;
            monthChoice = "October";
        }
        else
        {
            System.out.println("\t | ! | You took to long to decide and have to depart in November!");
            monthsLeft = 1;
            monthChoice = "November";
        }
        
        if (occupationChoice.equalsIgnoreCase("1") || occupationChoice.equalsIgnoreCase("banker") || occupationChoice.equalsIgnoreCase("esteemed banker") || occupationChoice.equalsIgnoreCase("b"))
        {
            Banker banker = new Banker("banker",300,monthsLeft, monthChoice); //position, money, perk, months, month word
            banker.play();
        }
        else if (occupationChoice.equalsIgnoreCase("2") || occupationChoice.equalsIgnoreCase("two") || occupationChoice.equalsIgnoreCase("farmer") || occupationChoice.equalsIgnoreCase("poor farmer") || occupationChoice.equalsIgnoreCase("f"))
        {
            Farmer farmer = new Farmer("farmer",200,25,monthsLeft, monthChoice); //position, money, extrafood, months, month word
            farmer.play();
        }
        else if (occupationChoice.equalsIgnoreCase("3"))
        {
            begin.occupationInfo(); //for information
        }
        else if (occupationChoice.equalsIgnoreCase("E") || occupationChoice.equalsIgnoreCase("ENTER") || occupationChoice.isEmpty())
        {
            System.out.println("\033[F\r" + "\t | ENTERED | "+occupationChoice.toUpperCase());
            begin.quit();
        }
        
        return occupationChoice;
    }
    
    public void bobStore()
    {
        BasicInfo begin = new BasicInfo();
        
        while (true) {
            System.out.println("\n     _________________________________________________________________________________________________________________________________________________");
        
            System.out.println("\n\t\t\t\t\tBob's Trail Store\n\t\t\t\t\tNowhere, Missouri");
            System.out.println("\n\t\t\t\t\t "+month+" "+day+", "+year);
            
            System.out.println("\n\t\t\t\t\tYou have $"+startingMoney+" left!");
        
            System.out.println("     _________________________________________________________________________________________________________________________________________________");
         
            System.out.println("\n\t | 1 | Oxen (number)\t"+oxenCount+" "+ "$"+oxenCash);
            System.out.println("\t | 2 | Food (pounds)\t"+foodCount+" "+ "$"+foodCash);
            System.out.println("\t | ! | Press \"ENTER\" to leave store!");
            System.out.print("\t | ? | Which would you like to buy? ");
        
            String store = input.nextLine();
        
            if (store.equals("1") || store.equalsIgnoreCase("oxen") || store.equalsIgnoreCase("one") || store.equalsIgnoreCase("o"))
            {
                oxen();
                if (startingMoney <= 0.00 || startingMoney<=0.0)
                {
                    System.out.println("\n\t\t\t You have no more money!");
                    break;
                }
            }
            else if (store.equals("2") || store.equalsIgnoreCase("food") || store.equalsIgnoreCase("two") || store.equalsIgnoreCase("f"))
            {
                food();
                if (startingMoney<=0.00 || startingMoney<=0.0)
                {
                    System.out.println("\n\t\t\t You have no more money!");
                    break;
                }
            }
            else if (store.equals("q") || store.equalsIgnoreCase("q") || store.equalsIgnoreCase("quit"))
            {
                begin.quit();
                break;
            }
            else if (store.equals("") || store.isEmpty() || store.equalsIgnoreCase("ENTER"))
            {
                break;
            }
        }
    }
    
    public void oxen()
    {
        System.out.println("\n     _________________________________________________________________________________________________________________________________________________");
        
        System.out.println("\n\t\tI recommend two oxen at minimum for your journey.");
        System.out.println("\t\tI charge $"+oxenM+" for 1 oxen!");
        System.out.print("\t\t | ? | How many do you want? ");
        
        int oxenamt = input.nextInt();
        
        oxenCount += oxenamt;
        oxenCash += (oxenM * oxenCount);
        startingMoney -= (oxenM * oxenCount);
        
        bobStore();
    }
    
    public void food()
    {
        System.out.println("\n     _________________________________________________________________________________________________________________________________________________");
        
        System.out.println("\n\t\tI recommend 300 pounds of food at minimum for your journey.");
        System.out.println("\t\tI charge $"+foodM+" for 1 pound!");
        System.out.print("\t\t | ? | How many do you want? ");
        
        int foodamt = input.nextInt();
        
        foodCount += foodamt;
        foodCash += (foodM * foodCount);
        startingMoney -= (foodM * foodCount);
        
        bobStore();
    }
    
    /*
    
    else if (returns.equalsIgnoreCase("Q") || returns.equalsIgnoreCase("QUIT"))
        {
            System.out.println("\033[F\r" + "\t | SELECTED | QUIT GAME");
            quit();
        }
    
    */
    
    public void trail(int food) //the OREGON Trail!!!
    {
        BasicInfo begin = new BasicInfo();
        
        
        while(x <= daysLeft) //1 <= m * 30
        {
            changeMonth();
            System.out.println("\n     _________________________________________________________________________________________________________________________________________________");
            
            System.out.println("\n\t\tFood left (pounds): "+foodCount);
            System.out.println("\t\tMiles left to Oregon: "+milesLeft);
            System.out.println("\t\tHealthy oxen left: "+oxenCount);
            System.out.println("\t\tDate: "+month+" "+day+", "+year);
            System.out.println("\t\tMonths left till the end of the year: "+(m+1));
            System.out.println("\t\tDays left till the end of the year: "+ daysLeft);
            
            if (foodCount <= 0)
            {
                System.out.println("\n     _________________________________________________________________________________________________________________________________________________");
                
                System.out.println("\n\t\t\t\t\tYou ran out of food, eventually eating your party members before starving out yourself...");
                begin.ded();
                break;
            }
            else if (oxenCount <= 0)
            {
                System.out.println("\n     _________________________________________________________________________________________________________________________________________________");
                
                System.out.println("\n\t\t\t\t\tYou were stranded with no oxen left, eventually dying of starvation...");
                begin.ded();
                break;
            }
            else if (milesLeft == 0)
            {
                begin.win();
                break;
            }
            
            System.out.println("\n\t\t | 1 | Continue trail ");
            System.out.println("\t\t | 2 | Change pace ");
            System.out.println("\t\t | 3 | Rest for a day ");
            System.out.println("\t\t | 4 | Buy at store ");
            System.out.print("\t\t | ? | What do you want to do? ");
            
            String trailChoice = input.nextLine();
            
            if (trailChoice.equals("1") || trailChoice.equalsIgnoreCase("continue trail") || trailChoice.equalsIgnoreCase("trail"))
            {
                continueTrail();
            }
            else if (trailChoice.equals("2") || trailChoice.equalsIgnoreCase("change pace") || trailChoice.equalsIgnoreCase("change"))
            {
                changePace();
            }
            else if (trailChoice.equals("3") || trailChoice.equalsIgnoreCase("rest") || trailChoice.equalsIgnoreCase("rest for a day"))
            {
                rest();
            }
            else if (trailChoice.equals("4") || trailChoice.equalsIgnoreCase("buy") || trailChoice.equalsIgnoreCase("store"))
            {
                bobStore();
            }
            else if (trailChoice.equalsIgnoreCase("Q") || trailChoice.equalsIgnoreCase("QUIT"))
            {
                System.out.println("\033[F\r" + "\t | SELECTED | QUIT GAME");
                begin.quit();
            }
        }
    }
    
    public void rest() //resting for one day consuming a pound of food
    {
        System.out.println("\n\t\t\t\tYou and your party rest for a day, consuming 1 pound of food!");
        foodCount--;
        day++;
        x++;
        daysLeft--;
    }
    
    public void continueTrail() //travels trail based on user pace
    {
        System.out.println("\n\t\t\t\tYou traveled "+pace+" mile (s)! and consumed "+foodMinus+" pound(s) of food!");
        day++;
        milesLeft -= pace;
        foodCount -= foodMinus;
        x++;
        daysLeft--;
        
    }
    
    public void changePace() //changes pace based on user onput
    {
        BasicInfo begin = new BasicInfo();
        
        
        System.out.println("\n     _________________________________________________________________________________________________________________________________________________");
        System.out.println("\n\tWhat pace do you want to change to?");
        System.out.println("\t\t | ! | Current pace: "+pace);
        System.out.println("\t\t | 1 | 1 mile per day ");
        System.out.println("\t\t | 2 | 2 miles per day ");
        System.out.println("\t\t | 3 | 3 mile per day ");
        System.out.println("\t\t | ! | WARNING: Going 2 miles per day consumes 4 pounds of food and 3 miles per day consumes 6 pounds of food! Be careful!");
        System.out.print("\t\t | ? | What do you want to do? ");
        
        String paceInput = input.nextLine();
        
        if (paceInput.equals("1") || paceInput.equalsIgnoreCase("1 mile") || paceInput.equalsIgnoreCase("one mile"))
        {
            pace = 1;
            foodMinus = 1;
            System.out.println("\033[F\r" + "\t | ENTERED | 1 mile per day");
        }
        else if (paceInput.equals("2") || paceInput.equalsIgnoreCase("2 miles") || paceInput.equalsIgnoreCase("two miles"))
        {
            pace = 2;
            foodMinus = 4;
            System.out.println("\033[F\r" + "\t | ENTERED | 2 miles per day");
        }
        else if (paceInput.equals("3") || paceInput.equalsIgnoreCase("3 miles") || paceInput.equalsIgnoreCase("three miles"))
        {
            pace = 3;
            foodMinus = 6;
            System.out.println("\033[F\r" + "\t | ENTERED | 3 miles per day");
        }
        else if (paceInput.equalsIgnoreCase("Q") || paceInput.equalsIgnoreCase("QUIT"))
        {
            System.out.println("\033[F\r" + "\t | SELECTED | QUIT GAME");
            begin.quit();
        }
        
    }
    
    public void changeMonth() //changes the month and day when the end of the month is reached, changes the date in the trail method above
    {
        if (day == 30 && month.equals("April"))
        {
            month = "May";
            day = 1;
            m--;
        }
        else if (day == 30 && month.equals("May"))
        {
            month = "June";
            day = 1;
            m--;
        }
        else if (day == 30 && month.equals("June"))
        {
            month = "July";
            day = 1;
            m--;
        }
        else if (day == 30 && month.equals("July"))
        {
            month = "August";
            day = 1;
            m--;
        }
        else if (day == 30 && month.equals("August"))
        {
            month = "September";
            day = 1;
            m--;
        }
        else if (day == 30 && month.equals("September"))
        {
            month = "October";
            day = 1;
            m--;
        }
        else if (day == 30 && month.equals("October"))
        {
            month = "November";
            day = 1;
            m--;
        }
        else if (day == 30 && month.equals("November"))
        {
            month = "December";
            day = 1;
        }
        else if (day == 30 && month.equals("December"))
        {
            month = "January";
            day = 1;
            m--;
        }
    }
    
}