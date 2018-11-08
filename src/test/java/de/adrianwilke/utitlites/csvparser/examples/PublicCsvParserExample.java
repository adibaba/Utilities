package de.adrianwilke.utitlites.csvparser.examples;

import java.io.IOException;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import de.adrianwilke.utitlites.csvparser.PublicCsvParser;

/**
 * Example for {@link PublicCsvParser}.
 *
 * @author Adrian Wilke
 */
public class PublicCsvParserExample {

	public static void main(String[] args) throws IOException {

		/**
		 * Concrete class providing public methods for parsing TSV sources.
		 * 
		 * The used charset and CSV/TSV format can be changed by instances.
		 */
		final class PublicTsvParser extends PublicCsvParser {
			public PublicTsvParser() {
				setCsvFormat(CSVFormat.TDF);
			}
		}

		// (1) Parse input stream with default configuration

		for (CSVRecord csvRecord : new PublicTsvParser().parse(Resources.TSV_INPUTSTREAM)) {
			for (String string : csvRecord) {
				System.out.print("[" + string + "] ");
			}
			System.out.println();
		}
		System.out.println();

		// (2) Parse string with default configuration

		for (CSVRecord csvRecord : new PublicTsvParser().parse(Resources.TSV_STRING)) {
			for (String string : csvRecord) {
				System.out.print("[" + string + "] ");
			}
			System.out.println();
		}
		System.out.println();

		// (3) Change configuration and parse input stream

		PublicTsvParser publicTsvParser = new PublicTsvParser();
		CSVFormat csvFormat = publicTsvParser.getCsvFormat().withDelimiter(',');
		publicTsvParser.setCsvFormat(csvFormat);

		for (CSVRecord csvRecord : publicTsvParser.parse(Resources.CSV_INPUTSTREAM)) {
			for (String string : csvRecord) {
				System.out.print("[" + string + "] ");
			}
			System.out.println();
		}
		System.out.println();
	}
}