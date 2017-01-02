package com.bdgolka.Test;

import com.bdgolka.ProductCatalogue;
import org.junit.Test;

import static com.bdgolka.ProductFixtures.*;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

public class ProductCatalogueTest {

    @Test
    public void shouldOnlyHoldUniqueProduct() throws Exception{

        ProductCatalogue catalogue = new ProductCatalogue();

        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);

        assertThat(catalogue, containsInAnyOrder(door, floorPanel));
    }

}