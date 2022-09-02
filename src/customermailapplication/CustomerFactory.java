// package customermailapplication;

class CustomerFactory{
    Customer customer;
    public Customer createCustomer(String type){
        if(type.equals("Regular")){
            return customer = new RegularCustomer();
        }
        else if(type.equals("Mountain")){
            return customer = new MountainCustomer();
        }
        else if(type.equals("Delinquent")){
            return customer = new DelinquentCustomer();
        }
        else{
            return null;
        }
        
    }

    public String generateMail() {
        return customer.createMail();
    }
}