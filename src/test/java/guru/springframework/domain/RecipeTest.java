package guru.springframework.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecipeTest {

    private Recipe recipe;

    @Before
    public void setUp() throws Exception {
        recipe = new Recipe();
    }

    @Test
    public void getId() {
        Long id = 1L;
        recipe.setId(id);
        assertEquals(id, recipe.getId());
    }

    @Test
    public void getDescription() {
        recipe.setDescription("Paneer mutter");
        assertEquals("Paneer mutter", recipe.getDescription());
    }

    @Test
    public void getPrepTime() {
        Integer preTime = 10;
        recipe.setPrepTime(preTime);
        assertEquals(preTime, recipe.getPrepTime());
    }
}