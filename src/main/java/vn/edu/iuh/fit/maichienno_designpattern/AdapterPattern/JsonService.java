package AdapterPattern;

public class JsonService {
    private DataAdapter dataAdapter;

    public JsonService(DataAdapter dataAdapter) {
        this.dataAdapter = dataAdapter;
    }

    public String getData() {
        return dataAdapter.convertToJSON();
    }
}
