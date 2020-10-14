import oopLecturePackage.Post;

import java.util.ArrayList;
import java.util.HashMap;

import oopLecturePackage.Post;

public class collectionsLecture {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Post> posts = new ArrayList<>();

        System.out.println(names.size());//<--size of ArrayList is 0
        names.add("Fernando");//<-- needs to be a string to match datatype. '.add' is used to add to an array
        System.out.println(names.size());//<--changes dynamically so ArrayList is now 1;
        names.add("Daniel");
        names.add("Kenneth");

        posts.add(new Post("Fer's weekend", "Fer"));
        posts.add(new Post("Ana's weekend2", "Ana"));
        posts.add(new Post("Ryan's weekend3", "Ryan"));

        System.out.println("names.get(0) = " + names.get(0));//.get to get information inside of the array
//        System.out.println("names.get(1) = " + names.get(1));
        System.out.println("names.indexOf(\"Kenneth\") = " + names.indexOf("Kenneth"));

        System.out.println("names.get(2).toUpperCase() = " + names.get(2).toUpperCase());

        if (names.contains("Kenneth")) {//<--check if an element exists
            System.out.println("names.get(2) = " + names.get(names.indexOf("Kenneth")).toUpperCase());
        }

        Post deletedPost = posts.remove(1);//<--removes post at index1, Ana
        deletedPost.printTitleAndAuthor();
        System.out.println("posts.lastIndexOf(deletedPost) = " + posts.lastIndexOf(deletedPost));

        if (!posts.isEmpty()) {
            for (Post post : posts) { //<--from a list of posts, create a post
                post.printTitleAndAuthor(); //<--this is from the post.java file in ooplecturePackage
            }
        }
    }

    /**
     *
     */
    public static void hashMapsPractice() {
        HashMap<String, String> usernames = new HashMap<>();
        HashMap<String, Post> postsMap = new HashMap<>();
        
        usernames.put("fmendozaro", "Fernando M R");//<-- .put replaces value with new value
        usernames.putIfAbsent("fmendozaro", "Fernando Mendoza R");
        usernames.put("zguldes", "Zach Gulde");

        postsMap.putIfAbsent("20201013-111489", new Post("Titles"));//<--create unique identifier with unique string
        postsMap.putIfAbsent("20201013-239889", new Post("Titles 2"));
        postsMap.putIfAbsent("20201013-987563", new Post("Titles 3"));
        
        System.out.println("usernames.get(\"ryanorsinger\") = " + usernames.get("ryanorsinger"));
        System.out.println("usernames.get(\"fmendozaro\") = " + usernames.get("fmendozaro"));
        System.out.println("usernames.getOrDefault(\"ryanorsinger\",\"N/A\") = " + usernames.getOrDefault("ryanorsinger","N/A"));
        
        if(usernames.containsKey("ryanorsinger")){
            System.out.println("usernames.get(\"ryanorsinger\") = " + usernames.get("ryanorsinger"));
            System.out.println("Login into the system");
        } else {
            System.out.println("User not found");
            System.out.println("Roll back transaction");
            System.out.println("Ask again");
        }

        System.out.println("usernames.containsValue(\"Fernando M R\") = " + usernames.containsValue("Fernando M R"));
        System.out.println("usernames.containsValue(\"Fernando M Rs\") = " + usernames.containsValue("Fernando M Rs"));

       // postsMap.clear();//<--to delete keys and values in hashmap

        postsMap.remove("20201013-111489");//<--removes specific key

//        usernames.replace("20201013-987563", new Post("Titles 2"));

        if(!postsMap.isEmpty())//<--if the posts for hashmap is not empty, perform the loop
        System.out.println("hashmap keyset");
        for (String key: postsMap.keySet()) {//<--keySet is java language
//            System.out.println("key = " + key);//<--able to get keys and values
            postsMap.get(key).printTitleAndAuthor();//<--get methods or post objects
        }
        //this is a better way
        System.out.println("hashmap values");
        for (Post post: postsMap.values()) { //<--allows to get only values
            post.printTitleAndAuthor();
        }
    }
}
