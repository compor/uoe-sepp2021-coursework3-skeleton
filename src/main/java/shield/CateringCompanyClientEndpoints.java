/**
 * Interface for the communication endpoints of an application for a catering
 * company.
 *
 * These endpoints represent the communication endpoints to the server
 *
 * @author
 *
 */

package shield;

public interface CateringCompanyClientEndpoints {
  /**
  * Returns true if the operation occurred correctly
  *
  * @param name name of the business
  * @param postcode post code of the business
  * @return true if the operation occurred correctly
  */
  public boolean registerCateringCompany(String name, String postCode);

  /**
  * Returns true if the operation occurred correctly
  *
  * @param orderNumber the order number
  * @param status status of the order for the requested number
  * @return true if the operation occurred correctly
  */
  public boolean updateOrderStatus(int orderNumber, String status);
}
