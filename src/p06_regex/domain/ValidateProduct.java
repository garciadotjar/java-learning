package p06_regex.domain;

import p06_regex.domain.exception.InvalidProductException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateProduct {
    public Product validateProduct(String input)  throws InvalidProductException {
        String regex = "([\\p{L} ]+);R\\$(\\d+);(COD-(20\\d{2})-([A-Z])\\d)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (!matcher.find()) {
            throw new InvalidProductException(input);
        }
        String name =  matcher.group(1);
        Double price = Double.parseDouble(matcher.group(2));
        String code =  matcher.group(3);
        Integer year =   Integer.parseInt(matcher.group(4));
        return new Product(name, price, code, year);
    }
}
