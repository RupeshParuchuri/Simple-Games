/*
/n/t/t
*/

import java.util.*;
import java.text.*;

public class Farmer extends Occupation
{
    private String job,month;
    private int months;
    private double startingMoney;
    private int day = 1, extraFood;
    private Scanner input = new Scanner(System.in);
    
    public Farmer(String job, double startingMoney, int extraFood, int months, String month)
    {
        super(months,month,startingMoney);
        this.job=job;
        this.startingMoney= startingMoney;
        this.extraFood=extraFood;
        this.month=month;
    }
    
    public void play()
    {
        BasicInfo begin = new BasicInfo();
        
        System.out.println("\n\t\t\tYou have +"+extraFood+" pounds of food because of your position as a farmer! Buy some supplies from Bob's Trail Store in Missouri!");
        
        super.bobStore();
        
        System.out.println("\n     _________________________________________________________________________________________________________________________________________________");
        
        System.out.println("\n\t\t\t You and your party will consume 1 pound of food every day and will travel 1 mile a day (depending on what pace you set)!");
        System.out.println("\n\t\t\t\t\t Good luck on your journey!");
        
        super.trail(foodCount);
    }
}