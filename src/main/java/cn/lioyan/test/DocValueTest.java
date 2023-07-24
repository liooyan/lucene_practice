package cn.lioyan.test;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.*;
import org.apache.lucene.index.*;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.search.*;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.BytesRef;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;


/**
 * {@link DocValueTest}
 * 数据类型：https://blog.csdn.net/AmbHowie/article/details/105575815
 *
 * @author com.lioyan
 * @date 2023/2/21  18:00
 */
public class DocValueTest
{
    static Random random = new Random(100);

    public static void main(String[] args)
        throws IOException, ParseException
    {
        MAIN();
    }

    public static void MAIN()
        throws IOException
    {
        //addValue();
        boolQuert();

    }

    private static void addValue()
        throws IOException
    {
        //        // 0. Specify the analyzer for tokenizing text.
        //        //    The same analyzer should be used for indexing and searching
        StandardAnalyzer analyzer = new StandardAnalyzer();
        //
        //        // 1. create the index
        Directory directory = FSDirectory.open(Paths.get("tempPath"));

        IndexWriterConfig config = new IndexWriterConfig(analyzer);
        config.setUseCompoundFile(false);
        IndexWriter w = new IndexWriter(directory, config);
        for (int i = 0; i < 200000; i++)
        {
            addDoc(w, "Lucene Lucene in Action", "193398817", -5, new int[] {1, 2}, new String[] {"los angles", "beijing"});
            addDoc(w, "Lucene for Dummies", "55320055Z", 4, new int[] {5, 1}, new String[] {"shanghai", "beijing"});
            addDoc(w, "Managing Gigabytes", "55063554A", 12, new int[] {0, 1, 2}, new String[] {"shenzhen", "guangzhou"});
            addDoc(w, "The Art of Computer Science", "9900333X", 2, new int[] {10, 4, 3}, new String[] {"shanghai", "los angles"});
            addDoc(w, "C++ Primer", "914324235", 11, new int[] {0, 5, 2, 3}, new String[] {"beijing", "shenzhen"});
            addDoc(w, "I like Lucene", "fdsjfa2313", 1, new int[] {0, 1, 2, 4}, new String[] {"nanjing", "tianjin"});
            addDoc(w, "Lucene and C++ Primer", "fdsfaf", 10, new int[] {0, 1, 2}, new String[] {"shenzhen", "guangzhou"});
            addDoc(w, "C++ api", "411223432", 2, new int[] {0, 11, 2}, new String[] {"shenzhen", "shanghai"});
            addDoc(w, "C++ Primer", "914324236", 50, new int[] {3, 2, 6, 1}, new String[] {"beijing"});

        }
        w.close();

    }

    private static void addDoc(IndexWriter w, String title, String isbn, int visit, int[] sale_list, String[] locations)
        throws IOException
    {
        Document doc = new Document();
        //        doc.add(new StoredField("visit", visit));
        doc.add(new TextField("title", title, Field.Store.YES));
        doc.add(new TextField("title", title, Field.Store.YES));
        int visit2 = random.nextInt(10000);

        // use a string field for isbn because we don't want it tokenized
        doc.add(new StringField("isbn", isbn, Field.Store.YES));
        if (visit2 == 33 || visit2 == 43)
        {
            doc.add(new NumericDocValuesField("visit", visit2));
            doc.add(new StoredField("visit", visit2));
        }
        for (int sale : sale_list)
        {
            doc.add(new SortedNumericDocValuesField("sale", sale));
            doc.add(new SortedNumericDocValuesField("sale", sale));
        }

        for (String location : locations)
        {
            doc.add(new SortedSetDocValuesField("city", new BytesRef(location)));
        }

        w.addDocument(doc);
    }

    private static void tremQuert()
        throws IOException
    {
        long startTime = System.currentTimeMillis();
        Sort sort = new Sort();
        Directory directory = FSDirectory.open(Paths.get("tempPath"));

        IndexReader reader = DirectoryReader.open(directory);
        IndexSearcher searcher = new IndexSearcher(reader);

        Query q = new TermQuery(new Term("isbn", "fdsjfa2313"));

        TopFieldDocs search = searcher.search(q, 10, sort);
        ScoreDoc[] hits = search.scoreDocs;
        // 4. display results
        System.out.println("Found " + hits.length + " hits.");
        for (int j = 0; j < hits.length; ++j)
        {
            int docId = hits[j].doc;
            Document d = searcher.doc(docId);
            System.out.println(docId + ". " + d.get("isbn") + "\t" + d.get("title") + "\t" + d.get("visit"));
        }
        System.out.println("查询时间：" + (System.currentTimeMillis() - startTime));

    }

    private static void numericQuert()
        throws IOException
    {
        long startTime = System.currentTimeMillis();
        Sort sort = new Sort();
        Directory directory = FSDirectory.open(Paths.get("tempPath"));

        IndexReader reader = DirectoryReader.open(directory);
        IndexSearcher searcher = new IndexSearcher(reader);

        Query q = NumericDocValuesField.newSlowRangeQuery("visit", 32, 66);

        TopFieldDocs search = searcher.search(q, 10, sort);
        ScoreDoc[] hits = search.scoreDocs;
        // 4. display results
        System.out.println("Found " + hits.length + " hits.");
        for (int j = 0; j < hits.length; ++j)
        {
            int docId = hits[j].doc;
            Document d = searcher.doc(docId);
            System.out.println(docId + ". " + d.get("isbn") + "\t" + d.get("title") + "\t" + d.get("visit"));
        }
        System.out.println("查询时间：" + (System.currentTimeMillis() - startTime));

    }

    private static void boolQuert()
        throws IOException
    {
        long startTime = System.currentTimeMillis();
        Sort sort = new Sort(new SortField("visit", SortField.Type.LONG, true));
        Directory directory = FSDirectory.open(Paths.get("tempPath"));

        IndexReader reader = DirectoryReader.open(directory);
        IndexSearcher searcher = new IndexSearcher(reader);

        Query q = NumericDocValuesField.newSlowRangeQuery("visit", 32, 66);
        Query q2 = NumericDocValuesField.newSlowRangeQuery("visit", 1, 66);
        BooleanQuery.Builder b = new BooleanQuery.Builder();
        b.add(q, BooleanClause.Occur.MUST);
        b.add(q2, BooleanClause.Occur.MUST);
        b.setMinimumNumberShouldMatch(0);
        BooleanQuery query = b.build();

        TopFieldDocs search = searcher.search(query, 10, sort);
        ScoreDoc[] hits = search.scoreDocs;
        // 4. display results
        System.out.println("Found " + hits.length + " hits.");
        for (int j = 0; j < hits.length; ++j)
        {
            int docId = hits[j].doc;
            Document d = searcher.doc(docId);
            System.out.println(docId + ". " + d.get("isbn") + "\t" + d.get("title") + "\t" + d.get("visit"));
        }
        System.out.println("查询时间：" + (System.currentTimeMillis() - startTime));

    }

    private static void leafSearch()
        throws IOException
    {
        Directory directory = FSDirectory.open(Paths.get("tempPath"));
        // 3. search
        int hitsPerPage = 10;
        IndexReader reader = DirectoryReader.open(directory);
        IndexSearcher searcher = new IndexSearcher(reader);
        List<LeafReaderContext> leaves = reader.getContext().leaves();
        Query q = NumericDocValuesField.newSlowRangeQuery("visit", 32, 66);
        Weight weight = q.createWeight(searcher, ScoreMode.COMPLETE_NO_SCORES, 1);
        //        weight.scorer(reader.getContext());
        //        weight.

        for (LeafReaderContext leaf : leaves)
        {
            Scorer scorer = weight.scorer(leaf);
            if (scorer == null)
            {
                continue;
            }
            DocIdSetIterator iterator = scorer.iterator();
            int doc;
            while ((doc = iterator.nextDoc()) != DocIdSetIterator.NO_MORE_DOCS)
            {
                System.out.println(doc);
            }
        }
    }
}
