package se.lexicon;

import java.util.Arrays;


/**
 * Hello world!
 *
 */
@SuppressWarnings("ConstantConditions")
public class App
{
    public static void main( String[] args ) {







        }

         //   ****  Exercises **** \\\
    public static void stringExercise1() {
        String java = "JAVA";
        System.out.println(getLength(java));
    }

    public static void stringExercise2() {
    String example = "Long example sentence";

    System.out.println(example.charAt(6));
}

    public static void stringExercise3() {
       String example2 = "Even longer example sentence";

       System.out.print(example2.indexOf("o"));
   }

    public static void stringExercise4() {
        String scream = "CAPS EQUALS SCREAMING";

        System.out.println(scream.toLowerCase());
        System.out.println(scream.toUpperCase());
    }

    public static void stringExercise5() {
        String proLang = "Java is the worst programming language!";

        System.out.println(proLang.replace("worst", "best"));
    }

    public static void stringExercise6() {
        String random = "\tJ\ta\tv\ta\t";
        System.out.println(random.trim());

    }

    public static void stringExercise7() {
        int yr = 20;

        String year = Integer.toString(yr);
        year = year + "20";

        System.out.println(year);

    }

    public static void stringExercise8() {
        String[] split = new String[]{"Oil and Water"};





    }


                 // *** METHODS *** \\
    public static boolean isPalindrome(String string) {
        return string
                .replaceAll(" ", "")
                .equalsIgnoreCase(
                        new StringBuilder(string.replaceAll(" ", "")).reverse().toString()
                );
    }

    public static int getLength(String string){
        return string.length();
    }

    public static char getCharFromString(String string, int index){
        return string.charAt(index);
    }

                // *** EXAMPLES *** \\

    public static void equalsAndEqualsIgnoreCase(){
        String name = "Federico Sanders";
        String name2 = "federico sanders";
        boolean falsy = name.equals(name2);
        boolean truthy = name.equalsIgnoreCase(name2);
        System.out.println(falsy);
        System.out.println(truthy);
    }

    public static void startWithAndEndsWith(){
        String string = "Inspelningen har startat";
        String startsWithString = "iN";
        String endsWithString = "at";

        System.out.println(
                string.toLowerCase().startsWith(startsWithString.toLowerCase()));

        System.out.println(string.endsWith(endsWithString));
    }

    public static void upperAndLowerCase(){
        String username = "Erik.Svensson93858";
        username = username.toLowerCase();

        System.out.println(username);
    }

    public static void subStringExample(){
        String description = "I love programming in Spring Boot";
        String subString = description.substring(7, 18);
        String anotherSubString = description.substring(description.indexOf("programming"))
                .substring(0, "programming".length());

        System.out.println(anotherSubString);
    }



    public static void indexOfExample(){
        String name = "Fabrice Badia";
        int index = name.indexOf('r');
        System.out.println(index);
        System.out.println(name.indexOf("rice"));
        System.out.println(name.indexOf('i', 5));
        System.out.println(name.indexOf(" "));
    }




}
