package lancs.ac.uk.androidtester.objects;

public class Survey {
    private String name;

    public Survey(String name){
        super();
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
