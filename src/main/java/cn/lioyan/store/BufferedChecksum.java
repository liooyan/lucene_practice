package cn.lioyan.store;

import java.util.zip.CRC32;


/**
 * {@link org.apache.lucene.store.BufferedChecksum}
 * 通过 update 添加数据， 通过 getValue 获取校验和
 * @author com.lioyan
 * @since 2023/7/18  10:46
 */
public class BufferedChecksum
{
    public static void main(String[] args)
    {
        org.apache.lucene.store.BufferedChecksum crc = new org.apache.lucene.store.BufferedChecksum(new CRC32());

        for (int i = 0; i < 100; i++)
        {
            crc.update(i);
        }
        System.out.println(crc.getValue());

    }
}
