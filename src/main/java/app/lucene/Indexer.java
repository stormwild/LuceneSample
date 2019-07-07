package app.lucene;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;

/**
 * Indexer
 */
public class Indexer {

  private IndexWriter writer;

  public Indexer(String indexDirectoryPath) throws IOException {
    File file = new File(indexDirectoryPath);
    Directory indexDirectory = FSDirectory.open(file.toPath());

    //create the indexer
    //new StandardAnalyzer(Version.LATEST), true, IndexWriter.MAX_STORED_STRING_LENGTH
    //writer = new IndexWriter(indexDirectory, );

  }
}
