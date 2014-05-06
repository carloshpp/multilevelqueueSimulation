package multilevelqueuesimulation;

public class Process {

    private int PID;
    private int Burst;
    private float Turnaround;
    private float WaitTime;
    private float CreatedTime;

    public Process(int pid, int burst, float turnaround, float waitTime, float createdTime) {

        this.PID = pid;
        this.Burst = burst;
        this.Turnaround = turnaround;
        this.WaitTime = waitTime;
        this.CreatedTime = createdTime;
        
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

    public float getTurnaround() {
        return Turnaround;
    }

    public void setTurnaround(int Turnaround) {
        this.Turnaround = Turnaround;
    }

    public float getWaitTime() {
        return WaitTime;
    }

    public void setWaitTime(int WaitTime) {
        this.WaitTime = WaitTime;
    }

    /**
     * @return the CreatedTime
     */
    public float getCreatedTime() {
        return CreatedTime;
    }

    /**
     * @param CreatedTime the CreatedTime to set
     */
    public void setCreatedTime(int CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

}
