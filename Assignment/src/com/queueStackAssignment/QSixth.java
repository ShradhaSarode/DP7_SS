package com.queueStackAssignment;
//6.	WAP to implement your own implementation of Queue using an array internally

public class QSixth<T> {
	private static final int DEFAULT_CAPACITY = 10;
	private Object[] elements;
	private int front;
	private int rear;
	private int size;

	public QSixth() {
		this.elements = new Object[DEFAULT_CAPACITY];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}

	public void enqueue(T element) {
		if (size == elements.length) {
			resize();
		}
		rear = (rear + 1) % elements.length;
		elements[rear] = element;
		size++;
	}

	public T dequeue() {
		if (isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}
		T removedElement = (T) elements[front];
		elements[front] = null;
		front = (front + 1) % elements.length;
		size--;
		return removedElement;
	}

	public T peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}
		return (T) elements[front];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	private void resize() {
		int newCapacity = elements.length * 2;
		Object[] newElements = new Object[newCapacity];
		for (int i = 0; i < size; i++) {
			newElements[i] = elements[(front + i) % elements.length];
		}
		elements = newElements;
		front = 0;
		rear = size - 1;
	}

	public static void main(String[] args) {
		QSixth<Integer> queue = new QSixth<>();

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);

		System.out.println("Dequeued: " + queue.dequeue());

		queue.enqueue(40);
		queue.enqueue(50);

		System.out.println("Front element: " + queue.peek());

		System.out.println("Queue size: " + queue.size());

		System.out.println("Dequeued elements:");
		while (!queue.isEmpty()) {
			System.out.println(queue.dequeue());
		}
	}
}
