package taskStar;

public class CustomArrayList<T> {
    private int capacity = 10;
    private int curPos = -1;
    Object[] array;

    public CustomArrayList() {
        array = new Object[capacity];
    }

    public CustomArrayList(int size) {
        capacity = size;
        //А можно сделать что то типо такого?
        // this(); | CustomArrayList()
        array = new Object[capacity];
    }

    public void add(T element) {
        curPos += 1;
        if (curPos == capacity) {
            expandArray();
        }
        array[curPos] = element;
    }

    public boolean find(T element){
        for (int i = 0; i < curPos; i++) {
            if(array[i].equals(element)){
                return true;
            }
        }
        return false;
    }

    public  void clear(){
        this.capacity = 10;
        this.curPos = -1;
        this.array = new Object[capacity];
    }

    private void expandArray() {
        capacity = capacity * 2;
        Object[] newArray = new Object[capacity];
        System.arraycopy(array, 0, newArray, 0, curPos);
        array = newArray;
    }

    public T get(int index){
        try {
            if(index < 0 || index > curPos){
                throw new IndexOutOfBoundsException();
            }
            return (T) array[index];
        } catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        return null;
    }

    public void  remove(int index){
        try {
            if(index < 0 || index > curPos){
                throw new IndexOutOfBoundsException();
            }

            for (int i = index; i < curPos; i++) {
                array[i] = array[i + 1];
            }
            curPos -= 1;

        } catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
    }

    public void print() {
        for (Object el : array) {
            System.out.print(el + ", ");
        }
        System.out.println();
    }




}
