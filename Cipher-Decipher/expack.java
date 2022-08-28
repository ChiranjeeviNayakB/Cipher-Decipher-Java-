import com.pbl.cipher.CipherImplement;

class Testcipher{
public static void main(String[] args){
CipherImplement ob=new CipherImplement();
System.out.println("\n YOU MUST TRY TO ENCRYPT AND DECRYPT THE CODE:\n");
ob.encrypt();
System.out.println("\n SUCCESSFULLY ENCRYPTED.. \n");
ob.decrypt();
System.out.println("\n  SUCCESSFULLY DECRYPTED.. \n");
}}