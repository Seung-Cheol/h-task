package h.task.trade.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TradeDeleteResponseDto {
  private long id;
  private String msg;

}
