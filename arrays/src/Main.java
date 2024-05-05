import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {


        //[0-9]{0,}
        //
        //
        //
        String pattern = "[0-9]{3}";
        String test = "ASD";


        if(test.matches(pattern)){
            System.out.println("It matches");
        }
        else{
            System.out.println("It doesn't match");
        }



    }
}
