import com.mongodb.MongoClientURI;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

class Demo{
    public static void main(String args[]){
        MongoClientURI con =  new MongoClientURI("mongodb://localhost");
        MongoClient cli = new MongoClient("localhost");
        
        MongoDatabase db = cli.getDatabase("mydb");

        MongoCollection<Document> collection = db.getCollection("demo");

        Document doc = new Document();

        // collection.insert({"name":"sudeep","age":19})

        // doc.put("name","sudeep");
        // doc.put("education","tybscit");

        Document doc2 = new Document();
        doc2.put("name","raj");
        doc2.put("education","tybscit");
        doc2.put("city","mumbai");

        System.out.println(doc2);
        

        collection.insertOne(doc2);
        MongoCollection col = db.getCollection("demo");
        System.out.println(col.find());
    }
}