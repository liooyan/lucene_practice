package cn.lioyan.index;

import org.apache.lucene.search.DocIdSetIterator;


/**
 * {@link org.apache.lucene.index.DocValuesWriter}
 * 用于将 doc values的索引 写入到磁盘
 *
 * flush {@link org.apache.lucene.index.DocValuesWriter#flush} 将 数据刷新到 DocValuesConsumer 中
 *
 * getDocValues 返回 {@link DocIdSetIterator} 迭代器
 *
 *
 * 当我们添加数据时不同的字段，将数据添加到不同的DocValuesWriter中，之后在需要刷新时调用 flush 方法，将数据刷新到 DocValuesConsumer 中
 * @author com.lioyan
 * @since 2023/7/19  17:42
 */
public class DocValuesWriter
{
}
