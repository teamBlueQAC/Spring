import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qa.ims.App;
import com.qa.ims.controller.SupplierController;
import com.qa.ims.model.SupplierModel;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = App.class)
public class SupplierControllerTest {
	
	@Autowired
	private SupplierController supplierController;
	private SupplierModel supplierModel;
	
	@Before
	public void setUp(){
		supplierModel = new SupplierModel("Test");
	}

	@Test
	public void testPersistSupplier() {
		assertSame(supplierController.persistSupplier(supplierModel), "Added Supplier");
	}

	@Test
	public void testFindSupplierByName() {
		supplierController.persistSupplier(supplierModel);
		assertNotNull(supplierController.findSupplierByName("Test"));
	}

}
