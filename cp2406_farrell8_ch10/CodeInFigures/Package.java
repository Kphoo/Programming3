public class Package {
    int Weight;
    char ShippingMethod;
    double ShippingCost;

    public  Package(int weight,char shippingMethod){
        this.Weight= Weight;
        this.ShippingMethod= shippingMethod;
        this.ShippingCost= CalculateCost(Weight , ShippingMethod);
    }
    public int getWeight(){
        return Weight;
    }
    public void setWeight(int weight){
        Weight= weight;
    }

    public char getShippingMethod(){
        return ShippingMethod;
    }

    public void setShippingMethod(char ShippingMethod){
        ShippingMethod= ShippingMethod;

    }
    public double getShippingCost(){
        return ShippingCost;
    }
    public void setShippingCost(double shippingCost){
        ShippingCost=shippingCost;
    }

    public static double CalculateCost(int Weight, char ShippingMethod) {
        double cost;
        if (Weight > 1 && Weight < 8 && ShippingMethod == 'A') {
            cost = 2;
        } else if (Weight > 1 && Weight < 8 && ShippingMethod == 'T') {
            cost = 1.50;
        }
        else if (Weight>1 && Weight<8 && ShippingMethod == 'M'){
            cost=.50;
        }
        else if (Weight>9 && Weight<16 && ShippingMethod == 'A'){
            cost=3.00;
        }
        else if (Weight>9 && Weight<16 && ShippingMethod == 'T'){
            cost=2.35;
        }
        else if (Weight>9 && Weight<16 && ShippingMethod == 'M'){
            cost=1.50;
        }
        else if (Weight>=17 && ShippingMethod == 'A'){
            cost=4.50;
        }
        else if (Weight>=17 && ShippingMethod == 'T'){
            cost=3.25;
        }
        else {
            cost=2.15;
        }
        return cost;
    }
    public void display(int weight,char shippingMethod, double shippingCost){
        System.out.println("Your items is " + weight+ "in weight, is shipped by " + shippingMethod + "and costs " + shippingCost);
    }

}