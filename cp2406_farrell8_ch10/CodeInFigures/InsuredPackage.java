public class InsuredPackage extends Package {
    public InsuredPackage (int Weight, char ShippingMethod){
        super(Weight, ShippingMethod);
    }
    public double finalCost;
    public double getFinalCost(){
        return finalCost;
    }
    public void setFinalCost(){
        if(super.ShippingCost<1){
            this.finalCost=super.ShippingCost+ 2.45;
        }
        else if(super.ShippingCost<1.01 && ShippingCost>=3.00){
            this.finalCost=super.ShippingCost+ 3.95;
        }
        else{
            this.finalCost=super.ShippingCost + 5.55;
        }
    }
}



