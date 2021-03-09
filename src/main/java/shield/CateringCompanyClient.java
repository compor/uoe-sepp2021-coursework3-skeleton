/**
 *
 */

package shield;

public interface CateringCompanyClient extends CateringCompanyClientEndpoints {
  public boolean isRegistered();
  public String getName();
  public String getPostCode();
}
