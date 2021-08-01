package _dynamic_deck;

public class DynamicDeck {
    private Node head;
    private int quantityOfElements;
    
    public int size(){
        return this.quantityOfElements;
    }

    public Node getHead() {
        return this.head;
    }
    
    public boolean isEmpty(){
        return this.quantityOfElements==0;
    }
    
    public boolean addBeginning(Object data){
        if(data==null) return false;
        Node newNode=new Node(data);
        if(this.isEmpty()){
            newNode.setNext(newNode);
            newNode.setPrevious(newNode);
        }else{
            newNode.setPrevious(this.head.getPrevious());
            this.head.getPrevious().setNext(newNode);
            this.head.setPrevious(newNode);
            newNode.setNext(this.head);
            this.head=newNode;
        }
        this.head=newNode;
        this.quantityOfElements++;
        return true;
    }
    
    public Object removeBeginning(){
        if(this.isEmpty()) return null;
        if(this.size()==1){
            Object data=this.head.getData();
            this.head=null;
            this.quantityOfElements=0;
            return data;
        }else{
            this.head.getPrevious().setNext(this.head.getNext());
            this.head.getNext().setPrevious(this.head.getPrevious());
            Object data=this.head.getData();
            this.head=this.head.getNext();
            this.quantityOfElements--;
            return data;
        }
    }
    
    
    public boolean addEnd(Object data){
        if(this.isEmpty()) return this.addBeginning(data);
        Node newNode=new Node(this.head,this.head.getPrevious(),data);
        this.head.setPrevious(newNode);
        newNode.getPrevious().setNext(newNode);
        this.quantityOfElements++;
        return true;
    }
    
    public Object removeEnd(){
        if(this.isEmpty()) return null;
        else if(this.size()==1) return this.removeBeginning();
        else{
            Node toRemove=this.head.getPrevious();
            this.head.setPrevious(toRemove.getPrevious());
            this.head.getPrevious().setNext(this.head);
            this.quantityOfElements--;
            return toRemove.getData();
        }
    }
    
    public Node getNode(int position){
        if(this.isEmpty() || position<0 || position>this.size()-1) return null;
        if(position==0) return this.head;
        Node throughDeck;
        if(position<=(this.size()-1)/2){//Let's go from beginning toward position.
            throughDeck=this.head;
            for(int counter=0;counter<position;counter++) throughDeck=throughDeck.getNext();
        }else{//Let's go from end toward position.
            throughDeck=this.head.getPrevious();//That is, last node.
            for(int counter=this.size()-1;counter>position;counter--) throughDeck=throughDeck.getPrevious();
        }
        return throughDeck;
    }
    
    public Node[] getNodes(){
        if(this.isEmpty()) return null;
        Node[] nodes=new Node[this.quantityOfElements];
        nodes[0]=this.head;
        Node throughDeck=this.head.getNext();
        for(int counter=1;counter<this.quantityOfElements;counter++){
            nodes[counter]=throughDeck;
            throughDeck=throughDeck.getNext();
        }
        return nodes;
    }
    
    public boolean clean(){
        if(this.isEmpty()) return false;
        this.head=null;
        return true;
    }
}
