package org.ansj.demo;

import org.ansj.domain.Term;
import org.ansj.recognition.NatureRecognition;
import org.ansj.splitWord.analysis.ToAnalysis;

import java.io.IOException;
import java.util.List;

/**
 * 词性标注
 * 
 * @author ansj
 * 
 */
public class NatureDemo {
	public static void main(String[] args) throws IOException {
		List<Term> terms = ToAnalysis.parse("中国人民族");//，深圳鹏元征信有限公司，鎗愓禩公司
		new NatureRecognition(terms).recognition(); //词性标注
		System.out.println(terms);

		/*List<Term> terms = ToAnalysis.parse("深圳鹏元征信有限公司,Ansj中文分词是一个真正的ict的实现.并且加入了自己的一些数据结构和算法的分词.实现了高效率和高准确率的完美结合!北京新世纪认证有限公司\n" +
				"南通华钰电力配套机械制造有限公司\n" +
				"宜昌市奔朗贸易有限责任公司\n" +
				"寿光市临峰能源有限责任公司\n" +
				"新疆天拓工贸有限公司\n" +
				"成都星瑞农业有限公司\n" +
				"嵩县华伊印刷有限公司\n" +
				"清河县奥尼特羊绒纺织有限公司\n" +
				"常州市创达热固塑料有限公司" +
				"北京东城区天安门\n，" +
				"北京西城区九江胡同懂呢花园333号\n，" +
				"深圳车公庙东乐花园乐群路朝阳楼322号\n");
		new NatureRecognition(terms).recognition(); //词性标注
		System.out.println(terms);*/
	}
}
