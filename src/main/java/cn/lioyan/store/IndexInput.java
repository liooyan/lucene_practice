package cn.lioyan.store;

import org.apache.lucene.store.DataInput;


/**
 * {@link org.apache.lucene.store.IndexInput}
 * 基于 {@link  DataInput},DataInput 定义了一下基础数据的读取方式，最后都统一到 byte 读取
 *
 * 用于目录文件的随机访问类，添加如下定义：
 *
 * 1 {@link  org.apache.lucene.store.IndexInput#seek(long)}
 *      将输入流，跳转至指定位置
 *
 *
 * 2 {@link  org.apache.lucene.store.IndexInput#slice(String, long, long)}
 *      截取指定位置的 输入流，作为一个新的输入流
 *
 * @author com.lioyan
 * @since 2023/7/17  17:54
 */
public class IndexInput
{
}
