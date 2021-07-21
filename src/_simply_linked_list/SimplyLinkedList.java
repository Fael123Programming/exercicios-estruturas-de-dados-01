package _simply_linked_list;
public class SimplyLinkedList {
    private Cell first;
    private Cell last;
    private int numberOfElements;
    
    public Cell getFirst(){
        return this.first;
    }
    
    public Cell getLast(){
        return this.last;
    }
    
    public boolean isEmpty(){
        return this.numberOfElements==0;
    }
    
    public int size(){
        return this.numberOfElements;
    }
    
    public void addBeginning(Object newElement){
        if(newElement==null) return;
        Cell newCell=new Cell(newElement,this.first);
        this.first=newCell;
        if(this.isEmpty()) this.last=newCell;
        this.numberOfElements++;
    }
    
    public void addEnd(Object newElement){
        if(newElement==null) return;
        if(this.numberOfElements==0) this.addBeginning(newElement);
        else{
            Cell newCell=new Cell(newElement,null);
            this.last.setNext(newCell);
            this.last=newCell;
            this.numberOfElements++;
        }
    }
    
    public boolean addPos(Object newElement,int position){
        if(newElement==null||position<0 ^ position>this.numberOfElements) return false; //Out of range.
        else if(position==0) this.addBeginning(newElement);
        else if(position==this.numberOfElements) this.addEnd(newElement);
        else{
            Cell previousCell=this.getCell(position-1);
            Cell newCell=new Cell(newElement,previousCell.getNext());
            previousCell.setNext(newCell);
            this.numberOfElements++;
        }
        return true;
    }
    
    public Object removeFirst(){
        if(this.isEmpty()) return null;
        Cell firstCell=this.first;
        this.first=this.first.getNext();
        firstCell.setNext(null);//Unlinking this cell.
        this.numberOfElements--;
        return firstCell.getData();
    }
    
    public Object removeLast(){
        if(this.isEmpty()) return null;
        if(this.size()==1) return this.removeFirst();
        Cell penultimateCell=this.getCell(this.size()-2);//this.size()-1 is the last cell.
        Object lastCellData=penultimateCell.getNext().getData();
        penultimateCell.setNext(null);//Unlinking the former last cell.
        this.last=penultimateCell;
        this.numberOfElements--;
        return lastCellData;
    }
    
    public Object removePos(int position){
        if(this.isEmpty()||position<0||position>this.size()-1) return null;
        if(position==0) return this.removeFirst();
        if(position==this.size()-1) return this.removeLast();
        Cell previousCell=this.getCell(position-1);
        Cell cellToRemove=previousCell.getNext();
        previousCell.setNext(cellToRemove.getNext());
        cellToRemove.setNext(null);
        this.numberOfElements--;
        return cellToRemove.getData();
    }
    
    public boolean clean(){
        if(this.isEmpty()) return false;
        this.first=null;
        this.last=null;
        this.numberOfElements=0;
        return true;
    }
    
    public Cell getCell(int position){
        if(this.isEmpty()||position<0^position>this.numberOfElements-1) return null;
        Cell cellToReturn=this.first;
        for(int counter=1;counter<=position;counter++){
            cellToReturn=(Cell) cellToReturn.getNext();
        }
        return cellToReturn;
    }
    
    public Cell[] getCells(){
        if(this.isEmpty()) return null;
        Cell allCells[]=new Cell[this.size()];
        for(int counter=0;counter<this.size();counter++){
            allCells[counter]=this.getCell(counter);
        }
        return allCells;
    }
    
    public boolean contains(Object data){
        if(this.isEmpty()) return false;
        Cell throughList=this.first;
        while(throughList!=null){
            if(throughList.getData().equals(data)) return true;
            throughList=throughList.getNext();
        }
        return false;
    }
}