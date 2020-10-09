public class LockingDoor extends Door {
    private boolean locked;

    public LockingDoor(String aDescription) {
        super(aDescription);
        this.locked = true;
    }

    public boolean isLocked() {
        return locked;
    }

    public void unlock() {
        if (!locked) {
            System.out.println("The door is already unlocked.");
            return;
        }

        System.out.printf("Unlocking the %s door.\n", this.description);
        this.locked = false;
    }

    public void lock() {
        if (this.locked) {//<--use this. or not. will work either way
            System.out.println("The door is already locked.");
            return;
        }
        System.out.printf("Locking the %s door.\n", this.description);
        this.locked = true;
    }

    public void open() { //<--void because we are acting on something and not expecting something to come back
        if (locked) {
            System.out.printf("The %s door is locked.\n", this.description);
            return;
        }
        super.open();
    }
}

