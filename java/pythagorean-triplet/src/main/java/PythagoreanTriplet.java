import java.util.ArrayList;
import java.util.List;

class PythagoreanTriplet {

    private int number1;
    private int number2;
    private int number3;

    PythagoreanTriplet(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    @Override
    public boolean equals(Object o){    // compares two PythogoreanTriplet objects for equality (equality by values )
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PythagoreanTriplet that = (PythagoreanTriplet) o;
        return number1 == that.number1 && number2 == that.number2 && number3 == that.number3;
    }

    static TripletListBuilder makeTripletsList() {
        return new TripletListBuilder();
    }

    static class TripletListBuilder {

        int sum;
        int max_factor = Integer.MAX_VALUE;
        TripletListBuilder thatSumTo(int sum) {
            this.sum = sum;
            return this;
        }

        TripletListBuilder withFactorsLessThanOrEqualTo(int maxFactor) {
            this.max_factor = maxFactor;
            return this;
        }

        List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> list = new ArrayList<>();
            findAllValidTriplets(list);
            return list;
        }

        private void findAllValidTriplets(List<PythagoreanTriplet> list) {
            for(int number1 = 1; number1 <= sum/3; number1++){
                if(number1 <= max_factor){
                    for(int number2 = number1+1; number2 <= sum/2; number2++){
                        if(number2 <= max_factor){
                            int number3 = sum-number1-number2;
                            if(number3 <= max_factor){
                                if(isPythagoreanTriplet(number1, number2, number3)){
                                    list.add(new PythagoreanTriplet(number1,number2,number3));
                                }
                            }
                        }
                    }
                }
            }
        }

        private boolean isPythagoreanTriplet(int number1, int number2, int number3) {
            return number1*number1 + number2*number2 == number3*number3;
        }

    }

}