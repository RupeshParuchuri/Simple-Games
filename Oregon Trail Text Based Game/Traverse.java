/*
System.out.println("\033[F\r" + "\t | SELECTED | Traverse the Trail "); //to return to previous line and display option entered
*/

import java.util.*;

public class Traverse
{
    private int z;
    
    BasicInfo begin = new BasicInfo();
    Occupation occ = new Occupation();
    
    
    
    ArrayList<String> namesList = new ArrayList<>();
    String[] listNames = {"Rupesh","John","Viraj","Aditya","Rishi","Surya","Ty","Kunsang","Simon","Richard","Sahith","Miguel","Jack","Gill","Abhi","Nikki","Harshil","Ujwal","Zheng","Krish","Ding-Ding"}; //21 total names
    Random rand = new Random();
    
    Scanner input = new Scanner(System.in);
    
    public void leaderName(String lName)
    {
        if (!lName.isEmpty())
        {
            namesList.add(lName); //add to arrayList
            displayNames(namesList); //call to method
        }
        else
        {
            int randNum = rand.nextInt(20);
            namesList.add(listNames[randNum]);
            displayNames(namesList);
        }
        
        System.out.println("     _________________________________________________________________________________________________________________________________________________");
        
        for (int x = 1; x < 5; x++) //four times
        {
            System.out.println("\n\t | ! | What are the names of the 4 other members? Enter first names or press ENTER to generate random names.");
            
            System.out.print("\t | ? | ");
            String otherNames = input.nextLine();
            
            if (otherNames.equalsIgnoreCase("E") || otherNames.equalsIgnoreCase("ENTER") || otherNames.isEmpty())
            {
                System.out.println("\033[F\r" + "\t | ENTERED | ENTER ");
            }
            
            displayNames(namesList);
            
            System.out.println("     _________________________________________________________________________________________________________________________________________________");
            
            if (otherNames.equalsIgnoreCase("E") || otherNames.equalsIgnoreCase("ENTER") || otherNames.isEmpty())
                {
                    System.out.println("\n\t | ! | This is your party.");
                    randomName(listNames);
                    displayNames(namesList); 
                    x = 5;
                    
                }
        }
    }
    
    public void displayNames(ArrayList<String> arrayNames) //displays names in arrayList
    {
        for (int y = 0; y < arrayNames.size(); y++) {
                System.out.println("\t | "+(y+1) + " | " + arrayNames.get(y));
        }
    }
    
    public void randomName(String[] names) //randomly enters names into arrayList by getting a random number index in names List
    {
        for (int y = 1; y < 5; y++)
        {
            int ranInt = rand.nextInt(20);
            namesList.add(names[ranInt]);
        }
    }
}