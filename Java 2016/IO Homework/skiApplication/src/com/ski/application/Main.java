package com.ski.application;

public class Main {

    public static void main(String[] args) {
	 CSVReader csvReader = new CSVReader();
	 csvReader.reader("E:\\GIT\\skiApplication\\src\\com\\ski\\application\\csvFile.csv");
	 csvReader.list();
	 csvReader.calculateTheTime();
	 csvReader.list();
	 csvReader.sortListByTime();

        System.out.println("The Winner is: " + csvReader.athletes.get(0) + "\nThe Runner-up is: " +
                                                csvReader.athletes.get(1) + "\nThird Place is: " +
                                                csvReader.athletes.get(2));
    }
}
