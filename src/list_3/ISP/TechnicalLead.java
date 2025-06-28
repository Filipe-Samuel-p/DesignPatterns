package list_3.ISP;

class TechnicalLead implements Programmer, Manager {
    @Override
    public void program() {
        System.out.println("Leading by example, writing code...");
    }

    @Override
    public void debugCode() {
        System.out.println("Reviewing and debugging team's code...");
    }

    @Override
    public void manageTeam() {
        System.out.println("Managing development team...");
    }

    @Override
    public void planProject() {
        System.out.println("Planning project architecture and timeline...");
    }
}