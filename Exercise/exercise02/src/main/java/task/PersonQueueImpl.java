package task;

import java.util.NoSuchElementException;

public class PersonQueueImpl implements PersonQueue {

    private QueueElement front = null;
    private QueueElement back = null;

    @Override
    public void enqueue(Person person) {
        QueueElement newElement = new QueueElement(person, null);
        if(front == null && back == null) {
            front = newElement;
        } else {
            back.setNext(newElement);
        }
        back = newElement;
    }
    @Override
    public Person dequeue() {

        if (back == null && front == null)
            throw new NoSuch


















        if(front == null && back == null) {
            throw new NoSuchElementException();
        } else {
            QueueElement node = front;
            // is the last remaining node?
            // set front and back to null
            if(node.getNext() == null) {
                front = null;
                back = null;
            } else {
                // otherwise just follow the first node's
                // next
                front = node.getNext();
            }
            return node.getValue();
        }
    }

    @Override
    public Person peek() {
        if(front == null) {
            throw new NoSuchElementException();
        } else {
            return front.getValue();
        }
    }

    @Override
    public int size() {
        QueueElement cursor = front;
        int n = 0;
        while(cursor != null) {
            n++;
            cursor = cursor.getNext();
        }
        return n;
    }
}
