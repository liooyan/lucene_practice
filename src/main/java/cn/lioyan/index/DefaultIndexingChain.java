package cn.lioyan.index;

import cn.lioyan.codecs.compressing.CompressingStoredFieldsWriter;
import org.apache.lucene.codecs.lucene87.Lucene87Codec;
import org.apache.lucene.codecs.lucene87.Lucene87StoredFieldsFormat;


/**
 * {@link org.apache.lucene.index.DefaultIndexingChain}
 * 用于处理具体某一个段文档的所有数据
 * 初始化的时候创建一下对象
 * 1、 {@link org.apache.lucene.index.StoredFieldsConsumer} 包含code 对象，见 {@link Lucene87Codec}
 *     可以创建 {@link Lucene87StoredFieldsFormat}  找到 {@link CompressingStoredFieldsWriter}
 *
 *
 * 添加文档： processDocument
 * {@link org.apache.lucene.index.DefaultIndexingChain#processDocument(int, Iterable)}
 *
 *
 * 索引的写过程
 * 调用 {@link org.apache.lucene.index.DefaultIndexingChain#indexDocValue} 方法 将数据写入到内存中
 *
 * 再刷新是，落盘
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * 每个字段都有 {@link org.apache.lucene.index.DefaultIndexingChain.PerField} 的属性，它包含：
 *1、{@link  FieldInfo}
 * 2、{@link  DocValuesWriter} 索引字段的格式化器
 * 3、
 *
 * @author com.lioyan
 * @since 2023/7/20  15:46
 */
public class DefaultIndexingChain
{
}
