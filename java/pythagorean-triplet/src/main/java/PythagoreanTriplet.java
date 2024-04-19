import java.util.ArrayList;
import java.util.List;

class PythagoreanTriplet {

    private int a;
    private int b;
    private int c;

    PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public boolean equals(Object o){    // compares two PythogoreanTriplet objects for equality (equality by values )
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PythagoreanTriplet that = (PythagoreanTriplet) o;
        return a == that.a && b == that.b && c == that.c;
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
            for(int a = 1; a <= sum/3; a++){
                if(a <= max_factor){
                    for(int b = a+1; b <= sum/2; b++){
                        if(b <= max_factor){
                            int c = sum-a-b;
                            if(c <= max_factor){
                                if(isPythagoreanTriplet(a, b, c)){
                                    list.add(new PythagoreanTriplet(a,b,c));
                                }
                            }
                        }
                    }
                }
            }
        }

        private boolean isPythagoreanTriplet(int a, int b, int c) {
            return a*a + b*b == c*c;
        }

    }

}