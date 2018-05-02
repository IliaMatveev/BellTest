import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.lang.*;
import org.junit.Assert;

public class Calkulate  {

    public Calkulate() throws FileNotFoundException {
    }

    public void Summ(String pathToFile) throws Exception{
        FileReader fr = new FileReader(pathToFile);
        Scanner scan = new Scanner(fr);
        Integer i = 1;
        while (scan.hasNextLine()) {
            String[] r = scan.nextLine().split(";");
            int res2 = Integer.parseInt(r[3]);
            String znak = r[2];
            if (znak.equals("+")) {
                try {
                    Assert.assertTrue("True", Integer.parseInt(r[0]) + Integer.parseInt(r[1]) == res2);
                    System.out.println("Сложение выполнено успешно в строке " + i);
                } catch (AssertionError ex) {
                    System.out.println("Некорректные данные в строке " + i);
                }
            }
            i++;
        }
        fr.close();
    }

    public void Razn(String pathToFile) throws Exception{
        FileReader fr = new FileReader(pathToFile);
        Scanner scan = new Scanner(fr);
        Integer i = 1;
        while (scan.hasNextLine()){
            String[] r = scan.nextLine().split(";");
            int res2 = Integer.parseInt(r[3]);
            String znak = r[2];
            if (znak.equals("-")){
                try {
                    Assert.assertTrue("True", Integer.parseInt(r[0])-Integer.parseInt(r[1]) == res2);
                    System.out.println("Вычитание выполнено успешно в строке " + i);
                }catch (AssertionError ex) {
                    System.out.println("Некорректные данные в строке " + i);
                }
            }

            i++;

        }
        fr.close();
    }

    public void Proizv(String pathToFile) throws Exception{
        FileReader fr = new FileReader(pathToFile);
        Scanner scan = new Scanner(fr);
        Integer i = 1;
        while (scan.hasNextLine()){
            String[] r = scan.nextLine().split(";");
            int res2 = Integer.parseInt(r[3]);
            String znak = r[2];
            if (znak.equals("*")){
                try {
                    Assert.assertTrue("True", Integer.parseInt(r[0])*Integer.parseInt(r[1]) == res2);
                    System.out.println("Произведение выполнено успешно в строке " + i);
                }catch (AssertionError ex) {
                    System.out.println("Некорректные данные в строке " + i);
                }
            }
            i++;

        }
        fr.close();
    }

    public void Delen(String pathToFile) throws Exception{
        FileReader fr = new FileReader(pathToFile);
        Scanner scan = new Scanner(fr);
        Integer i = 1;
        while (scan.hasNextLine()){
            String[] r = scan.nextLine().split(";");
            int res2 = Integer.parseInt(r[3]);
            String znak = r[2];
            if (znak.equals("/")){
                try {
                    Assert.assertTrue("True", Integer.parseInt(r[0])/Integer.parseInt(r[1]) == res2);
                    System.out.println("Деление выполнено успешно в строке " + i);
                }catch (AssertionError ex) {
                    System.out.println("Некорректные данные в строке " + i);
                }
                }

            i++;

        }
        fr.close();
    }
}
