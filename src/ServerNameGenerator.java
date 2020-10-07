public class ServerNameGenerator {
    //    Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
    public static String[] adjectives = {
            ("machiavellian"),
            ("voluble"),
            ("ubiquitous"),
            ("stupendous"),
            ("sedentary"),
            ("minuscule"),
            ("aesthetic"),
            ("altruistic"),
            ("complaisant"),
            ("vivacious")

    };
    public static String[] nouns = {
            ("tower"),
            ("leggos"),
            ("Johnny Depp"),
            ("Eiffel Tower"),
            ("Tennessee"),
            ("Hedwig"),
            ("pizza"),
            ("taco sauce"),
            ("door"),
            ("Howl")
    };

    //    create a method that will return a random element from an array of strings
    public static String randomElement (String[] arry1){
        int i = arry1.length;
        int randomElement = (int) Math.floor(Math.random()* i);
        return arry1[randomElement];
    }

//Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
    public static void main(String[] args) {
        for (int i = 0; i<10; i++){
            randomServerName(adjectives, nouns);
        }
    }


    public static String randomServerName (String[] arry1, String[] arry2){
        String serverName = ("Your Random Server name is: \n" + randomElement(arry1).toUpperCase() + "-" + randomElement(arry2).toUpperCase());
        System.out.println(serverName);
        return serverName;
    }
}
