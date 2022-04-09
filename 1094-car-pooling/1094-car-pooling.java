class Solution {
    class Pair{
        int stop;
        int passenger;
        public Pair(int stop,int passenger){
            this.stop = stop;
            this.passenger = passenger;
        }
    }
    public boolean carPooling(int[][] trips, int capacity) {
        /*
            At each stop, we take the people in and see if we exceeed capacity
            we also check if we need to drop off any customer at each stop.
            
        */
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a,b)-> a.stop - b.stop);
        int currentPassengers =0;
        Arrays.sort(trips, (a,b)->a[1]-b[1]);
        for(int[] trip: trips){
            int currentStop = trip[1];
            int destination = trip[2];
            int passengers = trip[0];
            while(!pq.isEmpty() && pq.peek().stop<=currentStop){
                Pair process = pq.poll();
                currentPassengers -= process.passenger;
            }
            currentPassengers += passengers;
            if(currentPassengers>capacity) return false;
            pq.add(new Pair(destination,passengers));
        }
        return true;
    }
}