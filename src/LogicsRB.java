public class LogicsRB {

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
}
