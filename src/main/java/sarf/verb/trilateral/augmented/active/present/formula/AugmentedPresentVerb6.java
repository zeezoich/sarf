package sarf.verb.trilateral.augmented.active.present.formula;

import sarf.util.ArabCharUtil;
import sarf.verb.trilateral.augmented.*;

/**
 * <p>Title: Sarf</p>
 *
 * <p>Description: برنامج التصريف</p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: </p>
 *
 * @author Haytham Mohtasseb Billah
 * @version 1.0
 */
public class AugmentedPresentVerb6 extends AugmentedPresentVerb {
    public AugmentedPresentVerb6(AugmentedTrilateralRoot root, String cp, String lastDpr, String connectedPronoun) {
        super(root, cp, lastDpr, connectedPronoun);
    }

    /**
     * form
     *
     * @return String
     * @todo Implement this sarf.trilingual.augmented.present.AugmentedPresentVerb
     *   method
     */
    public String form() {
        return cp+ArabCharUtil.FATHA+root.getC1()+ArabCharUtil.SKOON+root.getC2()+ArabCharUtil.FATHA+root.getC3()+ArabCharUtil.KASRA+root.getC3()+lastDpr+connectedPronoun;
    }
}
