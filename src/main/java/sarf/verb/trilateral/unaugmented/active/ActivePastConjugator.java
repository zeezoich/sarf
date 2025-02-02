package sarf.verb.trilateral.unaugmented.active;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import sarf.verb.trilateral.unaugmented.*;
import sarf.*;

/**
 * <p>Title: Sarf</p>
 *
 * <p>Description: تصريف الأفعال في الماضي    </p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: </p>
 *
 * @author Haytham Mohtasseb Billah
 * @version 1.0
 */
public class ActivePastConjugator {
    private ActivePastConjugator() {
    }

    private static final ActivePastConjugator instance = new ActivePastConjugator();

    public static ActivePastConjugator getInstance() {
        return instance;
    }

    /**
    *  إنشاء الفعل حسب الضمير
     * @param pronounIndex int
     * @param root UnaugmentedTrilateralRoot
     * @return PastConjugation
     */
    public ActivePastVerb createVerb(int pronounIndex, UnaugmentedTrilateralRoot root) {
        String dpa2 = PastConjugationDataContainer.getInstance().getDpa2(root);
        String lastDpa = PastConjugationDataContainer.getInstance().getLastDpa(pronounIndex);
        String connectedPronoun = PastConjugationDataContainer.getInstance().getConnectedPronoun(pronounIndex);
        return new ActivePastVerb(root, dpa2, lastDpa, connectedPronoun);
    }

    /**
     *  إنشاء  قائمة تحتوي الأفعال مع الضمائر الثلاثة عشر
     * @param root UnaugmentedTrilateralRoot
     * @return List
     */
    public List<ActivePastVerb> createVerbList(UnaugmentedTrilateralRoot root) {
        return IntStream.range(0, SystemConstants.PRONOUN_RANGE_END)
                .mapToObj(i -> createVerb(i, root))
                .collect(Collectors.toList());
    }
}
