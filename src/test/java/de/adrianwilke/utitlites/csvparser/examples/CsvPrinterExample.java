package de.adrianwilke.utitlites.csvparser.examples;

import java.io.IOException;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;

import de.adrianwilke.utitlites.csvparser.CsvParser;

/**
 * Examples for {@link CSVPrinter}.
 *
 * @author Adrian Wilke
 */
public class CsvPrinterExample {

	public static void main(String[] args) throws IOException {

		System.out.println("--- csvPrinterExample ---");
		csvPrinterExample();

		System.out.println("--- csvPrinterCloseExample ---");
		csvPrinterCloseExample();

		System.out.println("--- csvPrinterSystemOutExample ---");
		csvPrinterSystemOutExample();
	}

	public static void csvPrinterExample() throws IOException {

		System.out.println();
		System.out.println("Use of CSVPrinter");
		System.out.println();

		CSVParser csvParser = new CsvParser().parse(Resources.CSV_INPUTSTREAM);

		StringBuilder stringBuilder = new StringBuilder();
		CSVPrinter csvPrinter = new CSVPrinter(stringBuilder, CSVFormat.DEFAULT);
		csvPrinter.printRecords(csvParser);
		csvPrinter.close();

		csvParser.close();

		System.out.println(stringBuilder);
	}

	public static void csvPrinterCloseExample() throws IOException {

		System.out.println();
		System.out.println("You have to close CSVParser manually");
		System.out.println();

		CSVParser csvParser = new CsvParser().parse(Resources.CSV_INPUTSTREAM);
		CSVPrinter csvPrinter = new CSVPrinter(new StringBuilder(), CSVFormat.DEFAULT);
		csvPrinter.close();

		System.out.println("CSVParser is " + (csvParser.isClosed() ? "" : "NOT ") + "closed");
		csvParser.close();
		System.out.println("CSVParser is " + (csvParser.isClosed() ? "" : "NOT ") + "closed");
		System.out.println();
	}

	public static void csvPrinterSystemOutExample() throws IOException {

		System.out.println();
		System.out.println("Do not use 'System.out' as parameter for CSVPrinter, as it will be closed.");
		System.out.println();

		CSVParser csvParser = new CsvParser().parse(Resources.CSV_INPUTSTREAM);
		CSVPrinter csvPrinter = new CSVPrinter(System.out, CSVFormat.DEFAULT);
		csvPrinter.close();
		csvParser.close();

		System.out.println("Sorry, System.out is closed");
		System.err.println("No message.");
	}
}
