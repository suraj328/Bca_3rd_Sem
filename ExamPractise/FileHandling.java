import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class FileHandling{
    public static void main(String []Args){
        File obj=new File("hello.txt");
        File oldfile= new File("created.txt");
        
        
        try {
            //create a file
            if(obj.createNewFile()){
                System.out.println("file created");
            }
            //delete a file
            if (oldfile.delete()) {
                System.out.println(oldfile.delete()+""+oldfile.getName());
            }else{
                System.out.println("file deleted");
            }
            //write into file 
            FileWriter writerfile=new FileWriter("hello.txt");
            writerfile.write("Hello Java begineers");
            writerfile.close();
            //scanner to read all data fromfile
            Scanner sc= new Scanner(obj);
            while (sc.hasNextLine()) {
               String read=sc.nextLine();
               System.out.println(read);
            }
            sc.close();

        } catch (IOException e) {
            System.out.println("sucessfull"+e);
        }

    }
    
}
