/**
 * 販売価格と買取価格の設定を取得できる。
 */
// public final class Prices extends CustomConfig;

// メソッド
/** super("price.yml")で、価格設定を生成する */
public Prices();
/**
 * 渡したアイテムの買取価格を取得する。prices.ymlに記載されていないときは0を返す。
 * 
 * @param item アイテム
 * @return 買取価格。または0
 */
public double getSellPrice(ItemStack item);
/**
 * 渡したアイテムの販売価格を取得する。prices.ymlに記載されていないときは0を返す。
 * 
 * @param item アイテム
 * @return 販売価格。または0
 */
public double getBuyPrice(ItemStack item);

