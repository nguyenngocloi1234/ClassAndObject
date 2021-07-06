package stock;

public class TestStock {
    public static void main(String[] args) {
        Stock stock1 = new Stock("ORCL","Oracle Corporation");
        stock1.setPreviousClosingPrice(34.35);
        stock1.setCurrentPrice(34.5);
        System.out.println("ChargePercent: "+stock1.getChargePercent()+ " %");
    }
}
