package cn.lioyan.index;

/**
 * {@link org.apache.lucene.index.DocumentsWriterPerThreadPool}
 *
 * {@link org.apache.lucene.index.DocumentsWriterPerThread} 的 线程池
 *
 *
 *  构造函数 传入 Supplier<DocumentsWriterPerThread> ，提供 DocumentsWriterPerThread的工厂类
 *
 *
 *  DocumentsWriterPerThread 中有lock 。被锁住的时候，表示已经有线程在是呀
 *
 *  内部维护freeList 表示空闲的DocumentsWriterPerThread
 *
 *  getAndLock 获取空闲的 DocumentsWriterPerThread，并且锁住。如果没呀则创建新的
 *
 *  checkout 删除 DocumentsWriterPerThread
 *
 *
 *  marksAsFreeAndUnlock 释放 DocumentsWriterPerThread。
 *
 * @author com.lioyan
 * @since 2023/7/21  10:41
 */
public class DocumentsWriterPerThreadPool
{
}
