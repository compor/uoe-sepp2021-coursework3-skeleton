/**
 *
 */

package shield;

public interface SupermarketClient extends SupermarketClientEndpoints {
  public boolean isRegistered();
  public String getName();
  public String getPostCode();
}
