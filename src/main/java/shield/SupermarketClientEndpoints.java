/**
 * Interface for the communication endpoints of an application for a
 * supermarket.
 *
 * These endpoints represent the communication endpoints to the server
 *
 * @author
 *
 */

package shield;

public interface SupermarketClientEndpoints {
  /**
  * Returns true if the operation occurred correctly
  *
  * @param name name of the business
  * @param postcode post code of the business
  * @return true if the operation occurred correctly
  */
  public boolean registerSupermarket(String name, String postCode);

  // **UPDATE2** ADDED METHOD
  /**
  * Returns true if the operation occurred correctly.
  *
  * Note that there is a dedicated server endpoint for implementing this called
  * recordSupermarketOrder
  *
  * @param CHI CHI number of the shiedling individual associated with this order
  * @param orderNumber the order number
  * @return true if the operation occurred correctly
  */
  public boolean recordSupermarketOrder(String CHI, int orderNumber);

  // **UPDATE2** COMMENT ONLY
  // **UPDATE**
  /**
  * Returns true if the operation occurred correctly.
  *
  * Note that there is a dedicated server endpoint for implementing this called
  * updateSupermarketOrderStatus
  *
  * @param orderNumber the order number
  * @param status status of the order for the requested number
  * @return true if the operation occurred correctly
  */
  public boolean updateOrderStatus(int orderNumber, String status);
}
