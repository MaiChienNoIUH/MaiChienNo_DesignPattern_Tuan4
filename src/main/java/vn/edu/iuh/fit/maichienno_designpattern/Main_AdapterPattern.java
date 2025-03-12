import AdapterPattern.DataAdapter;
import AdapterPattern.JsonService;
import AdapterPattern.XmlService;
import AdapterPattern.XmlToJsonAdapter;

public class Main_AdapterPattern {
    public static void main(String[] args) {
        XmlService xmlService = new XmlService();
        DataAdapter adapter = new XmlToJsonAdapter(xmlService);
        JsonService jsonService = new JsonService(adapter);

        System.out.println(jsonService.getData());
    }
}
