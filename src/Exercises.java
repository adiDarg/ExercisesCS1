import java.util.Scanner;

public class Exercises {
    public static void main(String[] args){
        System.out.println(acronymOfString("i want it, i got it"));
    }
    public static String fullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }
    public static void longerString(String str1, String str2){
        if (str1.length() > str2.length())
            System.out.println(str1);
        else
            System.out.println(str2);
    }
    public static boolean isStringLength(String str, int num){
        return (str.length() == num);
    }
    public static int compareStrings(String str1, String str2){
        if (str1.equals(str2))
            return 1;
        if (str1.charAt(0) == str2.charAt(0)){
                return 2;
        }
        return 3;
    }
    public static int amountOfCharInString(String text, char toCount){
        int count = 0;
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == toCount)
                count++;
        }
        return count;
    }
    public static boolean areStringsEqual(String str1, String str2){
        if (str1.length() != str2.length())
            return false;
        for (int i = 0; i <str1.length(); i++){
            if (str1.charAt(i) != str2.charAt(i))
                return false;
        }
        return true;
    }
    public static String longestStringInArray(String[] strings){
        String longestString = "";
        for (int i = 0; i < strings.length; i ++){
            if (strings[i].length() > longestString.length())
                longestString = strings[i];
        }
        return longestString;
    }
    public static String sortNumberFormat(String phoneNumber){
        String firstFourDigits = phoneNumber.substring(0,4);
        if (firstFourDigits.equals("050-"))
            return phoneNumber;
        String firstThreeDigits = phoneNumber.substring(0,3);
        if (firstThreeDigits.equals("050")){
            return  "050-" + phoneNumber.substring(3);
        }
        String firstFiveDigits = phoneNumber.substring(0,5);
        if (firstFiveDigits.equals("97250")){
            return "050-" + phoneNumber.substring(5);
        }
        return "";
    }
    public static String firstToContainSymbol(String[] strings){
        for (int i = 0; i < strings.length; i ++){
            if (strings[i].contains("$"))
                return strings[i];
        }
        return "";
    }
    public static String[] stringsFromArrayContainingString(String[] strings, String toFind){
        int resultLength = 0;
        for (int i = 0; i < strings.length; i++){
            if (strings[i].contains(toFind))
                resultLength++;
        }
        String[] result = new String[resultLength];
        int resultIndex = 0;
        for (int i = 0; i < strings.length; i++){
            if (strings[i].contains(toFind)){
                result[resultIndex] = strings[i];
                resultIndex++;
            }
        }
        return result;
    }
    public static String reverseString(String string){
        String result = "";
        for (int i = 0; i < string.length(); i++){
            result = result + string.charAt(string.length() - 1 - i);
        }
        return result;
    }
    public static boolean isPasswordStrong(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input STRONG password");
        String password = scanner.next();
        boolean isStrong = password.length()>=8 && password.length()<=10;
        isStrong = isStrong||password.contains("0") ||  password.contains("1") || password.contains("2")
                ||  password.contains("3") || password.contains("4") || password.contains("5")
                || password.contains("6") || password.contains("7") || password.contains("8")
                || password.contains("9");
        isStrong = isStrong || password.contains("%") || password.contains("$") || password.contains("_");
        return isStrong;
    }
    public static char mostCommonChar(String str, char[] chars){
        int[] frequencyOfChar = new int[chars.length -1];
        for (int i = 0; i < str.length(); i++){
            for (int j = 0; j < chars.length; j++){
                if (chars[j] == str.charAt(i)){
                    frequencyOfChar[j]++;
                }
            }
        }
        int indexOfMostCommon = 0;
        int frequencyOfMostCommon = 0;
        for (int i = 0; i < chars.length; i++){
            if (frequencyOfChar[i] > frequencyOfMostCommon){
                frequencyOfMostCommon = frequencyOfChar[i];
                indexOfMostCommon = i;
            }
        }
        return chars[indexOfMostCommon];
    }
    public static boolean isPalindrome(String string){
        string = string.toLowerCase();
        String simplified = "";
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) != ',' &&string.charAt(i) != ' ' ){
                simplified = simplified + string.charAt(i);
            }
        }
        return simplified.equals(reverseString(simplified));
    }
    public static String acronymOfString(String string){
        String result = string.substring(0,1);
        for (int i =0; i < string.length() -1; i ++){
            boolean b = string.charAt(i) == ' ' && (!result.contains(string.substring(i+1, i + 2)));
            if (b)
                result = result + string.charAt(i + 1);
        }
        return result;
    }
}
