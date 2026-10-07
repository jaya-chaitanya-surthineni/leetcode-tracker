class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer>q= new LinkedList<>();
        for(int i:students)q.add(i);
        int index=0,count=0;
        while(!q.isEmpty()){
            int student=q.poll();
            if(student==sandwiches[index]){
                index++;
                count=0;
            }
            else{
                q.add(student);
                count++;
            }
            if(count==q.size())break;
        }
        return q.size();
    }
}