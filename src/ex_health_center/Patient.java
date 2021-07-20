package ex_health_center;
public class Patient extends Person{
    private int id,priority;
    private boolean pregnant,breastFeeding,especialNeeds;
    
    public Patient(char gender,int age,int id,boolean pregnant,boolean breastFeeding,boolean especialNeeds){
        super(gender,age);
        this.id=id;
        if(gender=='M'||gender=='m'){
            if(pregnant) pregnant=false;
            if(breastFeeding) breastFeeding=false;
        }
        this.pregnant=pregnant;
        this.breastFeeding=breastFeeding;
        this.especialNeeds=especialNeeds;
        if(this.pregnant||this.breastFeeding) this.priority=3;
        else if(this.especialNeeds) this.priority=2;
        else if(super.getAge()>60) this.priority=1;
        else this.priority=0;
    }
    
    public int getId(){return this.id;}
    
    public void setId(int newId){this.id=newId;}
    
    public int getPriority(){return this.priority;}
    
    public boolean isPregnant() {
        return this.pregnant;
    }

    public void setPregnant(boolean pregnant) {
        this.pregnant = pregnant;
    }

    public boolean isBreastFeeding() {
        return this.breastFeeding;
    }

    public void setBreastFeeding(boolean breastFeeding) {
        this.breastFeeding = breastFeeding;
    }

    public boolean hasEspecialNeeds() {
        return this.especialNeeds;
    }

    public void setEspecialNeeds(boolean especialNeeds) {
        this.especialNeeds = especialNeeds;
    }
    
    @Override
    public String toString(){
        String toReturn=String.format("Id: %d%nIdade: %d%nGênero: %c%nTem necessidades"
                + " especiais? %b%n",this.id,super.getAge(),super.getGender(),
                this.especialNeeds);
        if(super.getGender()=='F'){
            toReturn+=String.format("É gestante? %b%nÉ lactante? %b%n",this.pregnant
            ,this.breastFeeding);
        }
        return toReturn;
    }
}
