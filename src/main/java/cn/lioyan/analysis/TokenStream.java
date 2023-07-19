package cn.lioyan.analysis;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.analysis.tokenattributes.*;
import org.apache.lucene.util.BytesRef;

import java.io.IOException;
import java.io.StringReader;


/**
 * {@link org.apache.lucene.analysis.TokenStream}
 * 分词后 的 token 流，
 * 核心方法
 * 将流推进到下一个token
 * {@link org.apache.lucene.analysis.TokenStream#incrementToken()}
 *
 * 流结束调用
 * {@link org.apache.lucene.analysis.TokenStream#end()}
 *
 * 重置流，在 incrementToken 开始前调用
 * {@link org.apache.lucene.analysis.TokenStream#reset()}
 * @author com.lioyan
 * @since 2023/7/18  11:53
 */
public class TokenStream
{
    /**
     *
     * Description:         查看分词信息
     * @param str        待分词的字符串
     * @param analyzer    分词器
     *
     */
    public static void displayToken(String str, Analyzer analyzer){
        try {
            //将一个字符串创建成Token流
            org.apache.lucene.analysis.TokenStream stream  = analyzer.tokenStream("", new StringReader(str));
            //保存相应词汇
            CharTermAttribute cta = stream.getAttribute(CharTermAttribute.class);
            TermToBytesRefAttribute termAttribute = stream.getAttribute(TermToBytesRefAttribute.class);
            TermFrequencyAttribute termFreqAttribute = stream.addAttribute(TermFrequencyAttribute.class);
            PositionIncrementAttribute posIncrAttribute = stream.addAttribute(PositionIncrementAttribute.class);
            OffsetAttribute offsetAttribute = stream.addAttribute(OffsetAttribute.class);
            PayloadAttribute    payloadAttribute = stream.getAttribute(PayloadAttribute.class);
            stream.reset();
            while(stream.incrementToken()){
                BytesRef bytesRef = termAttribute.getBytesRef();
                int termFrequency = termFreqAttribute.getTermFrequency();
                int positionIncrement = posIncrAttribute.getPositionIncrement();
                int start = offsetAttribute.startOffset();
                int end = offsetAttribute.endOffset();
                //                BytesRef payload = payloadAttribute.getPayload();
                System.out.print("[" + cta + "]");
                System.out.print("[" + termFrequency + "]");
                System.out.print("[" + positionIncrement + "]");
                System.out.print("[" + start + "]");
                System.out.print("[" + end + "]");
                System.out.println();
            }
            stream.end();
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Analyzer aly1 = new StandardAnalyzer();

        String str = "hello kim kim,I am dennisit dennisit,我是 中国人,my email is dennisit@163.com, and my QQ is 1325103287";

        TokenStream.displayToken(str, aly1);
    }
}
