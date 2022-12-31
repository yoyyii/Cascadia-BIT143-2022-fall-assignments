public class ArrayIntList implements IntListInterface {

    private int size = 0;
    private int[] elementData = new int[6];

    public void add(int num) {
        if (size < elementData.length) {
            elementData[size] = num;
            size++;
        }
    }

    public boolean isEmpty() { 
        return size == 0;
    }

    public double average() {
            double avg = (double) sum() / size;
            return avg;
    }

    public int sum() {
        if (size == 0) {
            return 0;
        }
        int total = 0; 

        for (int i = 0; i < size; i++) {
            total += elementData[i];
        }

        return total;
    }

    public int get(int num) {
        return elementData[num];
    }

    public void remove(int index) {
        for (int i = index + 1; i < elementData.length; i++) {
            elementData[i - 1] = elementData[i];
        }
        size = size - 1; 
    }

    public String toString() {
        if (size == 0) {
            return "[]";
        } else {
            int i = 1;
            String result = "[" + elementData[0];
            

            while (i < size) {
                result += ", " + elementData[i];
                i ++;
            }
            result += "]";
            return result;
        }
    }
}
