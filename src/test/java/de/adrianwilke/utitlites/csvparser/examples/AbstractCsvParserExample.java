package de.adrianwilke.utitlites.csvparser.examples;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import de.adrianwilke.utitlites.csvparser.AbstractCsvParser;

/**
 * Example for {@link AbstractCsvParser}.
 *
 * @author Adrian Wilke
 */
public class AbstractCsvParserExample {

	public static void main(String[] args) throws IOException {

		/**
		 * Concrete class providing a public method for parsing TSV input streams.
		 * 
		 * The used charset and CSV/TSV format can NOT be changed by instances.
		 */
		final class ProtectedTsvParser extends AbstractCsvParser {
			public ProtectedTsvParser() {
				setCsvFormat(CSVFormat.TDF);
			}

			public CSVParser parse(InputStream tsv) throws IOException {
				return super.parse(tsv);
			}
		}

		// (1) Parse input stream with default configuration

		for (CSVRecord csvRecord : new ProtectedTsvParser().parse(Resources.TSV_INPUTSTREAM)) {
			for (String string : csvRecord) {
				System.out.print("[" + string + "] ");
			}
			System.out.println();
		}
		System.out.println();

		// (2) Parse string with default configuration

		// String can not be parsed
		// new ProtectedTsvParser().parse(Resources.TSV_STRING);

		// (3) Change configuration and parse input stream

		ProtectedTsvParser protectedCsvParser = new ProtectedTsvParser();
		// Can not be changed
		// CSVFormat csvFormat = protectedCsvParser.getCsvFormat().withDelimiter(',');
		// protectedCsvParser.setCsvFormat(csvFormat);

		// Will not work correctly
		for (CSVRecord csvRecord : protectedCsvParser.parse(Resources.CSV_INPUTSTREAM)) {
			for (String string : csvRecord) {
				System.out.print("[" + string + "] ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
