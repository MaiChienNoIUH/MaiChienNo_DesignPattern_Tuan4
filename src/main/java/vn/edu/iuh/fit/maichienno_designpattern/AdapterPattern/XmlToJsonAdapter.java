package AdapterPattern;

public class XmlToJsonAdapter implements DataAdapter{
    private XmlService xmlService;

    public XmlToJsonAdapter(XmlService xmlService) {
        this.xmlService = xmlService;
    }

    @Override
    public String convertToJSON() {
        String xml = xmlService.convertToXML();
        // Chuyển đổi XML thành JSON (ví dụ đơn giản)
        return "{\"message\": \"Hello World!\"}";
    }
}
