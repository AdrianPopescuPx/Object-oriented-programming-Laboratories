package lab5.task2;

import lab5.task1.Task;

import java.util.ArrayList;

public class Stack implements Container {

    ArrayList<Task> tasks = new ArrayList<>();
    @Override
    public Task pop() {
        return tasks.remove(tasks.size() - 1);
    }

    @Override
    public void push(Task task) {
        tasks.add(task);
    }

    @Override
    public int size() {
        return tasks.size();
    }

    @Override
    public boolean isEmpty() {
        return tasks.isEmpty();
    }

    @Override
    public void transferFrom(Container container) {
        if (container instanceof Stack) {
            Stack stack = (Stack) container;
            tasks.addAll(stack.tasks);
        }
        else {
            Queue queue = (Queue) container;
            tasks.addAll(queue.tasks);
        }

    }
}
