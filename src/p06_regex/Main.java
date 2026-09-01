//01-09-2026
//first regex tests

package p06_regex;

import p06_regex.domain.Product;
import p06_regex.domain.ValidateProduct;
import p06_regex.domain.exception.InvalidProductException;

public class Main {
    public static void main(String[] args) {
        String[] inputs = { //inputs with wrong strings tests
                "Pc Ultra Gamer;R$9999;COD-2024-A1",
                "Mouse Logitech;R$799;COD-2023-B2",
                "SeiLa;253;COD-2025-B3",
                "Mechanical Keyboard;R$199;COD-2025-C3",
                "Magnetic Keyboard;R$399;COD-2026-C4",
                "Samsung Notebook;R$2399;CAD-2026-C4",
                "OLD PC;R$90;CAD-1996-C4"
        };


        int counter = 0;
        Product[] products = new Product[100];
        ValidateProduct validator = new ValidateProduct();

        for (String input : inputs) {
            try {
                products[counter] = validator.validateProduct(input);
                counter++;
            } catch (InvalidProductException e) {
                System.out.println("Produto inválido: " + input);
            }
        }

        for (int i = 0; i < counter; i++) {
            System.out.println(products[i]);
        }
    }
}
