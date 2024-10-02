package guru.springframework.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class CategoryTest {
    Category category;

    @Before
    public void setUp(){
        category = new Category();
    }

    @Test
    public void getId() {
        Long id = 4L;
        category.setId(id);

        assertEquals(id, category.getId());
    }

    @Test
    public void getDescription() {
        String description = "description";
        category.setDescription(description);
        assertEquals(description, category.getDescription());
    }

    @Test
    public void getDescription2() {
        String description = "description2";
        category.setDescription(description);
        assertEquals(description, category.getDescription());
    }

    @Test
    public void getRecipes() {
    }
}