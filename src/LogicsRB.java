class LogicsRB {

    String RBweight;
    String PeopleNo;
    private double weightOfRB;
    double weightInRB = 0.0;
    double totalWeight = 0.0;
    double davitWeight = 0.0;

    double weightInRbCalc() {
        double noOfPeople;
        if (RBweight!=null && PeopleNo!=null) {
            weightOfRB = Double.parseDouble(RBweight.replaceAll("[^0-9.]", ""));
            noOfPeople = Double.parseDouble(PeopleNo.replaceAll("[^0-9.]", ""));
            weightInRB = (weightOfRB * 0.1) + (noOfPeople * 75 * 1.1);
        }
        else
            System.out.println("Wrong data at RB");
        return weightInRB;
    }

    double totalWeightCalc(){
        weightOfRB = Double.parseDouble(RBweight.replaceAll("[^0-9.]", ""));
        totalWeight = weightOfRB + weightInRB;
        return totalWeight;
    }

    double davitWeightCalc(){
        davitWeight = totalWeight;
        return davitWeight;
    }
}
