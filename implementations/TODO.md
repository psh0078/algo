## Data Structures

- ### Arrays
  - [ ] Implement a vector (mutable array with automatic resizing):
    - [ ] New raw data array with allocated memory
      - can allocate int array under the hood, just not use its features
      - start with 16, or if the starting number is greater, use power of 2 - 16, 32, 64, 128
    - [x] size() - number of items
    - [x] capacity() - number of items it can hold
    - [x] is_empty()
    - [x] at(index) - returns the item at a given index, blows up if index out of bounds
    - [ ] push(item)
    - [ ] insert(index, item) - inserts item at index, shifts that index's value and trailing elements to the right
    - [ ] prepend(item) - can use insert above at index 0
    - [ ] pop() - remove from end, return value
    - [ ] delete(index) - delete item at index, shifting all trailing elements left
    - [ ] remove(item) - looks for value and removes index holding it (even if in multiple places)
    - [ ] find(item) - looks for value and returns first index with that value, -1 if not found
    - [ ] resize(new_capacity) // private function
      - when you reach capacity, resize to double the size
      - when popping an item, if the size is 1/4 of capacity, resize to half
  - [ ] Time
    - O(1) to add/remove at end (amortized for allocations for more space), index, or update
    - O(n) to insert/remove elsewhere
  - [ ] Space
    - contiguous in memory, so proximity helps performance
    - space needed = (array capacity, which is >= n) * size of item, but even if 2n, still O(n)

- ### Linked Lists

  - [ ] Description:
    - [ ] [Linked Lists CS50 Harvard University](https://www.youtube.com/watch?v=2T-A_GFuoTo&t=650s) - this builds the intuition.
    - [ ] [Singly Linked Lists (video)](https://www.coursera.org/lecture/data-structures/singly-linked-lists-kHhgK)
    - [ ] [CS 61B - Linked Lists 1 (video)](https://archive.org/details/ucberkeley_webcast_htzJdKoEmO0)
    - [ ] [CS 61B - Linked Lists 2 (video)](https://archive.org/details/ucberkeley_webcast_-c4I3gFYe3w)
    - [ ] [[Review] Linked lists in 4 minutes (video)](https://youtu.be/F8AbOfQwl1c)
  - [ ] [C Code (video)](https://www.youtube.com/watch?v=QN6FPiD0Gzo)
            - not the whole video, just portions about Node struct and memory allocation
  - [ ] Linked List vs Arrays:
    - [Core Linked Lists Vs Arrays (video)](https://www.coursera.org/lecture/data-structures-optimizing-performance/core-linked-lists-vs-arrays-rjBs9)
    - [In The Real World Linked Lists Vs Arrays (video)](https://www.coursera.org/lecture/data-structures-optimizing-performance/in-the-real-world-lists-vs-arrays-QUaUd)
  - [ ] [Why you should avoid linked lists (video)](https://www.youtube.com/watch?v=YQs6IC-vgmo)
  - [ ] Gotcha: you need pointer to pointer knowledge:
        (for when you pass a pointer to a function that may change the address where that pointer points)
        This page is just to get a grasp on ptr to ptr. I don't recommend this list traversal style. Readability and maintainability suffer due to cleverness.
    - [Pointers to Pointers](https://www.eskimo.com/~scs/cclass/int/sx8.html)
  - [ ] Implement (I did with tail pointer & without):
    - [ ] size() - returns the number of data elements in the list
    - [ ] empty() - bool returns true if empty
    - [ ] value_at(index) - returns the value of the nth item (starting at 0 for first)
    - [ ] push_front(value) - adds an item to the front of the list
    - [ ] pop_front() - remove the front item and return its value
    - [ ] push_back(value) - adds an item at the end
    - [ ] pop_back() - removes end item and returns its value
    - [ ] front() - get the value of the front item
    - [ ] back() - get the value of the end item
    - [ ] insert(index, value) - insert value at index, so the current item at that index is pointed to by the new item at the index
    - [ ] erase(index) - removes node at given index
    - [ ] value_n_from_end(n) - returns the value of the node at the nth position from the end of the list
    - [ ] reverse() - reverses the list
    - [ ] remove_value(value) - removes the first item in the list with this value
  - [ ] Doubly-linked List
    - [Description (video)](https://www.coursera.org/lecture/data-structures/doubly-linked-lists-jpGKD)
    - No need to implement

- ### Stack

  - [ ] [Stacks (video)](https://www.coursera.org/lecture/data-structures/stacks-UdKzQ)
  - [ ] [[Review] Stacks in 3 minutes (video)](https://youtu.be/KcT3aVgrrpU)
  - [ ] Will not implement. Implementing with the array is trivial

- ### Queue

  - [ ] [Queue (video)](https://www.coursera.org/lecture/data-structures/queues-EShpq)
  - [ ] [Circular buffer/FIFO](https://en.wikipedia.org/wiki/Circular_buffer)
  - [ ] [[Review] Queues in 3 minutes (video)](https://youtu.be/D6gu-_tmEpQ)
  - [ ] Implement using linked-list, with tail pointer:
    - enqueue(value) - adds value at a position at the tail
    - dequeue() - returns value and removes least recently added element (front)
    - empty()
  - [ ] Implement using a fixed-sized array:
    - enqueue(value) - adds item at end of available storage
    - dequeue() - returns value and removes least recently added element
    - empty()
    - full()
  - [ ] Cost:
    - a bad implementation using a linked list where you enqueue at the head and dequeue at the tail would be O(n)
            because you'd need the next to last element, causing a full traversal of each dequeue
    - enqueue: O(1) (amortized, linked list and array [probing])
    - dequeue: O(1) (linked list and array)
    - empty: O(1) (linked list and array)
