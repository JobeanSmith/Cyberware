package com.spring.henallux.cyberware;

import com.spring.henallux.cyberware.dataAccess.dataAccessObject.*;
import com.spring.henallux.cyberware.dataAccess.entity.CategoryEntity;
import com.spring.henallux.cyberware.dataAccess.entity.CategoryTranslationEntity;
import com.spring.henallux.cyberware.dataAccess.entity.LanguageEntity;
import com.spring.henallux.cyberware.dataAccess.repository.CategoryTranslationRepository;
import com.spring.henallux.cyberware.dataAccess.utility.ModelEntityConverter;
import com.spring.henallux.cyberware.model.main.Category;
import com.spring.henallux.cyberware.model.main.CategoryTranslation;
import com.spring.henallux.cyberware.model.main.Language;
import org.junit.Before;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class CyberwareApplicationTests {
	private CategoryTranslationDataAccess categoryTranslationDataAccess;

	@Mock
	private CategoryTranslationRepository categoryTranslationRepository;

	@Before
	public void setUp() throws Exception {
		categoryTranslationDataAccess = new CategoryTranslationDataAccess(categoryTranslationRepository, new ModelEntityConverter());
	}

	@Test
	public void testGetCategoryTranslationNameByCategoryIdentifier() {
		CategoryTranslationEntity categoryTranslationEntity = new CategoryTranslationEntity(12, "Cerveau", new CategoryEntity(1, "brain performance improvement", "brain.png"), new LanguageEntity(2, "French", "french.png"));
		when(categoryTranslationRepository.findByCategoryIdentifierAndLanguageName(1, "French")).thenReturn(categoryTranslationEntity);
		CategoryTranslation categoryTranslation = new CategoryTranslation(12, "Cerveau", new Category(1, "brain performance improvement", "brain.png"), new Language(2, "French", "french.png"));
		assertThat(categoryTranslationDataAccess.getCategoryTranslationByCategoryIdentifier(1, "French")).isEqualTo(categoryTranslation);
	}
}