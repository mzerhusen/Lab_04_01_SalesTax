public class SalesTax {
    public static void main(String[] args)
    {
        final double SALES_TAX = .05;
        double itemPrice = 4.99;
        double itemTax = 0;
        double totalPrice = 0;

        itemTax = itemPrice * SALES_TAX;
        itemTax = itemTax * 100;
        itemTax = Math.round(itemTax);
        itemTax = itemTax / 100;
        totalPrice = itemPrice + itemTax;


        System.out.println("The item price is " + itemPrice + ", the sales tax is " + itemTax + ", so your total will be " + totalPrice);
    }
}