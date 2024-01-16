package rxwriter.drug;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import rxwriter.drug.database.DrugRecord;
import rxwriter.drug.database.DrugSource;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

//
// Implementing the DrugSource interface is a way to mockup the database data to avoid failing texts because the real data changed
// It's weired because, as whe changed the DrugService class to receive an DrugSource, we make this scenario that eu pass the test class as the drugSource
// of the DrugService class.
//
// It's kinda isolation test from scratch, tough
//
// The most common think to do is use so sort of mock library as mockito, to create database mocks to use in our tests.
class DrugServiceTest implements DrugSource {
    private DrugService drugService;

    @Override
    public List<DrugRecord> findDrugsStartingWith(String startingString) {
        List<DrugRecord> records = new ArrayList<>();
        if (startingString.equals("as")) {
            records.add(new DrugRecord("asmanex", new int[]{301}, 0));
            records.add(new DrugRecord("aspirin", new int[]{3645, 3530}, 0));
        } else if (startingString.equals("aspirin")) {
            records.add(new DrugRecord("aspirin", new int[]{3645, 3530}, 0));
        }
        return records;
    }

    @BeforeEach
    public void setup() {
        this.drugService = new DrugService(this);
    }

    @Test
    public void drugsAreReturnedSorted() {
        List<DispensableDrug> foundDrugs = this.drugService.findDrugsStartingWith("as");
        assertNotNull(foundDrugs);
        assertEquals(2, foundDrugs.size());
        assertEquals("asmanex", foundDrugs.get(0).drugName());
        assertEquals("aspirin", foundDrugs.get(1).drugName());
    }

    @Disabled("testing")
    @Test
    public void throwsExceptionOnEmptyStartsWith() {
        Exception thrown = assertThrows(IllegalArgumentException.class, ()-> this.drugService.findDrugsStartingWith("  "));
        System.out.println(thrown.getMessage());
    }

    @Test
    public void setsDrugPropertiesCorrectly() {
        DrugClassification[] expectedClassifications = new DrugClassification[] {
                DrugClassification.ANALGESIC, DrugClassification.PLATELET_AGGREGATION_INHIBITORS
        };

        List<DispensableDrug> foundDrugs = this.drugService.findDrugsStartingWith("aspirin");
        DispensableDrug drug = foundDrugs.get(0);

//        assertEquals("aspirin", drug.drugName());
//        assertFalse(drug.isControlled());
//        assertArrayEquals(expectedClassifications, drug.drugClassifications());

        assertAll("DispensableDrug properties",
                () -> assertEquals("aspirin", drug.drugName()),
                () -> assertFalse(drug.isControlled()),
                () -> assertArrayEquals(expectedClassifications, drug.drugClassifications()));
    }
}