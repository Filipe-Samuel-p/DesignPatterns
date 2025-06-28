package list_3.ISP;

class Developer implements Programmer {
    @Override
    public void program() {
        System.out.println("Writing clean, efficient code...");
    }

    @Override
    public void debugCode() {
        System.out.println("Debugging and fixing issues...");
    }
}