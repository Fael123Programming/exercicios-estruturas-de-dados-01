package _doubly_linked_list;

public class DoublyLinkedList {
    private Cell first;
    private Cell last;
    private int numberOfCells;

    public boolean isEmpty() {
        return this.numberOfCells == 0;
    }

    public int size() {
        return this.numberOfCells;
    }

    public boolean occupiedPosition(int pos) {
        if (this.isEmpty()) return false;
        return pos >= 0 && pos < this.numberOfCells;
    }

    public Cell getFirst() {
        return this.first;
    }

    public Cell getLast() {
        return this.last;
    }

    public boolean addBeginning(Object data) {
        if (data == null) return false;
        Cell newCell = new Cell(data);
        if (this.isEmpty()) {
            this.last = newCell;
        } else {
            this.first.setPrevious(newCell);
            newCell.setNext(this.first);
        }
        this.first = newCell;
        this.numberOfCells++;
        return true;
    }

    public boolean addEnd(Object data) {
        if (data == null) return false;
        if (this.isEmpty()) this.addBeginning(data);
        else {
            Cell newCell = new Cell(null, this.last, data);
            this.last.setNext(newCell);
            this.last = newCell;
            this.numberOfCells++;
        }
        return true;
    }

    public boolean addPos(int position, Object data) {
        if (position < 0 || position > this.size() || data == null) return false;
        else if (position == 0) this.addBeginning(data);
        else if (position == this.size()) this.addEnd(data);
        else {
            Cell previous = this.getCell(position - 1);
            Cell newCell = new Cell(previous.getNext(), previous, data);
            previous.getNext().setPrevious(newCell);
            previous.setNext(newCell);
            this.numberOfCells++;
        }
        return true;
    }

    public Cell removeFirst() {
        if (this.isEmpty()) return null;
        else {
            Cell toRemove = this.first;
            if (this.size() == 1) {
                this.first = null;
                this.last = null;
            } else {
                Cell newFirst = toRemove.getNext();
                toRemove.setNext(null);
                newFirst.setPrevious(null);
                this.first = newFirst;
            }
            this.numberOfCells--;
            return toRemove;
        }
    }

    public Cell removeLast() {
        if (this.isEmpty()) return null;
        else if (this.size() == 1) return this.removeFirst();
        else {
            Cell penultimate = this.last.getPrevious(), last = this.last;
            last.setPrevious(null);
            penultimate.setNext(null);
            this.last = penultimate;
            this.numberOfCells--;
            return last;
        }
    }

    public Cell removePos(int position) {
        if (!this.occupiedPosition(position)) return null;
        else if (position == 0) return this.removeFirst();
        else if (position == this.size() - 1) return this.removeLast();
        else {
            Cell previous = this.getCell(position - 1), toRemove = previous.getNext();
            previous.setNext(toRemove.getNext());
            toRemove.getNext().setPrevious(previous);
            toRemove.setPrevious(null);
            toRemove.setNext(null);
            this.numberOfCells--;
            return toRemove;
        }
    }

    public Cell getCell(int position) {
        if (!this.occupiedPosition(position)) return null;
        Cell throughList;
        if (position <= (this.size() - 1) / 2) {//Let's go from beginning toward position.
            throughList = this.first;
            for (int counter = 0; counter < position; counter++) {
                throughList = throughList.getNext();
            }
        } else {//Let's go from end toward position.
            throughList = this.last;
            for (int counter = this.size() - 1; counter > position; counter--) {
                throughList = throughList.getPrevious();
            }
        }
        return throughList;
    }

    public Cell[] getCells(int order) {
        //1 to deliver them from first to last. -1 to deliver them from last to first.
        if (this.isEmpty() || order != 1 && order != -1) return null;
        Cell cells[] = new Cell[this.size()];
        if (this.size() == 1) {
            cells[0] = this.first;
        } else {
            Cell throughCells;
            switch (order) {
                case 1:
                    throughCells = this.first;
                    for (int counter = 0; counter < this.size(); counter++) {
                        cells[counter] = throughCells;
                        throughCells = throughCells.getNext();
                    }
                    break;
                case -1:
                    throughCells = this.last;
                    for (int counter = 0; counter < this.size(); counter++) {
                        cells[counter] = throughCells;
                        throughCells = throughCells.getPrevious();
                    }
                    break;
            }
        }
        return cells;
    }

    public Cell[] getCells() {
        return this.getCells(1);
    }

    public Object[] getAllData(int order) {
        if (this.isEmpty()) return null;
        Cell[] cells = this.getCells(order);
        Object[] allData = new Object[this.size()];
        for (int counter = 0; counter < allData.length; counter++)
            allData[counter] = cells[counter].getData();
        return allData;
    }

    public Object[] getAllData() {
        return this.getAllData(1);
    }

    public boolean contains(Object data) {
        if (this.isEmpty()) return false;
        Cell throughList = this.first;
        while (throughList != null) {
            if (throughList.getData().equals(data)) return true;
            throughList = throughList.getNext();
        }
        return false;
    }

    public boolean clean() {
        if (this.isEmpty()) return false;
        this.first = null;
        this.last = null;
        this.numberOfCells = 0;
        return true;
    }
}