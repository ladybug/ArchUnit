package com.tngtech.archunit.lang.syntax.elements;

import com.tngtech.archunit.core.JavaClass;
import com.tngtech.archunit.lang.ArchCondition;
import com.tngtech.archunit.lang.ArchRule;

public interface ClassesShouldConjunction extends ArchRule {
    ClassesShouldConjunction orShould(ArchCondition<? super JavaClass> condition);
}
