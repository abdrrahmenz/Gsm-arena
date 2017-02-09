package id.or.qodr.gsmarena.parser;

import java.util.ArrayList;

import id.or.qodr.gsmarena.model.AllBrandsModel;
import id.or.qodr.gsmarena.model.AllProductModel;

/**
 * Created by adul on 11/01/17.
 */

public class DataParser {

//    public ParsingResult data;

}

class ParsingResult {

    public ArrayList<AllBrandsModel> data;

    public ArrayList<AllBrandsModel> getDataBrands() {
        return data;
    }
}

class ParsingProduct {

    public ArrayList<AllProductModel> data;

    public ArrayList<AllProductModel> getDataProduct() {
        return data;
    }
}

class ParsingDetails {

}
