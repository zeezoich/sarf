package sarf.verb.trilateral.Substitution;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import sarf.verb.trilateral.unaugmented.UnaugmentedTrilateralRoot;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionSuffixSubstitutionTest {

    @Test
    void nullWord_apply_returnsNull() {
        var sut = new ExpressionSuffixSubstitution("C1", "C1C1");

        var actual = sut.apply(null, new UnaugmentedTrilateralRoot());

        assertNull(actual);
    }

    @Test
    void emptyWord_apply_returnsNull() {
        var sut = new ExpressionSuffixSubstitution("C1", "C1C1");

        var actual = sut.apply("", new UnaugmentedTrilateralRoot());

        assertNull(actual);
    }

    @Test
    void applyTest() {
        var sut = new ExpressionSuffixSubstitution("C3", "C3C3");

        var root = new UnaugmentedTrilateralRoot();
        root.setC1('ف');
        root.setC2('ع');
        root.setC3('ل');

        var actual = sut.apply("تفعل", root);

        assertEquals("تفعلل", actual);
    }
}