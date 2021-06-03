package ro.ase.cts.teste;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import ro.ase.cts.teste.categorii.GetPromovabilitateCategory;
import ro.ase.cts.teste.categorii.TesteUrgenteCategory;

@RunWith(Categories.class)
@Suite.SuiteClasses({TesteGrupa.class,
	TesteGrupaMock.class,
	TesteGrupaFicture.class})
@Categories.IncludeCategory(GetPromovabilitateCategory.class)
@Categories.ExcludeCategory(TesteUrgenteCategory.class)
//include si exclude pot lua si mai multe categorii prin {}
public class CustomSuite {

}
