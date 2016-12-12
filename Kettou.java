import java.io.File.*;
import java.io.File;
import java.io.*;
import java.util.*;
import java.nio.file.*;
import java.lang.Math;
import javazoom.jl.player.*;
import javazoom.jl.decoder.JavaLayerException;

public class Kettou {
  public static void main(String... main) {
    File folder = new File("./");
    File[] files = folder.listFiles(new FilenameFilter() {
      public boolean accept(File dir, String name) {
          return name.toLowerCase().endsWith(".mp3");
      }
    });

    while (true) {
      Scanner s = new Scanner(System.in);
      System.out.println("Please press ENTER");
      s.nextLine();

      int random = (int)(Math.random() * files.length);

      try (FileInputStream fis = new FileInputStream(files[random]))
      {
          Player player = new Player(fis);
          player.play();
      } catch (IOException | JavaLayerException e) {
          e.printStackTrace();
      }

    }
  }
}
