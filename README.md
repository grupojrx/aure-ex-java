# com.aure-ex:aureex

SDK oficial da API AureEX para Java.

## Instalação

```xml
<dependency>
  <groupId>com.aure-ex</groupId>
  <artifactId>aureex</artifactId>
  <version>0.1.0</version>
</dependency>
```

## Uso

```java
import com.aureex.AureEx;
import java.util.Map;

AureEx aureEx = new AureEx("YOUR_API_KEY", "YOUR_API_SECRET");

aureEx.deposits.create(Map.of(
  "method", "usdt",
  "reference", "order-1",
  "amount", 10000
));
aureEx.webhooks.list();
aureEx.company.balance();
aureEx.conversions.quote(Map.of("from", "USDT", "to", "BRL", "amount", 100));
```

## Mapa de métodos

| SDK | HTTP |
| --- | --- |
| `aureEx.deposits` | `/v1/deposits` |
| `aureEx.withdrawals` | `/v1/withdrawals` |
| `aureEx.webhooks` | `/v1/webhooks` |
| `aureEx.company.get` / `balance` | `/v1/company`, `/v1/company/balance` |
| `aureEx.conversions` / `quote` | `/v1/conversions`, `/v1/conversions/quote` |

Docs: https://api.aure-ex.com/docs/sdks  
OpenAPI: https://api.aure-ex.com/openapi.yaml
