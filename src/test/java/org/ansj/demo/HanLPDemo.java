package org.ansj.demo;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.Segment;
import com.hankcs.hanlp.seg.common.Term;
import com.hankcs.hanlp.tokenizer.NLPTokenizer;

import java.util.List;

/**
 * Created by xuming on 2016/6/15.
 */
public class HanLPDemo {
    public static void main(String[] args) {
        List<Term> termList = NLPTokenizer.segment("中国科学院计算技术研究所的宗成庆教授正在教授自然语言处理课程,南通华钰电力配套机械制造有限公司,宜昌市奔朗贸易有限责任公司,寿光市临峰能源有限责任公司,好想去新疆天拓工贸有限公司工作");
        System.out.println("HanNLP NLPTokenizer:" + termList);

        String[] testCase = new String[]{
                "武胜县新学乡政府大楼门前锣鼓喧天",
                "蓝翔给宁夏固原市彭阳县红河镇黑牛沟村捐赠了挖掘机,南通华钰电力配套机械制造有限公司,宜昌市奔朗贸易有限责任公司,寿光市临峰能源有限责任公司,好想去新疆天拓工贸有限公司工作",
        };
        Segment segment = HanLP.newSegment().enablePlaceRecognize(true);
        for (String sentence : testCase) {
            List<Term> termList1 = segment.seg(sentence);
            System.out.println("HanNLP address seg:" + termList1);
        }

        String[] testCase1 = new String[]{
                "我在上海林原科技有限公司兼职工作，",
                "我经常在台川喜宴餐厅吃饭，",
                "偶尔去地中海影城看电影。,南通华钰电力配套机械制造有限公司,宜昌市奔朗贸易有限责任公司,寿光市临峰能源有限责任公司,好想去新疆天拓工贸有限公司工作",
        };
        Segment segment2 = HanLP.newSegment().enableOrganizationRecognize(true);
        for (String sentence : testCase1) {
            List<Term> termList2 = segment2.seg(sentence);
            System.out.println("HanNLP organization seg:" + termList2);
        }
    }

}
