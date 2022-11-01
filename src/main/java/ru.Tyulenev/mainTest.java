package ru.Tyulenev;

public class mainTest {
    public static void main(String[] args) {
        String dirName1 = "c:\\Users\\a.tulenev\\Videos\\FileTestFolder\\";
        String dirName2 = "c:\\Users\\a.tulenev\\Vid";

        FileRenamer fr1 = new FileRenamer(dirName1);
        System.out.println(fr1.getCountOfFilesInDir());
        FileRenamer fr2 = new FileRenamer(dirName2);
        System.out.println(fr2.getCountOfFilesInDir());

    }
}
