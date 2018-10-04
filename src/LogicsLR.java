public class LogicsLR {

    double davitWeight;
    String SWLStr;
    private Double SWL;

    public double davitWeightCalc(){
        SWL = Double.parseDouble(SWLStr.replaceAll("[^0-9.]", ""));
        davitWeight = SWL*1.1;
        return davitWeight;
    }
}
