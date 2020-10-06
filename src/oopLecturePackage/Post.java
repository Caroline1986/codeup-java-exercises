package oopLecturePackage;

import java.util.Date;
//static vs. instance
//info for blog posts
public class Post {

    //blog views

    //title
    private String title;

    //getter for title
    public String getTitle(){
        return this.title;
    }

    //setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    //author
    public String authorName;

    //datePosted
    public Date datePosted;

    //content
    public String content;

    //dateEdited
    public Date dateEdited;

    //constructor<--name has to have the same name as class
    public Post(String title){
        this.title = title;
        this.authorName = "";
    }

    public Post(String title, String authorName) {
        this.title = title;
        this.authorName = authorName;
    }

    //display title and authorName<--instance method
    public void printTitleAndAuthor() {
        System.out.println("The title: " + this.title);
        System.out.println("The author is: " + this.authorName);
    }

    //method to return the longer title of two blog posts...
    public static String returnLongerPostTitle(Post p1, Post p2) {
        if(p1.title.length() > p2.title.length()) {
            return p1.title;
        }else {
            return p2.title;
        }
    }

    public static void main(String[] args) {
        Post p = new Post("A Day in the Life");//<--can only call one constructor bc of overload.
//        Post p = new Post("A Day in the Life", "Max Smith");

//        p.title = "A Day in the Life"; <--(commented out to use constructor ex)
//        p.content = "I am what I am.";
//        p.datePosted = new Date();
//        p.dateEdited = new Date();
//        p.authorName = "Max Smith";

        p.printTitleAndAuthor();

    }
}
