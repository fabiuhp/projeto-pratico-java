package com.fabiopereira.admin.catalogo.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    @Test
    public void testeNewCategory() {
        assertNotNull(new Category());
    }

}