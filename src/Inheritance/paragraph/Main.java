package Inheritance.paragraph;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String stext = sc.nextLine();
        String caption = sc.nextLine();
        Text text = new Text(stext);
        Paragraph paragraph = new Paragraph(stext,caption);


        System.out.println(text);
        System.out.println(paragraph);

        Text text_copy = text.myClone();
        Paragraph paragraph_copy = paragraph.myClone();
        text_copy.appendText("and it’s great ");
        paragraph_copy.changeCaption("My custom caption");

        System.out.println(text_copy);
        System.out.println(paragraph_copy);
        System.out.println(text);
        System.out.println(paragraph);

    }
}

