package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
	    /*
	    public String trim()
	    This method is public like all other String methods that are used practically
	    This method takes no parameters
	    It returns a string
	    It is a method of the String class, so it uses the string that calls it

	    Example usage:
	    String dog = " \n \n  woof  \t \n      ";
	    String dog2 = dog.trim();
	    //dog2 is "woof"

	    This method removes all whitespace before the first non-whitespace character and all whitespace after the last non-whitespace character
	    It does not remove whitespace between the first and last non-whitespace character
	    whitespace characters include: \n, \t, spaces
	     */

        String dog = " \n\n\t   wooof woof doggo  \n\t\n\t\n\t\n         ";
        System.out.println(dog.trim());
		//this outputs "wooof woof doggo" to the console

		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = input.nextLine();
		System.out.println("Your name is " + name + ".");
		//this will make your name fit one space after "is" and directly before the "." regardless of the input.
		//inputting "    john smith \t" for example will still result in "Your name is john smith." being print to the console
	}
}
