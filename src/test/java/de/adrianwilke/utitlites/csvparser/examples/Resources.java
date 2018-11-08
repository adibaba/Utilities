package de.adrianwilke.utitlites.csvparser.examples;

import java.io.InputStream;

/**
 * Resources.
 *
 * @author Adrian Wilke
 */
public abstract class Resources {

	/**
	 * String containing CSV.
	 */
	public static final String CSV_STRING = "Hello,World" + "\n" + "Hello,\"You, too\"";

	/**
	 * Location of the example CSV file.
	 */
	public static final String CSV_RESOURCE = "de/adrianwilke/utitlites/csvparser/examples/example.csv";

	/**
	 * Input stream of the example CSV.
	 */
	public static final InputStream CSV_INPUTSTREAM = Resources.class.getClassLoader()
			.getResourceAsStream(CSV_RESOURCE);

	/**
	 * String containing TSV.
	 */
	public static final String TSV_STRING = "Hello" + "\t" + "World" + "\n" + "Hello" + "\t" + "\"You, too\"";

	/**
	 * Location of the example TSV file.
	 */
	public static final String TSV_RESOURCE = "de/adrianwilke/utitlites/csvparser/examples/example.tsv";

	/**
	 * Input stream of the example TSV.
	 */
	public static final InputStream TSV_INPUTSTREAM = Resources.class.getClassLoader()
			.getResourceAsStream(TSV_RESOURCE);

}