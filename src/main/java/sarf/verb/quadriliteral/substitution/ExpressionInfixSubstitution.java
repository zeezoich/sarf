package sarf.verb.quadriliteral.substitution;

import sarf.verb.quadriliteral.QuadrilateralRoot;

/**
 * <p>Title: Sarf Program</p>
 *
 * <p>Description: فحص اذا كانت الكلمة تتضمن المقطع المخزن      </p>
 * بعد تعويض كل حرف من الجذر في المقطع
 * </p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: ALEXO</p>
 *
 * @author Haytham Mohtasseb Billah
 * @version 1.0
 */
public class ExpressionInfixSubstitution extends Substitution {

    public ExpressionInfixSubstitution(String segment, String result) {
        super(segment, result);
    }

    /**
     *
     * @param word String
     * @return String
     */
    public String apply(String word, QuadrilateralRoot root) {
        String wordSegment = segment.replaceAll("C1",root.getC1()+"");
        wordSegment = wordSegment.replaceAll("C2",root.getC2()+"");
        wordSegment = wordSegment.replaceAll("C3",root.getC3()+"");
        wordSegment = wordSegment.replaceAll("C4",root.getC4()+"");
        if (!word.contains(wordSegment)) return null;

        String replacedResult = result.replaceAll("C1",root.getC1()+"");
        replacedResult = replacedResult.replaceAll("C2",root.getC2()+"");
        replacedResult = replacedResult.replaceAll("C3",root.getC3()+"");
        replacedResult = replacedResult.replaceAll("C4",root.getC4()+"");

        return word.replaceAll(wordSegment,replacedResult);
    }
}
