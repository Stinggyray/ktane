package utils;

public class PhoneticAlphabet {
    public static String letterToAlphabet(String letter) {
        letter = letter.toUpperCase();
        switch(letter){
            case "A" -> { return "Alpha"; }
            case "B" -> { return "Bravo"; }
            case "C" -> { return "Charlie"; }
            case "D" -> { return "Delta"; }
            case "E" -> { return "Echo"; }
            case "F" -> { return "Foxtrot"; }
            case "G" -> { return "Golf"; }
            case "H" -> { return "Hotel"; }
            case "I" -> { return "India"; }
            case "J" -> { return "Juliet"; }
            case "K" -> { return "Kilo"; }
            case "L" -> { return "Lima"; }
            case "M" -> { return "Mike"; }
            case "N" -> { return "November"; }
            case "O" -> { return "Oscar"; }
            case "P" -> { return "Papa"; }
            case "Q" -> { return "Quebec"; }
            case "R" -> { return "Romeo"; }
            case "S" -> { return "Sierra"; }
            case "T" -> { return "Tango"; }
            case "U" -> { return "Uniform"; }
            case "V" -> { return "Victor"; }
            case "W" -> { return "Whiskey"; }
            case "X" -> { return "X-Ray"; }
            case "Y" -> { return "Yankee"; }
            case "Z" -> { return "Zulu"; }
        }
        return "null";
    }
}
