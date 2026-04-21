class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double [] [] carAndSpeed = new double[position.length][2];
        double timeTaken = 1.0;
        Stack<Double> time = new Stack<>();
        for (int i = 0; i <position.length ; i++) {
            carAndSpeed[i][0] = position[i];
            carAndSpeed[i][1] = speed[i];
        }

        Arrays.sort(carAndSpeed, (a, b) -> Double.compare(b[0], a[0]));

      for (double[] doubles : carAndSpeed) {
          if(!time.isEmpty()){
              timeTaken = (target-doubles[0])/doubles[1];
              if(timeTaken>time.peek()){
                  time.push(timeTaken);
              }
          }
          else{
              timeTaken = (target - doubles[0]) / doubles[1];
              time.push(timeTaken);
          }

        }




        return time.size();
    }
}
