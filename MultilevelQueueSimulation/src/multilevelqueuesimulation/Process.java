
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
    
    
    /**
     * @return the PID
     */
    public int getPID() {
        return PID;
    }

    /**
     * @param PID the PID to set
     */
    public void setPID(int PID) {
        this.PID = PID;
    }

    /**
     * @return the Burst
     */
    public int getBurst() {
        return Burst;
    }

    /**
     * @param Burst the Burst to set
     */
    public void setBurst(int Burst) {
        this.Burst = Burst;
    }

    /**
     * @return the Turnaround
     */
    public int getTurnaround() {
        return Turnaround;
    }

    /**
     * @param Turnaround the Turnaround to set
     */
    public void setTurnaround(int Turnaround) {
        this.Turnaround = Turnaround;
    }

    /**
     * @return the WaitTime
     */
    public int getWaitTime() {
        return WaitTime;
    }

    /**
     * @param WaitTime the WaitTime to set
     */
    public void setWaitTime(int WaitTime) {
        this.WaitTime = WaitTime;
    }
    
    
    
    
}
