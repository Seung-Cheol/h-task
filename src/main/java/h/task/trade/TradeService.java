package h.task.trade;

import h.task.trade.entity.Trade;
import java.util.List;

public interface TradeService {

  Trade add(Trade trade);

  List<Trade> tradeViewAll();

  public Trade updateTrade(Trade trade);

  public void deleteTrade(long id);
}
