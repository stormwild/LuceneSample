package app.lucene;

import java.io.File;
import java.io.FileFilter;

/**
 * TextFilter
 */
public class TextFilter implements FileFilter {

  @Override
  public boolean accept(File pathname) {
    return pathname.getName().toLowerCase().endsWith(".txt");
  }
  
}