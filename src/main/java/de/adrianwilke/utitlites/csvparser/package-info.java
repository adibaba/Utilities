/**
 * This package provides abstract classes to implement CSV parsers.
 * 
 * The abstract classes define defaults for {@link java.nio.charset.Charset} and
 * {@link org.apache.commons.csv.CSVFormat}.
 * 
 * Internally, the final class {@link org.apache.commons.csv.CSVParser} is used,
 * which can not be extended itself.
 * 
 * 
 * Contained classes:
 * 
 * {@link CsvParser} Provides public methods for parsing CSV sources.
 * Methods to access internal variables are protected.
 * 
 * {@link PublicCsvParser} Provides public methods for parsing CSV
 * sources and for accessing internal variables.
 * 
 * {@link AbstractCsvParser} All methods are protected and can only be
 * accessed by subclasses. Subclasses have to provide public access.
 * 
 * 
 * @see https://github.com/adibaba/Utilities/tree/csvparser
 * @see https://github.com/adibaba/Utilities/wiki/CSV-Parser
 * 
 * @author Adrian Wilke
 */
package de.adrianwilke.utitlites.csvparser;