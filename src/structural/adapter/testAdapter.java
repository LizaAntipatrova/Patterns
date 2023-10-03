package structural.adapter;

import structural.adapter.json.JSONFile;
import structural.adapter.json.SecretMaterialsJSON;
import structural.adapter.xml.XMLFile;

public class testAdapter {
    public static void main(String[] args) {
        JSONFile json = new SecretMaterialsJSON();
        json.setContent("{\"meow\"}");
        JSONToXMLAdapter adapter = new JSONToXMLAdapter(json);
        XMLFile xml = adapter.translateToXML();
        System.out.println(xml.getContent());
    }
}
