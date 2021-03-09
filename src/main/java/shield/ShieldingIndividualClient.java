/**
 * Interface for a client application for a shielding individual
 *
 * @author
 *
 */

package shield;

import java.util.Collection;
import java.time.LocalDateTime;

public interface ShieldingIndividualClient extends ShieldingIndividualClientEndpoints {
  /**
  * Returns if the individual using the client is registered with the server
  *
  * @return true if the individual using the client is registered with the server
  */
  public boolean isRegistered();

  /**
  * Returns the CHI number of the shiedling individual
  *
  * @return CHI number of the shiedling individual
  */
  public String getCHI();

  /**
  * Returns the number of available food boxes after quering the server
  *
  * @return number of available food boxes after quering the server
  */
  public int getFoodBoxNumber();

  /**
  * Returns the dietary preference that this specific food box satisfies
  *
  * @param  foodBoxId the food box id as last returned from the server
  * @return dietary preference
  */
  public String getDietaryPreferenceForFoodBox(int foodBoxId);

  /**
  * Returns the number of items in this specific food box
  *
  * @param  foodBoxId the food box id as last returned from the server
  * @return number of items in the food box
  */
  public int getItemsNumberForFoodBox(int foodBoxId);

  /**
  * Returns the collection of item ids of the requested foodbox
  *
  * @param  foodBoxId the food box id as last returned from the server
  * @return collection of item ids of the requested foodbox
  */
  public Collection<Integer> getItemIdsForFoodBox(int foodboxId);

  /**
  * Returns the item name of the item in the requested foodbox
  *
  * @param  itemId the food box id as last returned from the server
  * @param  foodBoxId the food box id as last returned from the server
  * @return the requested item name
  */
  public String getItemNameForFoodBox(int itemId, int foodBoxId);

  /**
  * Returns the item quantity of the item in the requested foodbox
  *
  * @param  itemId the food box id as last returned from the server
  * @param  foodBoxId the food box id as last returned from the server
  * @return the requested item quantity
  */
  public int getItemQuantityForFoodBox(int itemId, int foodBoxId);

  /**
  * Returns true if the requested foodbox was picked
  *
  * @param  foodBoxId the food box id as last returned from the server
  * @return true if the requested foodbox was picked
  */
  public boolean pickFoodBox(int foodBoxId);

  /**
  * Returns true if the item quantity for the picked foodbox was changed
  *
  * @param  itemId the food box id as last returned from the server
  * @param  quantity the food box item quantity to be set
  * @return true if the item quantity for the picked foodbox was changed
  */
  public boolean changeItemQuantityForPickedFoodBox(int itemId, int quantity);

  /**
  * Returns the collection of the order numbers placed
  *
  * @return collection of the order numbers placed
  */
  public Collection<Integer> getOrderNumbers();

  /**
  * Returns the status of the order for the requested number
  *
  * @param orderNumber the order number
  * @return status of the order for the requested number
  */
  public String getStatusForOrder(int orderNumber);

  /**
  * Returns the item ids for the items of the requested order
  *
  * @param  orderNumber the order number
  * @return item ids for the items of the requested order
  */
  public Collection<Integer> getItemIdsForOrder(int orderNumber);

  /**
  * Returns the name of the item for the requested order
  *
  * @param  itemId the food box id as last returned from the server
  * @param  orderNumber the order number
  * @return name of the item for the requested order
  */
  public String getItemNameForOrder(int itemId, int orderNumber);

  /**
  * Returns the quantity of the item for the requested order
  *
  * @param  itemId the food box id as last returned from the server
  * @param  orderNumber the order number
  * @return quantity of the item for the requested order
  */
  public int getItemQuantityForOrder(int itemId, int orderNumber);

  /**
  * Returns true if quantity of the item for the requested order was changed
  *
  * @param  itemId the food box id as last returned from the server
  * @param  orderNumber the order number
  * @param  quantity the food box item quantity to be set
  * @return true if quantity of the item for the requested order was changed
  */
  public boolean setItemQuantityForOrder(int itemId, int orderNumber, int quantity);

  /**
  * Returns the date and time of the required delivery time for the requested order
  *
  * @param  orderNumber the order number
  * @return date and time of the required delivery time for the requested order
  */
  public LocalDateTime getDeliveryTimeForOrder(int orderNumber);
}
