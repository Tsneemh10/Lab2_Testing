public class MaxMinArr {
    private int [] arr;
    public void insertArr(int [] arr, int len) {
        this.arr = new int[len];
        for(int i = 0; i < arr.length; i++)
            this.arr[i] = arr[i];
    }
    public int [] findMaxAndMin(int [] arr) {
        int [] val = new int[2];
        val[0] = val[1] = arr[0];
        for(int i = 1; i < arr.length; i++) {
            val[0] = (val[0] < arr[i]) ? arr[i] : val[0];
            val[1] = (val[1] > arr[i]) ? arr[i] : val[1];
        }
        // first value of val indicates maximum value
        // second value of val indicates minimum value
        return val;
    }

    public int[] getArr(){
        return this.arr;
    }
    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
