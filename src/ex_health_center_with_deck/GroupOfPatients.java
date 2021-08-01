package ex_health_center_with_deck;

import ex_problema_de_josephus.Main;//To use the method generateRandomNumber().
import _dynamic_deck.DynamicDeck;
import _dynamic_deck.Node;
import ex_health_center.Patient;

public class GroupOfPatients {
    private DynamicDeck groupOfPatients;
    
    public GroupOfPatients(){
        this.groupOfPatients=new DynamicDeck();
    }
    
    public void generateGroupOfPatients(){
        //The proportion will be: 1 pregnant, 1 breastfeeding, 1 especial needs,3 older than 60 and 4 normal.
        if(!this.groupOfPatients.isEmpty()) this.groupOfPatients.clean();
        this.groupOfPatients.addEnd(new Patient('F',this.generateRandomAge(17,50),this.generateNewId(),true,false,false));
        //Pregnant
        
        this.groupOfPatients.addEnd(new Patient('F',this.generateRandomAge(17,50),this.generateNewId(),false,true,false));
        //Breastfeeding
        
        this.groupOfPatients.addEnd(new Patient(this.generateRandomGender(),this.generateRandomAge(5,60),this.generateNewId(),false,false,true));
        //Especial needs
        
        for(byte counter=0;counter<3;counter++){//3 older than 60.
            this.groupOfPatients.addEnd(new Patient(this.generateRandomGender(),this.generateRandomAge(61,90),this.generateNewId(),false,false,false));    
        }
        for(byte counter=0;counter<4;counter++){//4 normal.
            this.groupOfPatients.addEnd(new Patient(this.generateRandomGender(),this.generateRandomAge(5,60),this.generateNewId(),false,false,false));
        }
    }
    
    private int generateNewId(){
        int newId=Main.generateRandomNumber(1000,10000);
        if(this.groupOfPatients.isEmpty()) return newId;
        while(this.generatedIdIsRepited(newId)) newId=Main.generateRandomNumber(1000,10000);
        return newId;
    }
    
    private char generateRandomGender(){
        int auxNum=Main.generateRandomNumber(0,1);
        return auxNum==1?'M':'F';
    }
    
    private int generateRandomAge(int from,int to){
        return Main.generateRandomNumber(from, to);
    }
    
    public Node[] getGroup(){return this.groupOfPatients.getNodes();}
    
    public DynamicDeck getDeckOfPatients(){return this.groupOfPatients;}
    
    private boolean generatedIdIsRepited(int id){
        if(this.groupOfPatients==null) return false;
        if(this.groupOfPatients.isEmpty()) return false;
        Node[] patients=this.groupOfPatients.getNodes();
        for(Node throughPatients:patients) if(((Patient)throughPatients.getData()).getId()==id) return true;
        return false;
    }
}