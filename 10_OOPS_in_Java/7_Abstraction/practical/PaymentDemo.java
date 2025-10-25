package practice;

interface Payment{
    void makePayment(long amount);
    void refund(long amount);
};

class Creditcard implements Payment{
    private long cardNumber;

    @Override
    public void makePayment(long amount){
        System.out.println("Amount is " + amount);
    }

    @Override
    public void refund(long amount){
        System.out.println("Amount is " + amount);
    }
};

class PhonePay implements Payment{
    private long phoneNumber;

    @Override
    public void makePayment(long amount){
        System.out.println("Amount is " + amount);
    }

    @Override
    public void refund(long amount){
        System.out.println("Amount is " + amount);
    }
};

public class PaymentDemo{
    public static void main(String[] args){
        Payment paymentCredit = new Creditcard();
        paymentCredit.makePayment(1000);
        paymentCredit.refund(5000);

        Payment paymentPhonepay = new PhonePay();
        paymentPhonepay.makePayment(2000);
        paymentPhonepay.refund(10000);
    }
};