import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Bruker on 29.01.2018.
 */
public class convert {


    // En metode som tar i mot Amount, source(fra), taget(til)

    public static void main(String[] args) throws IOException {
        String result = readUser();
        String del[] = result.split(",");
       double value = Double.parseDouble(del[0]);
       String fra =del[1];
       String til = del[2];
        System.out.println( "Det equals ="+convert(value, fra, til));

    }


    public  static double convert(double value, String fra, String til) throws IOException {


        //vi brukker  bufferreadRreader for å lese fra file.
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Bruker\\git\\ClogServ\\src\\penger.csv") );

            while (br != null ) {                             // while file er ikke tomt eller det finner ikke noe å lese.
                String line = br.readLine();                 //vi brukker realine metodet til å lese fra fil førte line.
                String del1[] = line.split (",");

                    if (fra.equals(del1[0])&& til.equals(del1[2])){
                        double rate = Double.parseDouble(del1[1]);

                        return rate * value;
                    }



            }
            return -1.0;
    }

        public static String readUser() throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter info here: ");
        String input = reader.readLine();
        return input;

    }

}
