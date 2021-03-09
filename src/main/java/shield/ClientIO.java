/**
 *
 */

package shield;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ClientIO {
  /**
   * Performs a GET HTTP request and returns a String with the remote endpoint's reply
   *
   * @param  endpoint  a HTTP URL giving location of an endpoint
   * @return      the endpoint's response
   * @throws IOException an input/output error occurred
   * @throws RuntimeException a protocol processing error occurred
   * */
  public static String doGETRequest(String endpoint) throws RuntimeException, IOException {
    URL requestUrl = new URL(endpoint);
    HttpURLConnection conn = (HttpURLConnection) requestUrl.openConnection();
    conn.setRequestMethod("GET");
    conn.setRequestProperty("Accept", "application/json");

    int responseCode = conn.getResponseCode();

    if (responseCode != HttpURLConnection.HTTP_OK) {
      throw new RuntimeException("Failed with HTTP code : "
                                 + conn.getResponseCode());
    }

    BufferedReader in = new BufferedReader(
      new InputStreamReader(conn.getInputStream()));
    StringBuffer response = new StringBuffer();
    String output = null;

    while ((output = in.readLine()) != null) {
      response.append(output);
    }

    in.close();
    conn.disconnect();

    return response.toString();
  }

  /**
   * Performs a POST HTTP request and returns a String with the remote endpoint's reply
   *
   * @param  endpoint  a HTTP URL giving location of an endpoint
   * @param  data the data to post to the endpoint as string
   * @return      the endpoint's response
   * @throws IOException an input/output error occurred
   * @throws RuntimeException a protocol processing error occurred
   * */
  public static String doPOSTRequest(String endpoint, String data) throws RuntimeException, IOException {
    URL url = new URL(endpoint);
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setDoOutput(true);
    conn.setRequestMethod("POST");
    conn.setRequestProperty("Content-Type", "application/json");

    OutputStream os = conn.getOutputStream();
    os.write(data.getBytes());
    os.flush();

    if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
      throw new RuntimeException("Failed with HTTP code : "
                                 + conn.getResponseCode());
    }

    BufferedReader in = new BufferedReader(new InputStreamReader(
        (conn.getInputStream())));
    StringBuffer response = new StringBuffer();
    String output = null;

    while ((output = in.readLine()) != null) {
      response.append(output);
    }

    in.close();
    conn.disconnect();

    return response.toString();
  }
}
