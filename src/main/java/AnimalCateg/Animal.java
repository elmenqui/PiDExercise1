package AnimalCateg;

public class Animal {

    private String type;
    private String name;
    private String year;

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(String year) {
        this.year = year;
    }


    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        try {
            return Integer.parseInt(year);
        }  catch (Exception e)         {
            System.out.println("Invalid characters: field not added");
            return 0;
        }
    }
    
}

