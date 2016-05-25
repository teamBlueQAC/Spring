import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.qa.ims.controller.StockController;
import com.qa.ims.controller.service.StockService;
import com.qa.ims.model.repository.Stock;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class StockControllerTest {
	
	
	@Mock
	private StockService stockService; 
	
	@InjectMocks
	private StockController stockController;
	
	@Before
	public void initMocks(){
		MockitoAnnotations.initMocks(this);
	}
	
	private ArrayList<Stock> tempStocks(){
		ArrayList<Stock> stocks = new ArrayList<Stock>();
		stocks.add(new Stock());
		return stocks;
	}

	@Test
	public void testGetStock() {
		stockController.setStocks(tempStocks());
		assertNotNull(stockController.getStocks());
		assertTrue(stockController.getStocks() instanceof ArrayList);
	}
	
	@Test
	public void testSetStock() {
		ArrayList<Stock> stocks = tempStocks();
		assertNotSame(stockController.getStocks(), stocks);
		stockController.setStocks(stocks);
		assertEquals(stockController.getStocks(), stocks);
	}
	
	@Test
	public void testFilterStocks() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSearchStocks() {
		Mockito.when(stockService.search("term")).thenReturn(tempStocks());
		stockController.searchStocks("term");
		assertEquals(stockController.getStocks(), tempStocks());
	}

}
