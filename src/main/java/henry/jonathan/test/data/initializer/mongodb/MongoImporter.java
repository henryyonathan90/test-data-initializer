package henry.jonathan.test.data.initializer.mongodb;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author henry.jonathan
 * @since
 */
public class MongoImporter {

  public static void main(String[] args) throws Exception {
    byte[] bytes = Files.readAllBytes(Paths.get(MongoImporter.class.getClassLoader()
        .getResource("collection.json")
        .toURI()));
    List<TestObject> data = new ObjectMapper().readValue(bytes, new TypeReference<List<TestObject>>() {
    });

    System.out.println(data);

    //As long as TestObject is document then just insert to MongoDB using spring data

    //    MongoCredential mongoCredential = MongoCredential.createScramSha1Credential("user",
    //        "java_import_test",
    //        "12345".toCharArray());
    //    MongoClient mongoClient =
    //        new MongoClient(new ServerAddress("localhost", 27017), Arrays.asList(mongoCredential));
    //    MongoDatabase mongoDatabase = mongoClient.getDatabase("java_import_test");
  }

}
