package edu.ucaldas.estructurales.adapter;

public class XMLtoJSONAdapter implements JSONService {
    private XMLService xmlService;

    public XMLtoJSONAdapter(XMLService xmlService) {
        this.xmlService = xmlService;
    }

    public String getJSON() {
        // TODO: convertir XML a JSON
        return null;
    }
}