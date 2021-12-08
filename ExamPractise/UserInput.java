
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class UserInput {
    public static void main(String[] args) {

        File myfile=new File("test.txt");
        
        try {
            if (myfile.createNewFile()) {
                System.out.println("file created"); 
            }
            InputStreamReader inputdata=new InputStreamReader(System.in);
            BufferedReader br= new BufferedReader(inputdata);
            System.out.println(br.readLine());
            
            
        } catch (Exception e) {
            System.out.println("error");
        }
    }
    
}
