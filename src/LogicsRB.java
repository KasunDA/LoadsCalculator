class LogicsRB {

    String RBweight;
    String PeopleNo;
    private double weightOfRB;
    double weightInRB = 0.0;
    double totalWeight = 0.0;
    double davitWeight = 0.0;

    void weightInRbCalc() {
        double noOfPeople;
        if (!RBweight.equals("") && !PeopleNo.equals("")) {
            weightOfRB = Double.parseDouble(RBweight.replaceAll("[^0-9.]", ""));
            noOfPeople = Double.parseDouble(PeopleNo.replaceAll("[^0-9.]", ""));
            weightInRB = (weightOfRB * 0.1) + (noOfPeople * RBPanel.getPersonWeight() * 1.1);
            weightInRB *= 10;
            weightInRB = Math.round(weightInRB);
            weightInRB /= 10;
        }
        else {
            weightInRB = 0;
        }
    }

    void totalWeightCalc() {
        if (!RBweight.equals("") && !PeopleNo.equals("")) {
            weightOfRB = Double.parseDouble(RBweight.replaceAll("[^0-9.]", ""));
            totalWeight = weightOfRB + weightInRB;
        } else {
            totalWeight = 0;
        }
    }

    void davitWeightCalc(){
        davitWeight = totalWeight;
    }
}
