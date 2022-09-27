package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Divide(0, 8);
        Divide(2, 0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        for (Map.Entry<String, String> student : studentFiles.entrySet()) {
            System.out.println(student.getKey());
            CheckFileExtension(student.getValue());
        }

    }

    public static void Divide(int x, int y)
    {
        if(y == 0) {
            try {
                throw new ArithmeticException("You can't divide by 0.");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
    }

    public static int CheckFileExtension(String fileName)
    {
        int points = 0;
        if(fileName.endsWith(".java")) {
            points = 1;
        } else if(fileName.equals("") || fileName.equals(null)) {
            points = -1;
            try {
                throw new Exception("That's not a valid file name.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            points = 0;
        }

        return points;
    }

}
