class LogicsLR {

    static String SWLStr;
    static double davitWeight = 0.0;

    static double davitWeightCalc(){
        double SWL;
        if (SWLStr!=null) {
            SWL = Double.parseDouble(SWLStr.replaceAll("[^0-9.]", ""));
            davitWeight = SWL * 1.1;
        }
        else
            System.out.println("Wrong data at SWL field");
        return davitWeight;
    }
}
