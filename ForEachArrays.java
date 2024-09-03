//gtc 09/02/24
//ForEachArrays.java
public class ForEachArrays {
    public static void main(String[] args) {
        System.out.println("\n Welcome to my For : Each practice!\n");
        //Create an array of cars. Do this two different ways and be able to explain to
        //your lab partner.

        //Create a cars array using initialization.
        String[] cars = {"BMW", "Toyota", "Ford"};

        //Output the cars array using a for each loop.
        for (int i = 0; i <= 2; i++) {
            System.out.println(cars[i]);

        }
        System.out.println("\n IT'S OVER \n");

        //Use a for: each loop to do the same thing.
        for (String anything:cars) {
            System.out.println(anything);

            //Create a String array using the new operator.
            //Create a 4 element String array named myCars.
            String[] myCars = new String[4];

            // myCars[0], myCars[1], myCars[2], myCars[3]

            //Fill the newly created String[] array with data.
            myCars[0] = "BMW";
            myCars[1] = "Toyota";
            myCars[2] = "Ford";
            myCars[3] = "Mitsubishi";

            //Use a for : each array to output.
            for (String urmom : myCars) {
                System.out.println("\n A car in myCars[] array is: " + urmom);
            }

            String[] myStrings = new String[600];

            //Use a for loop to fill the array with some strings
            for (int i = 0; i < 600; i++) {
                //fill my array with strings
                myStrings[i] = "this is string number: " + (i + 1);
            }

            // Now use a for : each loop to output the myStrings array
            for (String again : myStrings) {
                System.out.println("An element in myStrings[] is " + again);

            //Let's reverse a string.
            String myStrToReverse = "abcdefg";

            //Output the chars of myStrToReverse
                for (int i = 0; i< 7; i++) {
                    System.out.println("myStrToReverse[" + i + "] is: " + myStrToReverse.charAt(i));
                }
                System.out.println("End of line.");

                //Create the reverse string.
                String reversedStr = "";
                //Output reversedStr.
                System.out.println("reversedStr before reversion loop is: " + reversedStr);

                for (int i = 6; i > 0; i--) {
                    char charToAdd = myStrToReverse.charAt(i);
                    reversedStr = reversedStr.concat(Character.toString(charToAdd));

                    //Output reversedStr.
                    System.out.println("reversedStr after reversion loop is: " + reversedStr);
                }
            }
        }
    }
}
