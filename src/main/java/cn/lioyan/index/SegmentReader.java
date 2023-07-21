package cn.lioyan.index;

import org.apache.lucene.codecs.perfield.PerFieldDocValuesFormat;


/**
 * {@link org.apache.lucene.index.SegmentReader}
 * 具体某一段的索引
 *
 *  索引创建过程：
 * 构造函数中有 docValuesProducer 用于加载本段的索引
 * 其根据全局的一个 {@link PerFieldDocValuesFormat} fieldsProducer方法创建本段的索引{@link PerFieldDocValuesFormat.FieldsReader}
 *
 * getDocValuesReader() 就是返回构造函数中的内容
 *
 *
 *
 *
 *
 * @author com.lioyan
 * @since 2023/7/21  11:48
 */
public class SegmentReader
{
}
