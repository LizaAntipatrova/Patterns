package structural.adapter;

import structural.adapter.json.JSONFile;
import structural.adapter.xml.SecretMaterialsXML;
import structural.adapter.xml.XMLFile;

public class JSONToXMLAdapter {
    JSONFile importantFile;


    public JSONToXMLAdapter(JSONFile importantFile) {
        this.importantFile = importantFile;
    }

    public XMLFile translateToXML() {
        XMLFile xml = new SecretMaterialsXML();
        xml.setContent(importantFile.getContent()
                .replaceAll("\\{\"(.+)\"}", "<$1>"));
        return xml;
    }
}
