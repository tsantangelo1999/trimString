package com.company;

public class Main
{
    public static void main(String[] args)
    {
	    /*
	    public String trim()
	    This method takes no parameters
	    It returns a string
	    It is a method of the String class, so it uses the string that calls it

	    Example usage:
	    String dog = " \n \n  woof  \t \n      ";
	    String dog2 = dog.trim();
	    //dog2 is "woof"

	    This method removes all whitespace before the first non-whitespace character and all whitespace after the last non-whitespace character
	    whitespace characters include: \n, \t, spaces
	     */

        String dog = " \n\n\t   wooof   \n\t\n\t\n\t\n         ";
        System.out.println(dog.trim());
    }
}
