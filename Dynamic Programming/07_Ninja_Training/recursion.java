
public class recursion {
    public int solve(int day,int lastTask, int[][] points ){
        int n = points.length;
        int maxi = 0;
        // base case
        if(day == n){
            return 0; // kunki days finish no training left
        }
        //recursion
        //choices - 3 hence using a loop - task0,task1,taskk2
        for(int task = 0 ; task< 3 ; task++){
            //skip task performed on the previous day;
            if(task != lastTask ){
                //recursion
                int activity = points[day][task] + solve(day+1 , task, points);
                maxi = Math.max (maxi , activity);
            }
            
        }
        return maxi; 
            //initial call;

    }
    public int ninjaInitialDay(int[][] points){
        return solve(0,3,points); //3 is the dummy choice which means all 3 cases available.
    }
    
}
