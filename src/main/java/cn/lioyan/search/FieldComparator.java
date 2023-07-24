package cn.lioyan.search;

/**
 * {@link org.apache.lucene.search.FieldComparator}
 *  字段比较器， 用于排序。
 *  主要使用的是 getLeafComparator(LeafReaderContext context) 方法，获取某一段数据的比较器。
 *  LeafReaderContext 共用 FieldComparator内存
 *
 *  方法 ：compareBottom(int doc) 用于比较当前的doc 和  比较器底部值大小。
 *
 *
 *  setBottom 设置某个索引数据为栈底。
 * @author com.lioyan
 * @since 2023/7/24  18:01
 */
public class FieldComparator
{
}
