package edu.ucaldas.estructurales.adapter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdapterTest {

    @Test
    void shouldConvertXMLtoJSON() {
        XMLService xmlService = new XMLService();
        JSONService adapter = new XMLtoJSONAdapter(xmlService);

        String json = adapter.getJSON();

        assertNotNull(json);
        assertTrue(json.contains("{"));
    }
}
