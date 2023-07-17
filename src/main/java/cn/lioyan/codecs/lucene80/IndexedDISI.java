package cn.lioyan.codecs.lucene80;

import org.apache.lucene.search.DocIdSetIterator;
import org.apache.lucene.store.IndexOutput;


/**
 * {@link IndexedDISI}
 * 基于磁盘实现的 {@link DocIdSetIterator}
 *
 *
 * 静态方法 {@link IndexedDISI#writeBitSet(DocIdSetIterator , IndexOutput , byte )}
 *  将 DocIdSetIterator 写入到 IndexOutput 中， 返回 数据被分未多少块数据
 * 实现逻辑
 *  将数据按照 2^denseRankPower 数量进行分块，每块数据只存储 id & 0xFFFF 的值，
 *  并在所有块的后面存储一个jump 数组，2个为一对， 第一个数据表示 当前块开始位置的偏移量，第二个表示当前是第几块
 *
 *  每块内容具体写入格式{@link IndexedDISI#flush}
 *  Short 当前块编号
 *  Short 每块存储数据的数量，也就是 denseRankPower参数
 *
 *  数据按照不同数量进行保存
 *  1， 小于 4096， 每个数据按照 Short 进行保存
 *  2， 等于 65536， 直接按{@link  org.apache.lucene.util.Bits} 进行保存
 *  3、 其他后续再说
 *
 *
 //TODO 数据加载 再 说
 *
 * @author com.lioyan
 * @since 2023/7/17  16:58
 */
public class IndexedDISI
{
}
