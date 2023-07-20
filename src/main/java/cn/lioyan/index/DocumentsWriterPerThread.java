package cn.lioyan.index;



/**
 * {@link org.apache.lucene.index.DocumentsWriterPerThread}
 * 用于某个具体线程的文档写入类，这个类只会操作具体的某一段文档
 *
 * 添加数据：updateDocuments
 *
 * 成员遍历：
 *  numDocsInRAM 内存中的文档数量，也被保存为文档id
 *
 *
 *  内部每个对应一个 {@link  org.apache.lucene.index.DefaultIndexingChain}
 * @author com.lioyan
 * @since 2023/7/20  15:35
 */
public class DocumentsWriterPerThread
{
}
