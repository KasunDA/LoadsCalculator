class LogicsLB {

    String LBweight;
    String PeopleNo;
    private double weightOfLB;
    double weightInLB = 0.0;
    double totalWeight = 0.0;
    double davitWeight = 0.0;

    //LBPanel panel = new LBPanel();

    void weightInLbCalc() {
        double noOfPeople;
        if (!LBweight.equals("") && !PeopleNo.equals("")) {
            weightOfLB = Double.parseDouble(LBweight.replaceAll("[^0-9.]", ""));
            noOfPeople = Double.parseDouble(PeopleNo.replaceAll("[^0-9.]", ""));
            weightInLB = (weightOfLB * 0.1) + (noOfPeople * LBPanel.getPersonWeight() * 1.1);
            weightInLB *=10;
            weightInLB = Math.round(weightInLB);
            weightInLB /= 10;
        }
        else {
            weightInLB = 0;
        }
    }

    void totalWeightCalc() {
        if (!LBweight.equals("") && !PeopleNo.equals("")) {
            weightOfLB = Double.parseDouble(LBweight.replaceAll("[^0-9.]", ""));
            totalWeight = weightOfLB + weightInLB;
        } else {
            totalWeight = 0;
        }
    }

    void davitWeightCalc() {
        davitWeight = totalWeight;
    }
}
