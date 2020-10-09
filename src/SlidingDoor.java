public final class SlidingDoor extends Door{//<--final makes this class unable to be accessed from anywhere else

    public SlidingDoor(String aDescription) {
        super(aDescription);//<--super is a reference to the parent. In this case, Door
    }

    public void open() {
        System.out.printf("Attempting to slide open the %s door.\n", this.description);
        super.open();
    }

    public void close() {
        System.out.printf("Attempting to slide closing the %s door.\n", this.description);
        super.close();
    }
}
