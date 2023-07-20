package cn.lioyan.index;

import cn.lioyan.codecs.compressing.CompressingStoredFieldsWriter;


/**
 * {@link  org.apache.lucene.index.StoredFieldsConsumer}
 * 用在 {@link DefaultIndexingChain} 中
 *
 * 分别调用：
 * 1 startDocument
 * 2 writeField
 * 3 finishDocument
 * 4 finish
 * 全部转发到 {@link  CompressingStoredFieldsWriter}
 *
 * @author com.lioyan
 * @since 2023/7/20  16:35
 */
public class StoredFieldsConsumer
{
}
