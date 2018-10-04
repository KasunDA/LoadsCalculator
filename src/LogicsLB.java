public class LogicsLB {

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
}
