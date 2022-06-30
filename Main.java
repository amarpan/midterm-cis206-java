/*
File Name: main.java
Name: Amar Panjwani
Description: This program collects a list of names from the user and then allows them to find a specific name within the list.
Date: 04/06/21
Email: panjwania@student.vvc.edu
*/

import java.util.Scanner;
import java.util.ArrayList;

class Main 
{
  /**
    Finds a specific name in an array list.
    @param names - array list to search within
    @param nameToFind - string to find
    @return void
  */
  public static void findName(ArrayList<String> names,String nameToFind)
  {
    boolean found = false;
    for (int i = 0; i < names.size(); i++)
    {
      String temp = names.get(i);
      if (temp.equals(nameToFind))
      {
        found = true;
        System.out.println("The name " + "'" + temp + "'" + " can be found at position: "  + i);
      }
    }
    if(!found)
      {
        System.out.println("The name " + "'" + nameToFind + "'" + " was not found in the list of names.");
      }
  }

  /**
    Adds a user-specified name to an array list.
    @param names - array list to add value to
    @param nameToFind - string to add to array list
    @return void
  */
  public static void addName(ArrayList<String> names, String newName)
  {
    names.add(newName);
  }

  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    ArrayList<String> names = new ArrayList<String>();
    int choice = 0;
    while (choice != -1)
    {
      System.out.print("Enter 1 to add a name to the list, 2 to search for a specific name, or -1 to exit: ");
      choice = in.nextInt();
      if (choice == 1)
      {
        System.out.print("Enter a name to add to the list: ");
        String newName = in.next();
        addName(names,newName);
      }
      else if (choice == 2)
      {
        System.out.print("Enter a name to search for: ");
        String nameToFind = in.next();
        findName(names,nameToFind);
      }
      else if (choice == -1)
      {
        System.out.println("Goodbye!");
      }
      else
      {
        System.out.println("Invalid input - please try again.");
      }
    }
  }
}

  