package java_projects;

public class program {
    // static String result = "";
    public static void main(String[] args) {
        int N = lib.GetN();
        int result = lib.getTriangleNum(N);
        lib.exportResult(result, N);

    }



}

