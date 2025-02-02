package sarf.verb.quadriliteral.modifier;

import sarf.verb.quadriliteral.ConjugationResult;
import java.util.*;
import sarf.*;
import sarf.verb.quadriliteral.substitution.SubstitutionsApplier;

/**
 * <p>Title: Sarf Program</p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: ALEXO</p>
 *
 * @author Haytham Mohtasseb Billah
 * @version 1.0
 */
public class Vocalizer {
    //المعلوم  و  المجهول تحتوي قائمة بالأنواع الخمسة لاعلال لماضي والمضارع والأمر حسب
    private final Map<String, List<SubstitutionsApplier>> modifiersMap = new HashMap<>();

    public Vocalizer() {
        List<SubstitutionsApplier> activePastList = new ArrayList<>();
        List<SubstitutionsApplier> passivePastList = new ArrayList<>();
        List<SubstitutionsApplier> activePresentList = new ArrayList<>();
        List<SubstitutionsApplier> passivePresentList = new ArrayList<>();
        List<SubstitutionsApplier> imperativeList = new ArrayList<>();

        //خمس أنواع  أساسية  للاعلال للمعلوم والمبني لمجهول في الماضي والمضارع والأمر
        modifiersMap.put(SystemConstants.PAST_TENSE + "true", activePastList);
        modifiersMap.put(SystemConstants.PRESENT_TENSE + "true", activePresentList);
        modifiersMap.put(SystemConstants.NOT_EMPHASIZED_IMPERATIVE_TENSE + "true", imperativeList);
        modifiersMap.put(SystemConstants.EMPHASIZED_IMPERATIVE_TENSE + "true", imperativeList);
        modifiersMap.put(SystemConstants.PAST_TENSE + "false", passivePastList);
        modifiersMap.put(SystemConstants.PRESENT_TENSE + "false", passivePresentList);

        //قائمة الماضي المبني لمعلوم
        activePastList.add(new sarf.verb.quadriliteral.modifier.vocalizer.nakes.active.PastVocalizer());

        //قائمة الماضي المبني لمجهول
        passivePastList.add(new sarf.verb.quadriliteral.modifier.vocalizer.nakes.passive.PastVocalizer());

        //قائمة المضارع المبني لمعلوم
        activePresentList.add(new sarf.verb.quadriliteral.modifier.vocalizer.nakes.active.Present1Vocalizer());
        activePresentList.add(new sarf.verb.quadriliteral.modifier.vocalizer.nakes.active.Present2Vocalizer());


        //قائمة المضارع المبني لمجهول
        passivePresentList.add(new sarf.verb.quadriliteral.modifier.vocalizer.nakes.passive.PresentVocalizer());

        //قائمة الأمر
        imperativeList.add(new sarf.verb.quadriliteral.modifier.vocalizer.nakes.active.Imperative1Vocalizer());
        imperativeList.add(new sarf.verb.quadriliteral.modifier.vocalizer.nakes.active.Imperative2Vocalizer());
    }

    /**
     * تطبيق الاعلال حسب الصيغة ماضي أو مضارع أو أمر للمعلوم أو لمجهول
     * قد لا يطبق أي نوع من الاعلال
     * @param tense String
     * @param active boolean
     * @param conjResult ConjugationResult
     */
    public void apply(String tense, boolean active, ConjugationResult conjResult) {
        var modifiers = modifiersMap.get(tense+active);
        for (var substitutionsApplier : modifiers) {
            if (substitutionsApplier.isApplied(conjResult)) {
                substitutionsApplier.apply(conjResult.getFinalResult(), conjResult.getRoot());
                break;
            }
        }
    }
}
