// package customermailapplication;

class CustomerFactory{
    Customer customer;
    public Customer createCustomer(String type){
        if(type.equals("Regular")){
            customer = new RegularCustomer();
            generateMail();
            return customer;
        }
        else if(type.equals("Mountain")){
            customer = new MountainCustomer();
            generateMail();
            return customer;
        }
        else if(type.equals("Delinquent")){
            customer = new DelinquentCustomer();
            generateMail();
            return customer;
        }
        return null;
        
    }

    public String generateMail() {
        return customer.createMail();
    }
}