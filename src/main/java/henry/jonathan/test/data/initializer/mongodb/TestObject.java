package henry.jonathan.test.data.initializer.mongodb;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author henry.jonathan
 * @since
 */
@Data
@Document
public class TestObject {
  private String testField1;
  private int testField2;
}
