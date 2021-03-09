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
}
