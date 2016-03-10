package com.helper;

import java.io.*;

public class ReadGuestList{
    private final String fileName;
    public ReadGuestList(String fileName) {
        this.fileName = fileName;
    }
    public String[] read() {
        String line;
        StringBuilder sb = new StringBuilder("");
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(this.fileName)));
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } catch (FileNotFoundException e){
            System.err.println("File not Found");
            System.exit(1);
        } catch (IOException e) {
            System.err.println("unable to Read");
            System.exit(1);
        }
        return sb.toString().trim().split("\n");
    }
}
