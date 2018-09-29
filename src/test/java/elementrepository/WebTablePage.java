package elementrepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTablePage {
	
	@FindBy(xpath="//button[@ng-dblclick='grid.appScope.start($event)']")
	private List<WebElement> webTableRowDoubleClick;

	@FindBy(xpath="//button[contains(text(),'Cancel')]")
	private List<WebElement> webTableRowEditCancel;
	
	@FindBy(xpath="//button[@class='btn btn-danger btn-xs']")
	private List<WebElement> rightClickDeleteButton;
	
	@FindBy(xpath="//button[contains(text(),'Delete')]")
	private List<WebElement> rightClickDeleteButtonDeleteOption;
	
	@FindBy(xpath="//button[contains(text(),'Cancel')]")
	private List<WebElement> rightClickDeleteButtonCancleOption;
	
	@FindBy(xpath="//button[@title='Page forward']")
	private WebElement pageForwardButton;
	
	@FindBy(xpath="//select[@ng-model='grid.options.paginationPageSize']")
	private WebElement paginationPageSize;

	public List<WebElement> getWebTableRowDoubleClick() {
		return webTableRowDoubleClick;
	}

	public List<WebElement> getWebTableRowEditCancel() {
		return webTableRowEditCancel;
	}

	public List<WebElement> getRightClickDeleteButton() {
		return rightClickDeleteButton;
	}

	public List<WebElement> getRightClickDeleteButtonDeleteOption() {
		return rightClickDeleteButtonDeleteOption;
	}

	public List<WebElement> getRightClickDeleteButtonCancleOption() {
		return rightClickDeleteButtonCancleOption;
	}

	public WebElement getPageForwardButton() {
		return pageForwardButton;
	}

	public WebElement getPaginationPageSize() {
		return paginationPageSize;
	}
}
