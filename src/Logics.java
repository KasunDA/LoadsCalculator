public class Logics {

    String LBweight;
    String PeopleNo;
    Double weightOfLB;
    Double noOfPeople;
    double weightInLB = 0.0;
    double totalWeight = 0.0;
    double davitWeight = 0.0;

    public double weightInLbCalc() {
        if (LBweight != null && PeopleNo != null) {
            weightOfLB = Double.parseDouble(LBweight.replaceAll("[^0-9.]", ""));
            noOfPeople = Double.parseDouble(PeopleNo.replaceAll("[^0-9.]", ""));
            weightInLB = (weightOfLB * 0.1) + (noOfPeople * 75 * 1.1);
        }
        return weightInLB;
    }

    public double totalWeightCalc() {
        weightOfLB = Double.parseDouble(LBweight.replaceAll("[^0-9.]", ""));
        totalWeight = weightOfLB + weightInLB;
        return totalWeight;
    }

    public double davitWeightCalc() {
        davitWeight = totalWeight;
        return davitWeight;
    }

    String RBweight;
    Double weightOfRB;
    String PeopleNo;
    Double noOfPeople;
    double weightInRB;
    double totalWeight;
    double davitWeight;

    public double weightInRbCalc(){
        if (RBweight!=null && PeopleNo!=null) {
            weightOfRB = Double.parseDouble(RBweight.replaceAll("[^0-9.]", ""));
            noOfPeople = Double.parseDouble(PeopleNo.replaceAll("[^0-9.]", ""));
            weightInRB = (weightOfRB * 1.1) + (noOfPeople * 75 * 1.1);
        }
        return weightInRB;
    }

    public double totalWeightCalc(){
        weightOfRB = Double.parseDouble(RBweight.replaceAll("[^0-9.]", ""));
        totalWeight = weightOfRB + weightInRB;
        return totalWeight;
    }

    public double davitWeightCalc(){
        davitWeight = totalWeight;
        return davitWeight;
    }

    private double davitWeight;
    static String SWLStr;
    private Double SWL;

    public double davitWeightCalc(){
        SWL = Double.parseDouble(SWLStr.replaceAll("[^0-9.]", ""));
        davitWeight = SWL*1.1;
        return davitWeight;
    }
}
