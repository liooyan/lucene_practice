package cn.lioyan.codecs.perfield;

/**
 * {@link org.apache.lucene.codecs.perfield.PerFieldDocValuesFormat}
 *  每个字段 的 DocValuesFormat 对象
 *
 *  Lucene87Codec 就是这个对象。
 *
 *  写： DefaultIndexingChain 为 每个字段 {@link org.apache.lucene.codecs.perfield.PerFieldDocValuesFormat.FieldsWriter}  其实使用的是  Lucene80DocValuesConsumer
 *
 *
 *  读取： SegmentReader 为每个字段 {@link org.apache.lucene.codecs.perfield.PerFieldDocValuesFormat.FieldsReader}
 *
 private final Map<String,DocValuesProducer> fields = new TreeMap<>();
 private final Map<String,DocValuesProducer> formats = new HashMap<>();
 保存每个段。每个字段的 DocValuesProducer 。每个段公用一个 DocValuesProducer

 DocValuesProducer 其实是使用  {@link org.apache.lucene.codecs.lucene80.Lucene80DocValuesConsumer}， 一个段一个对象
 *
 *
 *
 * @author com.lioyan
 * @since 2023/7/21  18:05
 */
public class PerFieldDocValuesFormat
{
}
