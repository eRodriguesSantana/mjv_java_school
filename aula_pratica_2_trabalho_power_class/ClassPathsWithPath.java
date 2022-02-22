import java.nio.file.Path;
import java.nio.file.Paths;

public class ClassPathsWithPath {

   public static void main(String[] args) {
    Path pathAbsolute = Paths.get("C:/teste/docs/exemplo.txt");
    Path pathBase = Paths.get("C:/teste");
    Path pathRelative = pathBase.relativize(pathAbsolute);
    System.out.println(pathRelative);
  }

}
