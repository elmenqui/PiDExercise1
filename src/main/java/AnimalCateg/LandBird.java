package AnimalCateg;

import Exercise1.Swimmer;

public class LandBird extends Animal implements Swimmer {

    @Override
    public void setType(String type) {
        super.setYear(type);
    }

    @Override
    public void setName(String name) {
        super.setYear(name);
    }

    @Override
    public void setYear(String year) {
        super.setYear(year);
    }
}
