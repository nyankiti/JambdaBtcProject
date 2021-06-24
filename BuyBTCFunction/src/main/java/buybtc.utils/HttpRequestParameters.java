/*
package -- javaのclassをまとめて分類するための仕組み
同一のpackage内ならクラス名のみでアクセス可能
package外からはimport分をかいて対象のクラスを明示する必要がある
*/

package buybtc.utils;

import java.util.Map;

public class HttpRequestParameters {
  private String method;
  private String URL;
  private Map<String, String> header;
  private Map<String, String> queryParams;

  public HttpRequestParameters(String method, String URL, Map<String, String> header, Map<String, String> queryParams) {
    this.setMethod(method);
    this.URL = URL;
    this.header = header;
    this.queryParams = queryParams;
  }

  // public 返り値の型 関数名(引数の型 引数){ -- }

  public void setMethod(String method){
    this.method = method;
  }

  public String getMethod(){
    return this.method;
  }

  public Map<String, String> getHeader(){
    return this.header;
  }

  public void setHeader(Map<String, String> header) {
    this.header = header;
  }

  public Map<String, String> getQueryParams() {
    return this.queryParams;
  }

  public void setQueryParams(Map<String, String> queryParams) {
    this.queryParams = queryParams;
  }

}