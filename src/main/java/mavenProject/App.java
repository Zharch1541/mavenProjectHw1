package mavenProject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args){
        MyName myName = new MyName("Katya","Zharchynska");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(myName);
        System.out.println(json);
    }
}
