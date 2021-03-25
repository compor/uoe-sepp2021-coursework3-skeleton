/**
 * Interface for a client application for a shielding individual
 *
 * @author
 *
 */

package shield;

import java.util.Collection;

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

  // **UPDATE2** COMMENT ONLY
  /**
  * Returns the number of items in this specific food box.
  *
  * This method returns the number of items in each food box (not the quantity
  * of each item).
  * For example if a box has:
  *  - 3 bananas
  *  - 5 bottles of milk
  * it should return 2.
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

  // **UPDATE2** COMMENT ONLY
  /**
   * Returns true if the requested foodbox was picked.
   *
   *
   * This method marks internally in the client a specific food box (using its Id)
   * that is to be used for placing an order via the placeOrder() method.
   * While this box is marked, but not yet placed, the
   * changeItemQuantityForPickedFoodBox() can be used to change quantities.
   * Once an order is successfully placed via PlaceOrder(), the marked box
   * should be cleared.
   *
   * Please note that there is no way to introspect what the items and their
   * quantities for the picked box. This is OK, since it’s simply a staging
   * area before placeOrder() call.
   *
   * This avoids having to pass some parameter to the placeOrder() that would
   * hint towards a specific implementation, e.g., boolean placeOrder(FoodBox
   * box), where FoodBox is some kind of interface. I’m just mentioning this to
   * make it absolutely clear.
   *
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

  // **UPDATE2** COMMENT ONLY
  /**
  * Returns the collection of the order numbers placed.
  *
  * This method queries the order ids for a placed order as stored locally by
  * the client.
  *
  * @return collection of the order numbers placed
  */
  public Collection<Integer> getOrderNumbers();

  // **UPDATE2** COMMENT ONLY
  /**
  * Returns the status of the order for the requested number.
  *
  * This method queries the status for a placed order as stored locally by
  * the client.
  *
  * @param orderNumber the order number
  * @return status of the order for the requested number
  */
  public String getStatusForOrder(int orderNumber);

  // **UPDATE2** COMMENT ONLY
  /**
  * Returns the item ids for the items of the requested order.
  *
  * This method queries the item ids for a placed order as stored locally by
  * the client.
  *
  * @param  orderNumber the order number
  * @return item ids for the items of the requested order
  */
  public Collection<Integer> getItemIdsForOrder(int orderNumber);

  // **UPDATE2** COMMENT ONLY
  /**
  * Returns the name of the item for the requested order.
  *
  * This method queries the item name for a placed order as stored locally by
  * the client.
  *
  * @param  itemId the food box id as last returned from the server
  * @param  orderNumber the order number
  * @return name of the item for the requested order
  */
  public String getItemNameForOrder(int itemId, int orderNumber);

  // **UPDATE2** COMMENT ONLY
  /**
  * Returns the quantity of the item for the requested order.
  *
  * This method queries the quantities for a placed order as stored locally by
  * the client.
  *
  * @param  itemId the food box id as last returned from the server
  * @param  orderNumber the order number
  * @return quantity of the item for the requested order
  */
  public int getItemQuantityForOrder(int itemId, int orderNumber);

  // **UPDATE2** COMMENT ONLY
  /**
   * Returns true if quantity of the item for the requested order was changed.
   *
   * This method changes the quantities for a placed order as stored locally
   * by the client.
   * In order to sync with the server, one needs to call the editOrder()
   * method separately.
   *
   * @param  itemId the food box id as last returned from the server
   * @param  orderNumber the order number
   * @param  quantity the food box item quantity to be set
   * @return true if quantity of the item for the requested order was changed
   */
  public boolean setItemQuantityForOrder(int itemId, int orderNumber, int quantity);

  // **UPDATE2** REMOVED METHOD getDeliveryTimeForOrder()

  // **UPDATE**
  /**
  * Returns closest catering company serving orders based on our location
  *
  * @return business name of catering company
  */
  public String getClosestCateringCompany();
}
