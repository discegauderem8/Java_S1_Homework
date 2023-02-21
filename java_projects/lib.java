package java_projects;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class lib {
    public static int GetN (){
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите треугольное число N: ");
        boolean checker = iScanner.hasNextInt();
        System.out.println(checker);
        int n = iScanner.nextInt();
        iScanner.close();
        return n;
    }
    
    public static int getTriangleNum(int n) {
        int result = (n*(n+1))/2;
        System.out.println("Треугольное число N = " + result);
        return result;
    }
    
    public static void exportResult(int res, int n) {
        String parcel = "";
        parcel = parcel + Integer.toString(res);
        try (FileWriter fw = new FileWriter("file.txt", false)){
            fw.write("Треугольное число N " + n + " равно: " + parcel);
            fw.flush();
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
