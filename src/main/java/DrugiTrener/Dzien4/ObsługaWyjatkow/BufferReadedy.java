package DrugiTrener.Dzien4.ObsługaWyjatkow;

import java.io.*;

public class BufferReadedy {
    public static void main(String[] args) throws Exception {
        try(
                BufferedReader bufferedReader = new BufferedReader(new FileReader("cde.txt"));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("upper_cde.txt"))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                bufferedWriter.write(line.toUpperCase() + "\n");
                line = bufferedReader.readLine();
            }
        }
//        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\tro\\Desktop\\Amazon.txt"))) {
//            System.out.println(bufferedReader.readLine().toUpperCase());
//            System.out.println(bufferedReader.readLine());
//        }catch (IOException e){
//            e.printStackTrace();

            }
        }
        //odczytywany caly plik
//String line = bufferReader.readLine();
//    while(line != null){
//        System.out.println(line);
//        line = bufferReader.readLine();
//    }



