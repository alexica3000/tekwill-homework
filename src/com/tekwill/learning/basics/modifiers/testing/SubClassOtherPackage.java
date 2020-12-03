package com.tekwill.learning.basics.modifiers.testing;

import com.tekwill.learning.basics.modifiers.software.BaseClass;

public class SubClassOtherPackage extends OtherClassOtherPackage{
    public void testSubClass() {
        BaseClass a = new BaseClass();
        a.testBaseClass();
        otherClassTestMethod();
    }
}
