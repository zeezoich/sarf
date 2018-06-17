package sarf.verb.trilateral.augmented;

import java.util.*;
import sarf.*;
import sarf.verb.trilateral.*;

/**
 * <p>
 * Title: Sarf
 * </p>
 * <p>
 * Description: جذر الفعل الثلاثي المزيد
 * </p>
 * <p>
 * Copyright: Copyright (c) 2006
 * </p>
 * <p>
 * Company:
 * </p>
 * 
 * @author Haytham Mohtasseb Billah
 * @version 1.0
 */
public class AugmentedTrilateralRoot implements TrilateralRoot {
	private char c1;
	private char c2;
	private char c3;

	// قائمة صيغ المزيد الممكنة لهذا الجذر
	private Map<String, AugmentationFormula> augmentations = new HashMap<>();

	public AugmentedTrilateralRoot() {
	}
	
	public AugmentedTrilateralRoot(char c1, char c2, char c3, AugmentationFormula formula) {
		this.setC1(c1);
		this.setC2(c2);
		this.setC3(c3);
	}

	public void addAugmentationFormula(AugmentationFormula formula) {
		augmentations.put(formula.getFormulaNo() + "", formula);
	}

	public char getC1() {
		return c1;
	}

	public char getC2() {
		return c2;
	}

	public char getC3() {
		return c3;
	}

	public Collection<AugmentationFormula> getAugmentationList() {
		return augmentations.values();
	}

	public AugmentationFormula getAugmentationFormula(int formulaNo) {
		return (AugmentationFormula) augmentations.get(formulaNo + "");
	}

	public void setC3(char c3) {
		this.c3 = c3;
	}

	public void setC2(char c2) {
		this.c2 = c2;
	}

	public void setC1(char c1) {
		this.c1 = c1;
	}
}
