public class UsePackage {
    public static void main(String[] args) {
        Package PKone= new Package(22,'T');
        System.out.println(PKone.ShippingCost);
        Package PKtwo=new Package(33,'A');
        System.out.println(PKtwo.ShippingCost);
        Package PKthree= new Package(32,'M');
        System.out.println(PKthree.ShippingCost);
        InsuredPackage PK1= new InsuredPackage(15,'A');
        PK1.setFinalCost();
        System.out.println(PK1.finalCost);
        InsuredPackage PK2=new InsuredPackage(32,'M');
        PK2.setFinalCost();
        System.out.println(PK2.finalCost);
        InsuredPackage PK3= new InsuredPackage(22,'T');
        PK3.setFinalCost();
        System.out.println(PK3.finalCost);
    }


}

