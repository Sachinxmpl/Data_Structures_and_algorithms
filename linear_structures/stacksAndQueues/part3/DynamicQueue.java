package linear_structures.stacksAndQueues.part3;

//dynamic circular queue
public class DynamicQueue extends CircularQueue {
    public DynamicQueue(int size) {
        super(size);
    }

    public DynamicQueue() {
        super();
    }

    @Override
    public void insert(int val) throws Exception {
        if (isFull()) {
            int[] temp = new int[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
        super.insert(val);
    }

}
