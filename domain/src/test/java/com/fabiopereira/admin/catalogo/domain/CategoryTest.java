package com.fabiopereira.admin.catalogo.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CategoryTest {
    @Test
    public void testeNewCategory() {
        Assertions.assertNotNull(new Category());
    }
}