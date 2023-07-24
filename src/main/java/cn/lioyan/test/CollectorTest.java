package cn.lioyan.test;

import org.apache.lucene.index.*;
import org.apache.lucene.search.LeafFieldComparator;
import org.apache.lucene.search.comparators.LongComparator;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;

import java.io.IOException;
import java.nio.file.Paths;


/**
 * {@link CollectorTest}
 *
 * @author com.lioyan
 * @since 2023/7/24  16:38
 */
public class CollectorTest
{

    public static void main(String[] args)
        throws IOException
    {
        Directory directory = FSDirectory.open(Paths.get("tempPath"));

        IndexReader reader = DirectoryReader.open(directory);

        IndexReaderContext context = reader.getContext();

        LongComparator longComparator = new LongComparator(10,"visit",null,true,0);

        for (LeafReaderContext leaf : context.leaves())
        {


            LongComparator.LongLeafComparator leafComparator = (LongComparator.LongLeafComparator)longComparator.getLeafComparator(leaf);
            leafComparator.copy(0,1);
            leafComparator.copy(1,2);
            leafComparator.copy(2,3);
            leafComparator.copy(3,4);

            int i = leafComparator.compareBottom(0);

        }

    }
}
