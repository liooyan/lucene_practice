package cn.lioyan.analysis.standard;

import org.apache.lucene.analysis.Analyzer;


/**
 * {@link org.apache.lucene.analysis.standard.StandardAnalyzer}
 * 标准的分词器
 *
 *  实现 {@link Analyzer.TokenStreamComponents} 的创建
 *   protected TokenStreamComponents createComponents(final String fieldName) {
 *     final StandardTokenizer src = new StandardTokenizer();
 *     src.setMaxTokenLength(maxTokenLength);
 *     TokenStream tok = new LowerCaseFilter(src);
 *     tok = new StopFilter(tok, stopwords);
 *     return new TokenStreamComponents(r -> {
 *       src.setMaxTokenLength(StandardAnalyzer.this.maxTokenLength);
 *       src.setReader(r);
 *     }, tok);
 *   }
 * @author com.lioyan
 * @since 2023/7/19  11:40
 */
public class StandardAnalyzer
{
}
