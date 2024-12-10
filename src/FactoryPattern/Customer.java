package FactoryPattern;

public class Customer extends Person{
    private int txId;
    private double billAmount;
    public Customer(String name, String address, AadharDetails aadharDetails,int txId,double billAmount) {
        super(name, address, aadharDetails);
        System.out.println("Customer constructor called");
        this.txId = txId;
        this.billAmount = billAmount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "txId=" + txId +
                ", billAmount=" + billAmount +
                '}';
    }
}
