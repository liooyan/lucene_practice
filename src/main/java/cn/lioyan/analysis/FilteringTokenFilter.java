package cn.lioyan.analysis;

import org.apache.lucene.analysis.tokenattributes.PositionIncrementAttribute;


/**
 * {@link org.apache.lucene.analysis.FilteringTokenFilter}
 * 带有过滤属性的 {@link org.apache.lucene.analysis.TokenFilter} 。
 * 抽象 accept() 方法， 子类实现，用于判断当前token是否符合要求， true 符合
 *
 * {@link PositionIncrementAttribute} 修改了位置增量属性，如果当前token 被过滤，那么位置增量属性将被增加
 *
 *
 *
 *
 * @author com.lioyan
 * @since 2023/7/19  11:04
 */
public class FilteringTokenFilter
{
}
