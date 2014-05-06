
package multilevelqueuesimulation;


public class Process {
    
    
    private int PID;
    private int Burst;
    private int Turnaround;
    private int WaitTime;

    public Process(int pid, int burst, int turnaround, int waitTime){
        
        this.PID = pid;
        this.Burst = burst;
        this.Turnaround = turnaround;
        this.WaitTime = waitTime;
    }
    
    
    
    public int getPID() {
        return PID;
    }

    public void setPID(int PID) {
        this.PID = PID;
    }

    public int getBurst() {
        return Burst;
    }

  
    public void setBurst(int Burst) {
        this.Burst = Burst;
    }

    public int getTurnaround() {
        return Turnaround;
    }

    public void setTurnaround(int Turnaround) {
        this.Turnaround = Turnaround;
    }

  
    public int getWaitTime() {
        return WaitTime;
    }

    public void setWaitTime(int WaitTime) {
        this.WaitTime = WaitTime;
    }
    
    
    
    
}
