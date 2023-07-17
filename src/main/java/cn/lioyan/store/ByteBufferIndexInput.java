package cn.lioyan.store;

/**
 * {@link  org.apache.lucene.store.ByteBufferIndexInput}
 * ByteBuffer 实现的  {@link org.apache.lucene.store.IndexInput}
 * 就是通过 ByteBuffer 进行数据的读取。ByteBuffer 可以有多个， 数组。按照需要进行却换
 *
 * seek 对应 ： ByteBuffer 的position
 * slice 通过 ByteBuffer 的 duplicate 复制 流。 通过 limit 现在长度
 * @author com.lioyan
 * @since 2023/7/17  18:01
 */
public class ByteBufferIndexInput
{
}
