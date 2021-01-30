// 1732. Find the Highest Altitude

class Solution {
    public int largestAltitude(int[] gain) {
         int altitude = 0;
        int highestAltitude = 0;
        for (int i : gain) {
            altitude += i;
            highestAltitude = Math.max(altitude, highestAltitude);
        }
        
        return highestAltitude;
        
        
        
    }
}


//

