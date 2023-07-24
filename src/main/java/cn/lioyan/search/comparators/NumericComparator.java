package cn.lioyan.search.comparators;

/**
 * {@link org.apache.lucene.search.comparators.NumericComparator}
 * 数值类型的比较强,定义 NumericDocValues docValues 。用于加载排序字段的值
 *
 * 主要用于compareBottom(int doc) 方法，doc 通过 docValues.nextValue() 获取值，然后和底部值比较。
 *
 *
 * @author com.lioyan
 * @since 2023/7/24  18:04
 */
public class NumericComparator
{
}
