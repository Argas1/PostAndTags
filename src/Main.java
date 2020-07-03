import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Post post = new Post("Piłka Nożna","Mateusz Argasiński");
        post.addTag(new Tag("#piłczka"));
        post.addTag(new Tag("#nożna"));
        post.addTag(new Tag("#granko"));
        post.addTag(new Tag("#granko"));
        post.addTag(new Tag("#messi"));

        System.out.println(post);
    }
}
