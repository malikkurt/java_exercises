import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {


        try{
            File myFile = new File("javatext.txt");
            if(myFile.createNewFile()){
                System.out.println("File Created");
            }
            else {
                System.out.println("File Already Exists");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}