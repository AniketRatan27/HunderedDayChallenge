package CodeChallenges;

public class MaxCars {
    public int maxCarsParked(int n ,char[]arr){
        int max_cars = 0;
        int current_cars = 0;

        for(int i = 0 ;i < n ;i++){
            if(arr[i] == 'S') {
                current_cars++;
            }
            else {
                max_cars = Math.max(max_cars ,current_cars);
                current_cars = 0;
            }
        }

        max_cars = Math.max(max_cars ,current_cars);
        return max_cars;
    }
}
