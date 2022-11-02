package ru.Tyulenev;

import java.util.Scanner;

public class mainTest {
    public static void main(String[] args) {
        String dirName1 = "c:\\Users\\a.tulenev\\Videos\\FileTestFolder\\";
        String dirName2 = "c:\\Users\\a.tulenev\\Vid";
        Scanner in = new Scanner(System.in);


        while (true) {
            System.out.println("Input the path to rename: ");
            String path = in.nextLine();
            FileRenamer fr1 = new FileRenamer(path);

            if (fr1.getCountOfFilesInDir()>0) {
                System.out.println("What do you want tot do: " +
                        "\n1: add to file name string" +
                        "\n2: remove from file name" +
                        "\n10: nothing. End program");
                int menuChoise=in.nextInt();
                in.nextLine();


                switch (menuChoise){
                    case 1:
                        System.out.println("What need to add in the begin of file? ");
                        String strToAdd = in.nextLine();
                        fr1.addStrToFilesInDir(strToAdd);
                        break;
                    case 2:
                        System.out.println("What need to DELETE in the begin of file? ");
                        String strToDel = in.nextLine();
                        fr1.deleteStringInBegin(strToDel);
                        break;

                    case 10:
                        break;

                    default:
                        throw new IllegalArgumentException("illegal menu parameter: " + menuChoise);
                }
            break;
            }
            else System.out.println("END!");
        }




    }
}
