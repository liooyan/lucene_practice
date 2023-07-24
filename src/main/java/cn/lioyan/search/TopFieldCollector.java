package cn.lioyan.search;

/**
 * {@link org.apache.lucene.search.TopFieldCollector}
 * 用于排序的收集器。根据排序，返回前 n的结果
 * 需要 一个 FieldValueHitQueue 保存数据
 *
 * getLeafCollector 中
 * 通过 FieldValueHitQueue.getComparators 获取比较器
 * 如果收集器没满，直接存储数据到Queue
 *
 * 如果满了。则将最小值保存在 bottom 中，
 * 新的值传入是，通过 比较器比较，如果大于 bottom，则替换 bottom。并将bottom的doc与value跟新
 * 然后再通过 Queue 获取Queue 内的新的最小值
 *
 * topDocs() 返回结果
 *
 *
 *
 *
 * @author com.lioyan
 * @since 2023/7/24  18:19
 */
public class TopFieldCollector
{
}
