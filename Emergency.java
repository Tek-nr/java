package emergency;

import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Emergency {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome the emergency simulation...");
        Scanner scan=new Scanner(System.in);
        Queue<Patient> patient_queue= new PriorityQueue<>();
        while(true){
            System.out.println("Enter q to quit");
            
            System.out.print("Pacient's name: ");
            String name=scan.nextLine();
            if(name.equals("q")){
                System.out.println("Have a Nice Days!");
                break;
            }
            else{
            System.out.print("Urgency Code: ");
            int urgency_code= scan.nextInt();
            scan.nextLine();
            patient_queue.offer(new Patient(name,urgency_code));
            }
        }
        
        while(!patient_queue.isEmpty()){
            System.out.println("Next Patient --> "+ patient_queue.poll());
            Thread.sleep(3000);
        }
        System.out.println("The queue is over.");
        
    }
   static class Patient implements Comparable<Patient>{
        private String name;
        private int urgency_code;

        public Patient(String name, int urgency_code) {
            this.name = name;
            this.urgency_code = urgency_code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getUrgency_code() {
            return urgency_code;
        }

        public void setUrgency_code(int urgency_code) {
            this.urgency_code = urgency_code;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 71 * hash + Objects.hashCode(this.name);
            hash = 71 * hash + this.urgency_code;
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Patient other = (Patient) obj;
            if (this.urgency_code != other.urgency_code) {
                return false;
            }
            if (!Objects.equals(this.name, other.name)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "Name : " + name + ", Urgency Code : " + urgency_code;
        }

        @Override
        public int compareTo(Patient patient) {
            if(this.urgency_code<patient.urgency_code)
            return -1;
        else if(this.urgency_code==patient.urgency_code)
            return 0;
        else
            return 1;
        }
        
    }
}
