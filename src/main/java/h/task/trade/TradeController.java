package h.task.trade;


import h.task.trade.dto.TradeDeleteResponseDto;
import h.task.trade.entity.Trade;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("post")
@RequiredArgsConstructor
public class TradeController {

  private final TradeService tradeService;

  @PostMapping("")
  public ResponseEntity<Trade> add(@RequestBody Trade trade) {
    return ResponseEntity.status(201).body(tradeService.add(trade));
  }

  @GetMapping("")
  public ResponseEntity<List<Trade>> tradeViewAll() {
    return ResponseEntity.status(200).body(tradeService.tradeViewAll());
  }

  @PutMapping("/{id}")
  public ResponseEntity<Trade> updateTrade(@PathVariable long id, @RequestBody Trade trade) {
    trade.setId(id);
    return ResponseEntity.status(200).body(tradeService.updateTrade(trade));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<TradeDeleteResponseDto> deleteTrade(@PathVariable long id) {
    return ResponseEntity.status(200)
      .body(TradeDeleteResponseDto.builder().id(id).msg("삭제완료").build());
  }
}
