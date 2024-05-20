package h.task.trade;


import h.task.trade.entity.Trade;
import h.task.trade.repository.TradeRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TradeServiceImpl implements TradeService {
  private final TradeRepository tradeRepository;

  public Trade add(Trade trade) {
    return tradeRepository.save(trade);
  }

  public List<Trade> tradeViewAll() {
    return tradeRepository.findAll();
  }

  public Trade updateTrade(Trade trade) {
    return tradeRepository.save(trade);
  }

  public void deleteTrade(long id) {
    tradeRepository.deleteById(id);
  }
}
