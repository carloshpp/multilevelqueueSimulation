package multilevelqueuesimulation;

import java.util.List;

public class RoundRobinScheduling {

    private List<Process> Processes;
    private int Quantum;

    
    public RoundRobinScheduling(int quantum){
        this.Quantum = quantum;
    }
    
    //Start of Getters and Setters
    public List<Process> getProcesses() {
        return Processes;
    }

    public void setProcesses(List<Process> processes) {
        this.Processes = processes;
    }

    public int getQuantum() {
        return Quantum;
    }

    public void setQuantum(int Quantum) {
        this.Quantum = Quantum;
    }
    
    // End of Getters and Setters
    
    
    public void addProcess(Process process) {
        this.Processes.add(process);
    }

    public void removeProcess(Process process) {
        this.Processes.remove(process);
    }
    
    public void Schedule(){
        
        int burst;
        for(Process proc: Processes){
        
            burst = proc.getBurst();
            if(burst> this.Quantum){
                burst = burst - this.Quantum;
                proc.setBurst(burst);
            }
            else{
                proc.setBurst(0);
                this.removeProcess(proc);
                //Refactor to end process logic. Must pass actual time 
                //proc.endProcess(actualTime);
            }
        
        }
    }


}
