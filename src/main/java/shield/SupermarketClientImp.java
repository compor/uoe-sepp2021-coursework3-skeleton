/**
 *
 */

package shield;

public class SupermarketClientImp implements SupermarketClient {
  public SupermarketClientImp(String endpoint) {
  }

  @Override
  public boolean registerSupermarket(String name, String postCode) {
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
