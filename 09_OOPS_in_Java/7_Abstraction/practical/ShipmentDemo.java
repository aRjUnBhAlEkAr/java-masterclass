package shipment;

interface Shipment{
    void calculateCost();
    void getDeliveryTime();
    void trackShipment();
};

interface InternationalShipment extends Shipment{
    void getCustomDuties();
    void getCountry();
};

interface Insurance{
    void addInsurance(double amount);
    void getInsuranceDetails();
};

class StandardShipment implements Shipment{
    private double weight;
    private double costPerKg;
    private String trackingNumber;

    @Override
    public void calculateCost(){

    }

    @Override
    public void getDeliveryTime(){

    }

    @Override
    public void trackShipment(){

    }
};

class ExpressShipment implements Shipment, Insurance{
    private double weight;
    private double costPerKg;
    private String trackingNumber;
    private double insuranceAmount;

    @Override
    public void calculateCost(){

    }

    @Override
    public void getDeliveryTime(){

    }

    @Override
    public void trackShipment(){

    }

    @Override
    public void addInsurance(double amount){

    }  

    @Override
    public void getInsuranceDetails(){

    }
};

class InternationalExpressShipment implements InternationalShipment, Insurance{
    private double weight;
    private double costPerKg;
    private String trackingNumber;
    private double insuranceAmount;
    private String destinationCountry;
    private double customDutie;
    
    @Override
    public void calculateCost(){

    }

    @Override
    public void getDeliveryTime(){

    }

    @Override
    public void trackShipment(){

    }

    @Override
    public void getCustomDuties(){

    }

    @Override
    public void getCountry(){

    }

    @Override
    public void addInsurance(double amount){

    }  

    @Override
    public void getInsuranceDetails(){

    }
};

public class ShipmentDemo{
    public static void main(String[] args){
        StandardShipment standardshipment = new StandardShipment();
        ExpressShipment expressshipment = new ExpressShipment();
        InternationalExpressShipment internationalexpressshipment = new InternationalExpressShipment();
        
    }
};