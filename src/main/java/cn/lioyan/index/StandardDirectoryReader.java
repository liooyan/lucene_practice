package cn.lioyan.index;

import org.apache.lucene.index.SegmentReader;
import org.apache.lucene.store.Directory;


/**
 * {@link org.apache.lucene.index.StandardDirectoryReader}
 *
 * 读取指定文件夹下的索引
 * {@link org.apache.lucene.index.StandardDirectoryReader#open(Directory)}
 *
 * 加载所有的段
 *   SegmentInfos sis = SegmentInfos.readCommit(directory, segmentFileName);
 *
 *   为每个段 创建 {@link SegmentReader}
 * @author com.lioyan
 * @since 2023/7/21  11:47
 */
public class StandardDirectoryReader
{
}
