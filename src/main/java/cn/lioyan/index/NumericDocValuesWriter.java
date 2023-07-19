package cn.lioyan.index;

import org.apache.lucene.index.NumericDocValues;
import org.apache.lucene.util.packed.PackedLongValues;


/**
 * {@link org.apache.lucene.index.NumericDocValuesWriter}
 *  单值numeric的  DocValuesWriter。
 *  通过 {@link org.apache.lucene.index.DocsWithFieldSet}/ {@link PackedLongValues} 分别保存 文档id与值
 *
 *  交给 {@link org.apache.lucene.index.NumericDocValuesConsumer} 的 {@link NumericDocValues} 为内部类
 *  {@link org.apache.lucene.index.NumericDocValuesWriter.BufferedNumericDocValues}
 *
 * @author com.lioyan
 * @since 2023/7/19  17:50
 */
public class NumericDocValuesWriter
{
}
