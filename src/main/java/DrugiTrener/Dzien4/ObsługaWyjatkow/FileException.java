package DrugiTrener.Dzien4.ObsługaWyjatkow;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileException {
    public static void main(String[] args) {
        try {
            InputStream is = getFromPath("C:\\Users\\tro\\Desktop\\Amazon.tx");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Line");
    }
    private static InputStream getFromPath(String path) throws FileNotFoundException{
        File file = new File(path);
        return new FileInputStream(path);
    }
}
