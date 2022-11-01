package ru.Tyulenev;

import java.io.File;

public class FileRenamer {
    private File file;
    private File[] listOfFiles;

    public FileRenamer(String fileName) {
        file = new File(fileName);
        if (file.isDirectory()) {
            listOfFiles = file.listFiles();
            if (getCountOfFilesInDir()>0) {
                printFullFilesNameInFolder();
            } else System.out.println("Current folder (" + file.getAbsolutePath() +
                    "is empty");

        } else System.out.println("Current folder (" + file.getAbsolutePath() +
                ") does not exsist");
    }


    private void printFilesInFolder() {
        System.out.println("File list in folder (" + file.getAbsolutePath() + ")");
        for (File fileInDir:listOfFiles) {
            System.out.println(fileInDir.getName());
        }
    }

    private void printFullFilesNameInFolder () {
        for (File fileInDir:listOfFiles) {
            File nf = new File(fileInDir.getParent() + "\\" + fileInDir.getName());
            System.out.println(nf.getAbsoluteFile());
        }
    }

    public int getCountOfFilesInDir() {
        if (listOfFiles != null)    return listOfFiles.length;
        else return 0;

    }

    public void addStrToFilesInDir(String addedStr) {

    }
}
