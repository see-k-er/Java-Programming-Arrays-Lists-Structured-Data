
/**
 * Write a description of WordPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;

public class WordPlay {

    public Boolean isVowel(char ch){
        char lowerCase = Character.toLowerCase(ch);
        String vowels = "aeiou";
        if (vowels.indexOf(lowerCase) != -1){
            return true;
        } else {
            return false;
        }
    }
    
    
    public void isVowelTester(){
        char ex1 = 'A';
        Boolean out1 = isVowel(ex1);
        System.out.println(ex1 + " - " + out1);
        
        char ex2 = 'e';
        Boolean out2 = isVowel(ex2);
        System.out.println(ex2 + " - " + out2);
        
        char ex3 = 'c';
        Boolean out3 = isVowel(ex3);
        System.out.println(ex3 + " - " + out3);
        
        char ex4 = 'T';
        Boolean out4 = isVowel(ex4);
        System.out.println(ex4 + " - " + out4);
        
    }
    
    public String replaceVowels(String phrase, char ch){
        StringBuilder phraseString = new StringBuilder(phrase);
        
        for (int i = 0; i < phrase.length(); i++){
            char phraseStringChar = phraseString.charAt(i);
            if (isVowel(phraseStringChar)){
                phraseString.setCharAt(i, ch);
            }
        }
        return phraseString.toString();
    }
    
    public void testReplaceVowels(){
        String ex1 = "Hello World";
        String newString = replaceVowels(ex1, '*');
        System.out.println(ex1 + " - " + newString);
    }
    
    public String emphasize(String phrase, char ch){
        StringBuilder phraseString = new StringBuilder(phrase);
        
        for (int i=0; i < phrase.length(); i++){
            char phraseStringChar = phraseString.charAt(i);
            if (Character.toLowerCase(phraseStringChar) == 'a'){
                if (i % 2 != 0){
                phraseString.setCharAt(i,'+');
                } else {
                    phraseString.setCharAt(i,'*');
                } 
            }
        }
        return phraseString.toString();
    }
    
    public void testEmphasize(){
        String ex1 = "dna ctgaaactga";
        String newString1 = emphasize(ex1, 'a');
        System.out.println(ex1 + " - " + newString1);
        
        String ex2 = "Mary Bella Abracadabra";
        String newString2 = emphasize(ex2, 'a');
        System.out.println(ex2 + " - " + newString2);
    }
}
