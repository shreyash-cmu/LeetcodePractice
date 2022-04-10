class Solution {
    public double angleClock(int hour, int minutes) {
        double smallAngle = minutes * 6;
        double largeAngle = (hour*30)%360 + (((double)minutes*6 /360.00)*30);
        //System.out.println(smallAngle);
        //System.out.println(largeAngle);
        return Math.min(Math.abs(largeAngle-smallAngle), 360 - Math.abs(largeAngle-smallAngle));
    }
}