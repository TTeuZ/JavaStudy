package rxwriter.drug;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;
import rxwriter.drug.database.DrugRecord;
import rxwriter.drug.database.DrugSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("DrugService should")
class DrugServiceTest2 {
    @Test
    @Tag("Database")
    @DisplayName("return drugs from the database sorted by name")
    public void drugsAreReturnedSorted() {
        List<DrugRecord> drugsFound = new ArrayList<>();
        drugsFound.add(new DrugRecord("asmanex", new int[]{301}, 0));
        drugsFound.add(new DrugRecord("aspirin", new int[]{3645, 3530}, 0));
        DrugSource mockDrugSource = Mockito.mock(DrugSource.class);
        Mockito.when(mockDrugSource.findDrugsStartingWith("as")).thenReturn(drugsFound);

        DrugService service = new DrugService(mockDrugSource);

        List<DispensableDrug> foundDrugs = service.findDrugsStartingWith("as");
        assertNotNull(foundDrugs);
        assertEquals(2, foundDrugs.size(), "two drugs starting with 'as' should be returned from test data");
        assertEquals("asmanex", foundDrugs.get(0).drugName());
        assertEquals("aspirin", foundDrugs.get(1).drugName());
    }

    @Nested
    @DisplayName("thrown an illegal argument exception")
    class ThrowsExcepetionTests {
        @Test
        @Tag("Database")
        @DisplayName(" when passed a blank string")
        public void throwsExceptionOnBlankStartsWith() {
            List<DrugRecord> drugsFound = new ArrayList<>();
            DrugSource mockDrugSource = Mockito.mock(DrugSource.class);

            DrugService service = new DrugService(mockDrugSource);

            Exception thrown = assertThrows(IllegalArgumentException.class, ()-> service.findDrugsStartingWith("  "));
            System.out.println(thrown.getMessage());
        }

        @Test
        @Tag("Database")
        @DisplayName(" when passed a empty string")
        public void throwsExceptionOnEmptyStartsWith() {
            List<DrugRecord> drugsFound = new ArrayList<>();
            DrugSource mockDrugSource = Mockito.mock(DrugSource.class);

            DrugService service = new DrugService(mockDrugSource);

            Exception thrown = assertThrows(IllegalArgumentException.class, ()-> service.findDrugsStartingWith(""));
            System.out.println(thrown.getMessage());
        }
    }

    @Test
    @Tag("Database")
    @DisplayName("return dispensable drugs with all properties set correctly from database")
    public void setsDrugPropertiesCorrectly() {
        List<DrugRecord> drugsFound = new ArrayList<>();
        drugsFound.add(new DrugRecord("aspirin", new int[]{3645, 3530}, 0));
        DrugSource mockDrugSource = Mockito.mock(DrugSource.class);
        Mockito.when(mockDrugSource.findDrugsStartingWith("aspirin")).thenReturn(drugsFound);

        DrugService service = new DrugService(mockDrugSource);
        DrugClassification[] expectedClassifications = new DrugClassification[] {
                DrugClassification.ANALGESIC, DrugClassification.PLATELET_AGGREGATION_INHIBITORS
        };

        List<DispensableDrug> foundDrugs = service.findDrugsStartingWith("aspirin");
        DispensableDrug drug = foundDrugs.get(0);

        assertAll("DispensableDrug properties",
                () -> assertEquals("aspirin", drug.drugName()),
                () -> assertFalse(drug.isControlled()),
                () -> assertArrayEquals(expectedClassifications, drug.drugClassifications()));
    }
}