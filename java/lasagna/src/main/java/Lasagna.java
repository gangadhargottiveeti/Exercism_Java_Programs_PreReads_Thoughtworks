public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        int expectedMinutes = 40;
        return expectedMinutes;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinutes){
        int expectedMinutes = 40;
        return expectedMinutes - actualMinutes;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int noOfLayers){
        return 2*noOfLayers;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int noOfLayers, int noOfMinutesInOven){
        int totalTime = preparationTimeInMinutes(noOfLayers) + noOfMinutesInOven;
        return totalTime;
    }
}
