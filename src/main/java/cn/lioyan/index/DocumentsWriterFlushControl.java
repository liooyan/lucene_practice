package cn.lioyan.index;

/**
 * {@link org.apache.lucene.index.DocumentsWriterFlushControl}
 * DocumentsWriter 中不是直接通过 DocumentsWriterPerThreadPool 获取 DocumentsWriterPerThread
 * 而是通过这个类， 其中有检查 内存是呀逻辑，确定起刷新
 * @author com.lioyan
 * @since 2023/7/21  11:19
 */
public class DocumentsWriterFlushControl
{
}
