package be.types;

public class MyArray {

    private int reservedSize;
    private int length;
    protected Object[] objects;

    public MyArray() {
        this.reservedSize = 2;
        this.length = 0;
        this.objects = new Object[this.reservedSize];
    }

    public int length() {
        return this.length;
    }


    public MyArray add(Object o) {
        if (this.length == this.reservedSize) {
        }

}
