package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    char myChar = 'D'; //store last keypress, last digit in menu option, array element
	    char myUnicodeChar = '\u0044';
        char myCopyrightChar = '\u00A9';
        boolean myTrueBoolean = true; //customer over 21?
        boolean myFalseBoolean = false;

        boolean isCustomerOverTwentyOne = true;

        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        System.out.println(myCopyrightChar);
        System.out.println(myTrueBoolean);
        System.out.println(myFalseBoolean);
        System.out.println("Is Customer Over Twenty-One? " + isCustomerOverTwentyOne);
    }
}
