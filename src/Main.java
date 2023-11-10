import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
//В текстовом файле посчитать количество строк, а также для каждой отдельной строки определить количество в ней символов и слов.
public class Main {
    public static void main(String[] args) throws Exception {

        try {
            FileReader fr = new FileReader("C:\\Users\\Sotskaya2021\\IdeaProjects\\HomeWork111\\src\\1.txt");
            Scanner scan = new Scanner(fr);
            int i = 0;
            LinkedList<String> listStrok = new LinkedList<>();
            StringBuffer strBuffer = new StringBuffer();
            while (scan.hasNext()) {
                String s = scan.nextLine();
                listStrok.addLast(s);
                i++; System.out.println(s);
            }
            System.out.println("\nСтрок в файле: " + i);
            int j=0;
            for(String s : listStrok) {
                j++;
                int schetschikSimvolov = s.length();
                int schetschikSlov =0;
                String[] words = s.split(" ");
                for(String word : words){
                    if(word.length()!=0){
                        schetschikSlov++;}
                }
                System.out.println("В "+j+" строке: "+schetschikSimvolov+" символов и "+schetschikSlov+" слов");
            }
            fr.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }
    }
}