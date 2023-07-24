package cn.lioyan.document;

import org.apache.lucene.search.TwoPhaseIterator;


/**
 * {@link org.apache.lucene.document.SortedNumericDocValuesRangeQuery}
 * 对 Numeric 类型的范围查询
 * createWeight 创建的是 ConstantScoreScorer
 * 重写了scorer 方法，其中通过 {@link TwoPhaseIterator} 进行过滤
 *
 * 但对于 getValues 获取原始数据的方法未实现，由子类实现，
 *
 * @author com.lioyan
 * @since 2023/7/24  11:03
 */
public class SortedNumericDocValuesRangeQuery
{
}
