package movies;

//Create a class named Movie. It should have private fields for name and category
public class Movie {
    private String name;
    private String category;
//and a constructor that sets both of these
    public Movie (String aName, String aCategory){
        this.name = aName;
        this.category = aCategory;
    }
//    Create methods to access these properties and change them (getters and setters).
    public String getName(){
        return this.name;
    }

    public void setName(String aName){
        this.name = aName;
    }

    public String getCategory(){
        return this.category;
    }

    public void setCategory(String aCategory){
        this.category = aCategory;
    }

}
