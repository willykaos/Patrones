package edu.ucaldas.estructurales.decorator;

public class BasicProduct implements Product {
    public double getPrice() {
        return 10;
    }

    public String getDescription() {
        return "Producto base";
    }
}