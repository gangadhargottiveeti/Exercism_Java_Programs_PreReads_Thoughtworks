class PrimeCalculator {

    int nth(int nth) {

        if(nth == 0){
            throw new IllegalArgumentException();
        }
        if(nth == 1){
            return 2;
        }
        if(nth ==2){
            return 3;
        }

        int countOfPrimes = 2;
        int prime = 3;
        int number = 4;
        while(countOfPrimes != nth){
            boolean flag = false;
            for(int i = 2; i <= number/2; i++){
                if(number%i == 0){
                    flag = true;
                }
            }
            if(!flag){
                countOfPrimes++;
                prime = number;
            }
            number++;
        }
        return prime;
    }

}
