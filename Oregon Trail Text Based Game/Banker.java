/*
/n/t/t
*/

import java.util.*;
import java.text.*;

public class Banker extends Occupation
{
    private String job,month;
    private int months;
    private double perk, startingMoney;
    private int day = 1;
    private Scanner input = new Scanner(System.in);
    
    public Banker(String job, double startingMoney, int months, String month)
    {
        super(months,month,startingMoney);
        this.job=job;
        this.startingMoney= startingMoney;
        this.month=month;
    }
    
    public void play()
    {
        BasicInfo begin = new BasicInfo();
        
        System.out.println("\n\t\t\tYou have $"+startingMoney+" because of your position as a banker! Buy some supplies from Bob's Trail Store in Missouri!");
        
        super.bobStore();
        
        System.out.println("\n     _________________________________________________________________________________________________________________________________________________");
        
        System.out.println("\n\t\t\t You and your party will consume 1 pound of food every day and will travel 1 mile a day (depending on what pace you set)!");
        System.out.println("\n\t\t\t\t\t Good luck on your journey!");
        
        super.trail(foodCount);
    }
}