package keywords;

import org.testng.Assert;

public class ValidationKeyWords  extends GenericKeyWords
{

	public void validateTitle(String expTitle)
	{
      Assert.assertEquals(driver.getTitle(),expTitle);
	}
}
