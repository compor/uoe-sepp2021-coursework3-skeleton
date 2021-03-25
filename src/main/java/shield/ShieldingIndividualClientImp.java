/**
 * To implement
 */

package shield;

import java.util.Collection;

public class ShieldingIndividualClientImp implements ShieldingIndividualClient {
  public ShieldingIndividualClientImp(String endpoint) {
  }

  @Override
  public boolean registerShieldingIndividual(String CHI) {
    return false;
  }

  @Override
  public Collection<String> showFoodBoxes(String dietaryPreference) {
    return null;
  }

  // **UPDATE2** REMOVED PARAMETER
  @Override
  public boolean placeOrder() {
    return false;
  }

  @Override
  public boolean editOrder(int orderNumber) {
    return false;
  }

  @Override
  public boolean cancelOrder(int orderNumber) {
    return false;
  }

  @Override
  public boolean requestOrderStatus(int orderNumber) {
    return false;
  }

  // **UPDATE**
  @Override
  public Collection<String> getCateringCompanies() {
    return null;
  }

  // **UPDATE**
  @Override
  public float getDistance(String postCode1, String postCode2) {
    return 0;
  }

  @Override
  public boolean isRegistered() {
    return false;
  }

  @Override
  public String getCHI() {
    return null;
  }

  @Override
  public int getFoodBoxNumber() {
    return 0;
  }

  @Override
  public String getDietaryPreferenceForFoodBox(int foodBoxId) {
    return null;
  }

  @Override
  public int getItemsNumberForFoodBox(int foodBoxId) {
    return 0;
  }

  @Override
  public Collection<Integer> getItemIdsForFoodBox(int foodboxId) {
    return null;
  }

  @Override
  public String getItemNameForFoodBox(int itemId, int foodBoxId) {
    return null;
  }

  @Override
  public int getItemQuantityForFoodBox(int itemId, int foodBoxId) {
    return 0;
  }

  @Override
  public boolean pickFoodBox(int foodBoxId) {
    return false;
  }

  @Override
  public boolean changeItemQuantityForPickedFoodBox(int itemId, int quantity) {
    return false;
  }

  @Override
  public Collection<Integer> getOrderNumbers() {
    return null;
  }

  @Override
  public String getStatusForOrder(int orderNumber) {
    return null;
  }

  @Override
  public Collection<Integer> getItemIdsForOrder(int orderNumber) {
    return null;
  }

  @Override
  public String getItemNameForOrder(int itemId, int orderNumber) {
    return null;
  }

  @Override
  public int getItemQuantityForOrder(int itemId, int orderNumber) {
    return 0;
  }

  @Override
  public boolean setItemQuantityForOrder(int itemId, int orderNumber, int quantity) {
    return false;
  }

  // **UPDATE2** REMOVED METHOD getDeliveryTimeForOrder

  // **UPDATE**
  @Override
  public String getClosestCateringCompany() {
    return null;
  }
}
