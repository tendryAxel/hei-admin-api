package school.hei.haapi.http.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;
import java.util.List;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@ToString
public class OrangeDailyTransactionScrappingDetails {
  @JsonProperty("transactionDate")
  private String transactionDate;

  private Instant timestamp;

  private List<OrangeTransactionScrappingDetails> transactions;
}
