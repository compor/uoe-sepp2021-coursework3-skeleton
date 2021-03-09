/**
 * Interface for the communication endpoints of an application for a shielding
 * individual.
 *
 * These endpoints represent the communication endpoints to the server
 *
 * @author
 *
 */

package shield;

import java.util.Collection;
import java.time.LocalDateTime;

public interface ShieldingIndividualClientEndpoints {
  /**
  * Returns true if the operation occurred correctly
  *
  * @param CHI CHI number of the shiedling individual
  * @return true if the operation occurred correctly
  */
  public boolean registerShieldingIndividual(String CHI);

  /**
  * Returns true if the operation occurred correctly
  *
  * @param dietary preference
  * @return true if the individual using the client is registered with the server
  */
  public Collection<String> showFoodBoxes(String dietaryPreference);

  /**
  * Returns true if the operation occurred correctly
  *
  * @param deliveryDateTime the requested delivery date and time
  * @return true if the operation occurred correctly
  */
  public boolean placeOrder(LocalDateTime deliveryDateTime);

  /**
  * Returns true if the operation occurred correctly
  *
  * @param orderNumber the order number
  * @return true if the operation occurred correctly
  */
  public boolean editOrder(int orderNumber);

  /**
  * Returns true if the operation occurred correctly
  *
  * @param orderNumber the order number
  * @return true if the operation occurred correctly
  */
  public boolean cancelOrder(int orderNumber);

  /**
  * Returns true if the operation occurred correctly
  *
  * @param orderNumber the order number
  * @return true if the operation occurred correctly
  */
  public boolean requestOrderStatus(int orderNumber);
}
