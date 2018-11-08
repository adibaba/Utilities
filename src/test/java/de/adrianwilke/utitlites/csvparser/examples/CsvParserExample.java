package de.adrianwilke.utitlites.csvparser.examples;

import java.io.IOException;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import de.adrianwilke.utitlites.csvparser.CsvParser;

/**
 * Example for {@link CsvParser}.
 *
 * @author Adrian Wilke
 */
public class CsvParserExample {

	public static void main(String[] args) throws IOException {

		/**
		 * Concrete class providing public methods for parsing TSV sources.
		 * 
		 * The used charset and CSV/TSV format can NOT be changed by instances.
		 */
		final class TsvParser extends CsvParser {
			public TsvParser() {
				setCsvFormat(CSVFormat.TDF);
			}
		}

		// (1) Parse input stream with default configuration

		for (CSVRecord csvRecord : new TsvParser().parse(Resources.TSV_INPUTSTREAM)) {
			for (String string : csvRecord) {
				System.out.print("[" + string + "] ");
			}
			System.out.println();
		}
		System.out.println();

		// (2) Parse string with default configuration

		for (CSVRecord csvRecord : new TsvParser().parse(Resources.TSV_STRING)) {
			for (String string : csvRecord) {
				System.out.print("[" + string + "] ");
			}
			System.out.println();
		}
		System.out.println();

		// (3) Change configuration and parse input stream

		TsvParser tsvParser = new TsvParser();
		// Can not be changed
		// CSVFormat csvFormat = tsvParser.getCsvFormat().withDelimiter(',');
		// tsvParser.setCsvFormat(csvFormat);

		// Will not work correctly
		for (CSVRecord csvRecord : tsvParser.parse(Resources.CSV_INPUTSTREAM)) {
			for (String string : csvRecord) {
				System.out.print("[" + string + "] ");
			}
			System.out.println();
		}
		System.out.println();
	}
}