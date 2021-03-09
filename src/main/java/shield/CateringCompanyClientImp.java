/**
 *
 */

package shield;

public class CateringCompanyClientImp implements CateringCompanyClient {
  public CateringCompanyClientImp(String endpoint) {
  }

  @Override
  public boolean registerCateringCompany(String name, String postCode) {
    return false;
  }

  @Override
  public boolean updateOrderStatus(int orderNumber, String status) {
    return false;
  }

  @Override
  public boolean isRegistered() {
    return false;
  }

  @Override
  public String getName() {
    return null;
  }

  @Override
  public String getPostCode() {
    return null;
  }
}
