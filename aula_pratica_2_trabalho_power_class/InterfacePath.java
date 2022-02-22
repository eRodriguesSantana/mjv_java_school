import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InterfacePath {
   public static void main(String[] args) throws IOException {
	   
	  // Método get() transforma string em um objeto do tipo Path 
      Path path = Paths.get("/home/student/Downloads/mjv_java_school/aula_pratica_2_trabalho_power_class/Eduardo_Rodrigues_Santana.docx");
      //Path path = Paths.get("../../../../../Eduardo_Rodrigues_Santana.docx");
      
      // O método getFileSystem() retorna o sistema de arquivos do SO
      FileSystem fs =  path.getFileSystem();
      System.out.println("1 - "+fs.toString());
      
      // Retorna booleano: true se o caminho absoluto, false o contrário
      System.out.println("2 - "+path.isAbsolute());
      
      // Retorno o nome do último elemento do caminho (diretório ou arquivo)
      System.out.println("3 - "+path.getFileName());
      
      // Retorna o caminho absoluto de forma completa
      System.out.println("4 - "+path.toAbsolutePath().toString());
      
      // Retorna o componente raiz desse caminho ou null se esse caminho não tiver um componente raiz (caminho relativo).
      System.out.println("5 - "+path.getRoot());
      
      // Retorna o caminho pai ou null se esse caminho não tiver um pai. Funciona bem com caminhos absolutos
      System.out.println("6 - "+path.getParent());
      
      // Retorna um numero indicando a quantidade de elementos contidos no caminho
      System.out.println("7 - "+path.getNameCount());
      
      // Retorna o elemento correspondente a posição passada como parametro. Se a posição não existe java.lang.IllegalArgumentException é lançada
      System.out.println("8 - "+path.getName(0));							 

      // Retorna parte do caminho entre o indice inicial e o final. Se a posição não existe java.lang.IllegalArgumentException é lançada
      System.out.println("9 - "+path.subpath(0, 2));
      
      // Retorna o caminho de forma completa: absoluto ou relativo
      System.out.println("10 - "+path.toString());
      
      // Retorna o caminho real de um arquivo existente e pode seguir ou não seguir links simbólicos
      Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
      
      // Retorna o caminho de forma completa. Funciona apenas para caminho absoluto. Caminho relativo lança java.nio.file.NoSuchFileException
      System.out.println("11 - "+realPath.toString());      
      
      String originalPath = "home/../../../../Eduardo_Rodrigues_Santana.docx"; 
      
      // Método get() transforma string em um objeto do tipo Path
      Path path1 = Paths.get(originalPath);
      
      // Método normalize() retira nomes repetidos contido no caminho
      Path path2 = path1.normalize();
      System.out.println("12 - path2 = " + path2);
   }
}