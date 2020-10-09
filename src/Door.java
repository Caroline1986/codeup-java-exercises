public class Door {
    private boolean open;
    public String description;

    public Door(String aDescription) {
        this.description = aDescription;
        this.open = false;
    }

    //create methods to pull private data
    //method 1
    public boolean isOpen(){
        return this.open;
    }
    //method 2
    public void close() {
        if(!this.open) {
            System.out.printf("The %s door is already closed\n", this.description);
            return;//<--returns stops method if door is closed vvvv will not run below code
        }
        System.out.printf("Closing the %s door.\n", this.description);
        this.open = false;
    }

    public void open() {
        if(this.open) {
            System.out.printf("The %s door is already open\n", this.description);
            return;//<--returns stops method if door is closed vvvv will not run below code
        }
        System.out.printf("Opening the %s door.\n", this.description);
        this.open = true;
    }
}
