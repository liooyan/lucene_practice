package cn.lioyan.store;

import java.nio.channels.FileChannel;


/**
 * {@link org.apache.lucene.store.MMapDirectory}
 * 基于mmap 的 {@link org.apache.lucene.store.FSDirectory} 的实现
 *
 * 主要为 {@link org.apache.lucene.store.MMapDirectory#openInput}  的实现
 * {@link  FileChannel#map(FileChannel.MapMode, long, long)} 将文件直接映射到内存中
 *
 *
 * @author com.lioyan
 * @since 2023/7/18  11:07
 */
public class MMapDirectory
{
}
