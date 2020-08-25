package by.jrr.jis4.service;

import by.jrr.jis4.bean.Product;

public class ProductService {
public double actualPrice(Product product){
    double firstIntermediateCalculationOfTheRegularPrice = (product.getRegularPrice() * (1 - product.getDiscount() / 100)) * 100 + 0.5;
    int secondIntermediateCalculationOfTheRegularPrice = (int) firstIntermediateCalculationOfTheRegularPrice;

    return (double) secondIntermediateCalculationOfTheRegularPrice / 100;
}

public String printInformation(Product product){
    ProductService productService = new ProductService();
    String printInformationAboutName = "Product : name = " + product.getName() + ", ";
    String printInformationRegularPrice = "regular price = " + product.getRegularPrice() + " EUR, ";
    String printInformationAboutDiscount = "discount = " + product.getDiscount() + "%, ";
    String printInformationAboutActualPrice = "actual price = " + productService.actualPrice(product) + " EUR";

   return printInformationAboutName + printInformationRegularPrice + printInformationAboutDiscount + printInformationAboutActualPrice;
}
}
