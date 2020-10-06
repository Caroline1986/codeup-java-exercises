package oopLecturePackage;

import javax.sound.midi.Soundbank;

public class PostTest {
    public static void main(String[] args){
        Post post = new Post("A Day in the Life", "Max Smith");
        System.out.println(post.getTitle());//<--use getter from post
        post.setTitle("Some Other Title");//<--use setter from post
        System.out.println(post.getTitle());
//        System.out.println(post.title);
//        post.title = "Some Other Title";
//        System.out.println(post.title);<--cannot access if private
    }
}
