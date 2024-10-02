package guru.springframework.services;

import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class RecipeServiceImplTest {

    RecipeService recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository);
    }

    @Test
    public void getRecipes() {
        Recipe recipe = new Recipe();
        HashSet hashSet = new HashSet();
        hashSet.add(recipe);

        Mockito.when(recipeRepository.findAll()).thenReturn(hashSet);

        Set<Recipe> recipes = recipeService.getRecipes();

        assertNotNull(recipes);
        assertEquals(recipes.size(), 1);
        Mockito.verify(recipeRepository, Mockito.times(1)).findAll();
    }
}