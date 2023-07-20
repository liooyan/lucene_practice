package cn.lioyan.codecs.lucene80;

/**
 * {@link org.apache.lucene.codecs.lucene80.Lucene80DocValuesProducer}
 * 在创建对象时，将本段的数据加载：
 *   private final Map<String,NumericEntry> numerics = new HashMap<>();
 *   private final Map<String,BinaryEntry> binaries = new HashMap<>();
 *   private final Map<String,SortedEntry> sorted = new HashMap<>();
 *   private final Map<String,SortedSetEntry> sortedSets = new HashMap<>();
 *   private final Map<String,SortedNumericEntry> sortedNumerics = new HashMap<>();
 *
 *
 * {@link org.apache.lucene.codecs.lucene80.Lucene80DocValuesProducer#getNumeric} 获取numeric的迭代器
 *
 * @author com.lioyan
 * @since 2023/7/20  10:05
 */
public class Lucene80DocValuesProducer
{
}
