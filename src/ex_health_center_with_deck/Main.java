package ex_health_center_with_deck;

import _dynamic_deck.DynamicDeck;

public class Main {
    public static void main(String[] args) {
        /**
         * From group 1 to group 10 will be attended as people as the group number (55 people afterall).
         * After them, from group 11 to 14, the whole group will be attended. Finally, to complete 100
         * patients attended in a day, in the last group (15th), only the half will be attended.
         */
        GroupOfPatients patients=new GroupOfPatients();//To generate and contain our group of patients.
        DynamicDeck attendedPatients=new DynamicDeck();//It'll contain all attended patients during each day we'll simulate.
        DynamicDeck unattendedPatients=new DynamicDeck();//Patients that we'll have to ignore, come here.
        byte patientsToAttend=1;
        while(true){
            patients.generateGroupOfPatients();
            for(byte counter=0;counter<patientsToAttend;counter++){
                attendedPatients.addEnd(patients.getDeckOfPatients().getHead().getData());//Attending the patient that has the highest priority coefficient.
                patients.getDeckOfPatients().removeBeginning();//Removing the patient that has the highest priority.
                if(attendedPatients.size()==100){
                /*This is the moment when we've to close the establishment and finish the attendances for a day.    
                Although we've to add the last 5 patients to unattendedPatients and finally, break the while sta-
                tement.*/
                   break;//15 repetition, 5 patients already added. 5 others, not. It just stops it.
                }
            }
            if(patientsToAttend<10 || (patients.getDeckOfPatients().size()==5 && attendedPatients.size()==100)){
                patientsToAttend++;//This second logic sentece (surrounded by parentheses), will be true in the last repetition of this while statement.
                while(!patients.getDeckOfPatients().isEmpty()){
                    unattendedPatients.addEnd(patients.getDeckOfPatients().getHead().getData());
                    patients.getDeckOfPatients().removeBeginning();
                }
                if(attendedPatients.size()==100) break; //Here, all things we had to perform were perfomed. So, we can break it all.
            }
        }
        System.out.println("#### Pacientes atendidos ####");
        for(byte c=0;c<attendedPatients.size();c++) System.out.println((c+1)+"ª\n"+attendedPatients.getNode(c).getData());
        System.out.println("\n\n");
        System.out.println("#### Pacientes não atendidos ####");
        for(byte c=0;c<unattendedPatients.size();c++) System.out.println((c+1)+"ª\n"+unattendedPatients.getNode(c).getData());
    }
}
