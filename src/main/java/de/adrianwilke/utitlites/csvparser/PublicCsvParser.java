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
 * Public CSV parser.
 * 
 * Provides public methods for parsing CSV sources and for accessing internal
 * variables.
 *
 * Default use of {@link CSVFormat#DEFAULT} and {@link StandardCharsets#UTF_8}.
 * 
 * @see https://github.com/adibaba/Utilities/tree/csvparser
 * @see https://github.com/adibaba/Utilities/wiki/CSV-Parser
 *
 * @author Adrian Wilke
 */
public class PublicCsvParser extends AbstractCsvParser {

	public Charset getCharset() {
		return super.getCharset();
	}

	public CSVFormat getCsvFormat() {
		return super.getCsvFormat();
	}

	/**
	 * @return Internal {@link CSVParser} or
	 * 
	 *         null, if no parse method was called before.
	 */
	public CSVParser getCsvParser() {
		return super.getCsvParser();
	}

	public PublicCsvParser setCharset(Charset charset) {
		super.setCharset(charset);
		return this;
	}

	public PublicCsvParser setCsvFormat(CSVFormat csvFormat) {
		super.setCsvFormat(csvFormat);
		return this;
	}

	public CSVParser parse(File csv) throws IOException {
		return super.parse(csv);
	}

	public CSVParser parse(InputStream csv) throws IOException {
		return super.parse(csv);
	}

	public CSVParser parse(Path csv) throws IOException {
		return super.parse(csv);
	}

	public CSVParser parse(Reader csv) throws IOException {
		return super.parse(csv);
	}

	public CSVParser parse(String csv) throws IOException {
		return super.parse(csv);
	}

	public CSVParser parse(URL csv) throws IOException {
		return super.parse(csv);
	}
}