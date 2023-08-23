
/**
 * Write a description of CaesarCipher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.* ;

public class CaesarCipher {
    public String encrypt(String input, int key){
        String alphaSeqUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphaSeqLower = "abcdefghijklmnopqrstuvwxyz";
        String newCipherSeqUpper = alphaSeqUpper.substring(key) + alphaSeqUpper.substring(0,key);
        String newCipherSeqLower = alphaSeqLower.substring(key) + alphaSeqLower.substring(0,key);
        
        StringBuilder encryptedString = new StringBuilder(input);
        for (int i = 0; i < input.length(); i++){
            char stringChar = encryptedString.charAt(i);
            int oldIndexU = alphaSeqUpper.indexOf(stringChar);
            int oldIndexL = alphaSeqLower.indexOf(stringChar);
            
            if (oldIndexU != -1) {
                char newValU = newCipherSeqUpper.charAt(oldIndexU);
                encryptedString.setCharAt(i, newValU);
            } else if (oldIndexL != -1){
                char newValL = newCipherSeqLower.charAt(oldIndexL);
                encryptedString.setCharAt(i, newValL);
            }
        }
        return encryptedString.toString();
    }
    
    public void testCaesar(){
        String ex1 = encrypt("At noon be in the conference room with your hat on for a surprise party. YELL LOUD!", 15);
        System.out.println(ex1);
        
        //FileResource fr = new FileResource();
        //String message = fr.asString();
        //int key = 23;
        //String encrypted = encrypt(message,key);
        //System.out.println("key is " + key + "\n" + encrypted);
    }
    
    public String encryptTwoKeys(String input, int key1, int key2){
        StringBuilder inputVal = new StringBuilder(input);
        String encrypt1 = encrypt(input, key1);
        String encrypt2 = encrypt(input, key2);
        
        for (int i=0; i < input.length(); i++){
            if (i%2==0){
                char val1 = encrypt1.charAt(i);
                inputVal.setCharAt(i, val1);
            } else {
                char val2 = encrypt2.charAt(i);
                inputVal.setCharAt(i, val2);
            }
        }
        return inputVal.toString();
    }
    
    public void testEncryptTwoKeys(){
        String ex1 = encryptTwoKeys("At noon be in the conference room with your hat on for a surprise party. YELL LOUD!", 8, 21);
        System.out.println(ex1);
    }
    
}
