package cn.lioyan.test;

import java.nio.ByteBuffer;
/**
 * {@link ByteBufferExample}
 *
 * @author com.lioyan
 * @since 2023/7/18  9:36
 */
public class ByteBufferExample
{
    public static void main(String[] args) {
        // 创建一个容量为10的ByteBuffer
        ByteBuffer buffer = ByteBuffer.allocate(10);

        // 输出初始的position、limit和capacity
        System.out.println("初始：position=" + buffer.position() + ", limit=" + buffer.limit() + ", capacity=" + buffer.capacity());

        // 写入数据
        buffer.put((byte) 1);
        buffer.put((byte) 2);
        buffer.put((byte) 3);

        // 输出写入后的position、limit和capacity
        System.out.println("写入数据后：position=" + buffer.position() + ", limit=" + buffer.limit() + ", capacity=" + buffer.capacity());

        // 切换为读模式
        buffer.flip();

        // 读取数据
        System.out.println("读取数据：");
        while (buffer.hasRemaining()) {
            byte value = buffer.get();
            System.out.println(value);
        }

        // 输出读取后的position、limit和capacity
        System.out.println("读取数据后：position=" + buffer.position() + ", limit=" + buffer.limit() + ", capacity=" + buffer.capacity());

        // 清空缓冲区
        buffer.clear();

        // 输出清空后的position、limit和capacity
        System.out.println("清空缓冲区后：position=" + buffer.position() + ", limit=" + buffer.limit() + ", capacity=" + buffer.capacity());
    }
}
