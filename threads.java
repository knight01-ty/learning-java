public class threads {
    class Storage {

    int value;

    void setValue(int value) {
        this.value = value;
    }

    int getValue() {
        return value;
    }
}

class Counter extends Thread {

    Storage storage;

    Counter(Storage storage) {
        this.storage = storage;
    }

    public void run() {

        for (int i = 0; i <= 10; i++) {

            storage.setValue(i);

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Printer extends Thread {

    Storage storage;

    Printer(Storage storage) {
        this.storage = storage;
    }

    public void run() {

        for (int i = 0; i <= 10; i++) {

            System.out.println("Value = " + storage.getValue());

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class ThreadStorageDemo {

    public static void main(String[] args) {

        Storage storage = new Storage();

        Counter counter = new Counter(storage);
        Printer printer = new Printer(storage);

        counter.start();
        printer.start();
    }
}
}
