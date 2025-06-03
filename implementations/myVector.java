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
      System.out.printf(" Size:     %d\n", size);
      System.out.printf(" Capacity: %d\n", capacity);
      System.out.print(" Items:    [");
      for (int i = 0; i < size; i++) {
          System.out.print(data[i]);
          if (i < size - 1) System.out.print(", ");
      }
      System.out.println("]");
      System.out.println("━━━━━━━━━━━━━━━━━━━━━━");
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

  public T pop() {
    T item = data[--size];
    data[size] = null; // avoid loitering
    if (size == data.length/4 && size > 0 ) { resize(data.length/2); }
    return item;
  }

  public int find(T item) {
    for (int i = 0; i < capacity; i++) {
      if ( item.equals(data[i]) ) { 
        return i;
      }
    }
    return -1;
  }

  public void insert(int index, T item) {
    if (size == capacity) {
        resize(capacity * 2);
    }
    for (int i = size - 1; i >= index; i--) {
      data[i + 1] = data[i];
    }
    data[index] = item;
    size++;
  }
  
  public void prepend(T item) {
    insert(0, item);
  }

  public void delete(int index) {
    for (int i = index; i < size; i++) {
      data[i] = data[i + 1];
    }
    size--;
    if (size == data.length/4 && size > 0 ) { resize(data.length/2); }
  }

  public void remove(T item) {
    for (int i = 0; i < size; ) {
      if (item.equals(data[i])) {
        delete(i);
      } else {
        i++;
      }
    }
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

    int initialCapacity = 5;
    myVector<Integer> vec = new myVector<>(initialCapacity);

    System.out.println("Initial State:");
    vec.stat();

    System.out.println("\nPushing 10 elements...");
    for (int i = 0; i < 10; i++) {
        vec.push(i);
    }
    vec.stat();

    System.out.println("\nAccess Test:");
    System.out.println("  Element at index 4: " + vec.at(4));

    System.out.println("\nFind Test:");
    System.out.println("  Index of value 5: " + vec.find(5));

    System.out.println("\nInsert Test:");
    System.out.println("  Inserting 20 at index 4...");
    vec.insert(4, 20);
    vec.stat();

    System.out.println("\nPrepend Test:");
    System.out.println("  Prepending 3...");
    vec.prepend(3);
    vec.stat();

    System.out.println("\nDelete Test:");
    System.out.println("  Deleting at index 4...");
    vec.delete(4);
    vec.stat();

    System.out.println("\nRemove Test:");
    System.out.println("  Removing 3(s)...");
    vec.insert(4, 3);
    vec.stat();
    vec.remove(3);
    vec.stat();
  }
}