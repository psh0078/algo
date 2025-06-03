// vector: mutable array with automatic resizing

public class myVector<T>  {
  private T[] data;
  private int size;
  private int capacity;

  public myVector(int capacity) {
    this.capacity = capacity;
    this.size = 0;
    data = (T[]) new Object[capacity];
  }

  public boolean is_empty() { return size == 0; }

  public int size() { return size; }

  public int capacity() { return capacity; }

  public T at(int index) {
    return data[index];
  }

  public void stat() {
      System.out.println("INFO:");
      System.out.printf("  Size:     %d\n", size);
      System.out.printf("  Capacity: %d\n", capacity);
  }

  private void resize(int new_capacity) {
    this.capacity = new_capacity;
    T[] temp = (T[]) new Object[new_capacity];
    for (int i = 0; i < size; i++) {
      temp[i] = data[i];
    }
    data = temp;
  }

  public void push(T item) {
    if (data.length == size) { resize(2*data.length); }
    data[size++] = item;
  }
  public static void main(String[] args) {
    System.out.println("==========================================================");
    System.out.println("____   ____             __                ");
    System.out.println("\\   \\ /   /____   _____/  |_  ___________ ");
    System.out.println(" \\   Y   // __ \\_/ ___\\   __\\/  _ \\_  __ \\");
    System.out.println("  \\     /\\  ___/\\  \\___|  | (  <_> )  | \\/");
    System.out.println("   \\___/  \\___  >\\___  >__|  \\____/|__|   ");
    System.out.println("              \\/     \\/                   ");
    System.out.println("                                               ");
    System.out.println("==========================================================");

    int cap = 5;
    myVector<Integer> vec = new myVector<Integer>(cap);
    vec.stat();
    for (int i = 0; i < 10; i++) {
      vec.push(i);
    }
    vec.stat();
  }
}