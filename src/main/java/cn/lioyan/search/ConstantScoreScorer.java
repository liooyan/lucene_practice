package cn.lioyan.search;

/**
 * {@link org.apache.lucene.search.ConstantScoreScorer}
 * 参数需要一个 DocIdSetIterator ，这个DocIdSetIterator 已经是通过 Weight 封装后的， 符合当前过滤条件的数据
 *
 * score 是固定的 通过构造参数获取
 * @author com.lioyan
 * @since 2023/7/24  10:55
 */
public class ConstantScoreScorer
{
}
