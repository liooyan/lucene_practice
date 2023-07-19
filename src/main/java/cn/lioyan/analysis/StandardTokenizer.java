package cn.lioyan.analysis;

import org.apache.lucene.analysis.tokenattributes.TermToBytesRefAttribute;


/**
 * {@link org.apache.lucene.analysis.standard.StandardTokenizer}
 *  标准的 {@link org.apache.lucene.analysis.Tokenizer} 实现，基于 Unicode 文本分割算法
 *  这里只设置了3个属性：
 *  1 {@link TermToBytesRefAttribute} 文本
 *  2 {@link org.apache.lucene.analysis.tokenattributes.OffsetAttribute} 偏移量
 *  3 {@link org.apache.lucene.analysis.tokenattributes.PositionIncrementAttribute} 位置增量 ，及与上一个token 的距离，如果是相连，就是1，间隔几个token就是 n+1
 * @author com.lioyan
 * @since 2023/7/19  11:22
 */
public class StandardTokenizer
{
}
