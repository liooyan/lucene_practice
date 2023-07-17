package cn.lioyan.search;

/**
 * {@link org.apache.lucene.search.DocIdSetIterator}
 *  用于定义 文档id 的迭代器，最多值为 int 范围
 *  当 值为 integer.MAX_VALUE 表示无效值
 *
 *  获取下一个文档id
 *  {@link org.apache.lucene.search.DocIdSetIterator#nextDoc()}
 *
 *  返回当前的文档id
 *  {@link org.apache.lucene.search.DocIdSetIterator#docID()}
 *
 *
 *  直接跳转到指定的文档id，但不包含指定的id时，返回下一个文档id
 *  {@link org.apache.lucene.search.DocIdSetIterator#advance(int)}
 *
 *
 *  通过 nextDoc 方法，实现的一个通过缓慢的方式  advance 方法
 *  {@link org.apache.lucene.search.DocIdSetIterator#slowAdvance(int)}
 *
 *
 *  默认实现 3个子类
 *  1、 空的集合
 *  2、 0-n 的集合
 *  3、 n-m的连续集合
 *
 *
 * @author com.lioyan
 * @since 2023/7/17  16:06
 */
public class DocIdSetIterator
{
}
