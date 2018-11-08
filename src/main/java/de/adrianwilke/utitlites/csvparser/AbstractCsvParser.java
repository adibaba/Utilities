package de.adrianwilke.utitlites.csvparser;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

/**
 * Abstract CSV parser.
 * 
 * All methods are protected and can only be accessed by subclasses. Subclasses
 * have to provide public access.
 *
 * Default use of {@link CSVFormat#DEFAULT} and {@link StandardCharsets#UTF_8}.
 * 
 * @see https://github.com/adibaba/Utilities/tree/csvparser
 * @see https://github.com/adibaba/Utilities/wiki/CSV-Parser
 *
 * @author Adrian Wilke
 */
public abstract class AbstractCsvParser {

	private Charset charset = StandardCharsets.UTF_8;
	private CSVFormat csvFormat = CSVFormat.DEFAULT;
	private CSVParser csvParser;

	protected Charset getCharset() {
		return charset;
	}

	protected CSVFormat getCsvFormat() {
		return csvFormat;
	}

	/**
	 * @return Internal {@link CSVParser} or
	 * 
	 *         null, if no parse method was called before.
	 */
	protected CSVParser getCsvParser() {
		return csvParser;
	}

	protected AbstractCsvParser setCharset(Charset charset) {
		this.charset = charset;
		return this;
	}

	protected AbstractCsvParser setCsvFormat(CSVFormat csvFormat) {
		this.csvFormat = csvFormat;
		return this;
	}

	protected CSVParser parse(File csv) throws IOException {
		csvParser = CSVParser.parse(csv, charset, csvFormat);
		return csvParser;
	}

	protected CSVParser parse(InputStream csv) throws IOException {
		csvParser = CSVParser.parse(csv, charset, csvFormat);
		return csvParser;
	}

	protected CSVParser parse(Path csv) throws IOException {
		csvParser = CSVParser.parse(csv, charset, csvFormat);
		return csvParser;
	}

	protected CSVParser parse(Reader csv) throws IOException {
		csvParser = CSVParser.parse(csv, csvFormat);
		return csvParser;
	}

	protected CSVParser parse(String csv) throws IOException {
		csvParser = CSVParser.parse(csv, csvFormat);
		return csvParser;
	}

	protected CSVParser parse(URL csv) throws IOException {
		csvParser = CSVParser.parse(csv, charset, csvFormat);
		return csvParser;
	}
}