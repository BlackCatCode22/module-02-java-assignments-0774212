// gtc 8/27/24
// StringPractice

public class StringPractice {
    public static void main(String[] args) {
        String phrase = "Obamna Soda";
        System.out.println(phrase.substring(0, phrase.lastIndexOf("a")));
        // Create a String object
        String myPracticeStr;
        myPracticeStr = "Many such cases!";
        System.out.println("\n myPracticeStr is : " + myPracticeStr);
        // Use a few String methods
        // A method is an object-oriented language name for a function
        // Methods always have a pair of () attached.
        // Use the toLowerCase()
        String myNewStr = "";
        myNewStr = myPracticeStr.toUpperCase();
        // Moment Of Truth
        System.out.println("myNewStr is: " + myNewStr);
        // toLowerCase
        myNewStr = myPracticeStr.toLowerCase();
        System.out.println("myNewStr is: " + myNewStr);
        // Length
        // Create an int variable because the length() method returns an int.
        int myInt = 0;
        // Find the length of our string object.
        myInt = myPracticeStr.length();
        // Prove it
        System.out.println("\n The length of " + myPracticeStr + " is " + myInt);
        // .contains()
        boolean isItThere;
        isItThere = myPracticeStr.contains("a");
        isItThere = myPracticeStr.contains("ases");
        System.out.println("\n The value of isItThere is: " + isItThere);
        // charAt
        char myChar;
        int anotherInt = 3;
        myChar = myPracticeStr.charAt(anotherInt);
        // Output the result
        System.out.println("\n The char at index " + anotherInt + " is " + myChar);
        // .indexOf
        int mySecondInt;
        mySecondInt = myPracticeStr.indexOf("cas");
        System.out.println("\n The index of cas is: " + mySecondInt);
        // .lastIndexOf
        int oneMoreInt;
        oneMoreInt = myPracticeStr.lastIndexOf("s");
        System.out.println("\n oneMoreInt is: " + oneMoreInt);
        // SubString
        String myLastStrObject;
        myLastStrObject = myPracticeStr.substring(0,myPracticeStr.indexOf("cas"));
        // Output
        System.out.println("\n myLastStrObject is: " + myLastStrObject);


    }
}