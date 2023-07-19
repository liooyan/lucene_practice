package cn.lioyan.analysis;

/**
 * {@link org.apache.lucene.analysis.Analyzer}
 * 分词器，将文本分词，分词器包含一个 {@link org.apache.lucene.analysis.Tokenizer} 和一系列的 {@link org.apache.lucene.analysis.TokenFilter}
 * 通过{@link  org.apache.lucene.analysis.Analyzer#tokenStream} 获取分词结果
 *
 *
 * 内部类：{@link org.apache.lucene.analysis.Analyzer.TokenStreamComponents}  由子类创建
 * 包含： TokenStream 为分词过程中的中间结果，
 *        Consumer<Reader> 包含reader 的创建过程， components.setReader(reader) 会调用这个方法
 *
 * @author com.lioyan
 * @since 2023/7/19  11:35
 */
public class Analyzer
{
}
