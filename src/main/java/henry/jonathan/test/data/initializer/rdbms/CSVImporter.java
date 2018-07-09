package henry.jonathan.test.data.initializer.rdbms;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.util.List;

/**
 * @author henry.jonathan
 * @since
 */
public class CSVImporter {
  public static void main(String[] args) throws Exception {
    CsvMapper csvMapper = new CsvMapper();
    CsvSchema csvSchema = CsvSchema.emptySchema().withHeader();
    MappingIterator<TestObject> iterator = csvMapper.readerFor(TestObject.class)
        .with(csvSchema)
        .readValues(new File(CSVImporter.class.getClassLoader().getResource("table.csv").toURI()));
    List<TestObject> datas = iterator.readAll();
    System.out.println(datas);
  }
}
