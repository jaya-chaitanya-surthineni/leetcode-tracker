class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue= new LinkedList<>();
        // int time=0,target=tickets[k];
        // for (int i = 0; i < tickets.length; i++) {
        //     if (i <= k) {
        //         time += Math.min(tickets[i], target);
        //     } else {
        //         time += Math.min(tickets[i], target - 1);
        //     }
        // } 
        // return time;
        for(int i=0;i<tickets.length;i++)queue.add(i);
        int time=0;
        while(true){
            int person=queue.poll();
            tickets[person]--;
            time++;
            if(tickets[person]>0)queue.add(person);
            if(person==k && tickets[person]==0){return time;}
        }
        // return 0;
    }
}