package edu.wctc.salesreporter.imp.input;

import edu.wctc.salesreporter.Sale;
import edu.wctc.salesreporter.face.SalesInput;

import java.io.FileReader;
import java.util.List;

public class FileInput implements SalesInput {

    public FileInput(){
        System.out.println("File Chosen");
    }
    @Override
    public List<Sale> getSales() {
        return null;
    }
}
