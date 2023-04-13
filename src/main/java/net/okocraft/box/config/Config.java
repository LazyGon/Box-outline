/** データベース設定や、全体的に作用する設定を取得できる */
// public final class Config extends CustomConfig;

// 変数
/** 再生する音量において、ランダムな値を取得するためのクラス */
private final Random random;

// メソッド
/** super("config.yml")して設定を生成する */
public Config();
/** MySQLを使うかどうかを取得する */
public boolean usingMySQL();
/** MySQLを使う場合のホストを取得する */
public String getMySQLHost();
/** MySQLを使う場合のポートを取得する */
public int getMySQLPort();
/** MySQLを使う場合のユーザーネームを取得する */
public String getMySQLUser();
/** MySQLを使う場合のパスワードを取得する */
public String getMySQLPass();
/** MySQLを使う場合のデータベース名を取得する */
public String getMySQLDatabaseName();
/** Boxプラグインが無効化されているワールドのリストを取得する */
public List<String> getDisabledWorlds();
/**
 * 自動で苗の植え替えを行うワールドのリストを取得する。
 * ここで指定されたワールドでは、麦やジャガイモなどを収穫すると、Boxから自動的に種を消費するようになる。
 */
public List<String> getAutoReplantWorlds();
/** GUIで行う引き出し・預け入れ・購入・売却・クラフトにおける、一度の取引数の最大値を取得する */
public int getMaxQuantity();
/** サーバー全体でautostoreが有効化されているかどうかを取得する */
public boolean isAutoStoreEnabled();
/** GUIが開かれたとき、カテゴリが選択されたときの音をplayerに再生する */
public void playGUIOpenSound(Player player);
/** GUIでアイテムを預けた時の音をplayerに再生する */
public void playDepositSound(Player player);
/** GUIでアイテムを引き出したときの音をplayerに再生する */
public void playWithdrawSound(Player player);
/** GUIでアイテムを購入したときの音をplayerに再生する */
public void playBuySound(Player player);
/** GUIでアイテムを売却したときの音をplayerに再生する */
public void playSellSound(Player player);
/** GUIでアイテムをクラフトしたときの音をplayerに再生する */
public void playCraftSound(Player player);
/** GUIでアイテムを引き出そうとしたものの、ストックが足りずに引き出せなかったときの音をplayerに再生する */
public void playNotEnoughSound(Player player);
/** GUIで取引単位を減らしたときの音をplayerに再生する */
public void playDecreaseUnitSound(Player player);
/** GUIで取引単位を増やしたときの音をplayerに再生する */
public void playIncreaseUnitSound(Player player);
/** GUIでページを変更したときの音をplayerに再生する */
public void playChangePageSound(Player player);
/** GUIで前のメニューに戻ったときの音をplayerに再生する */
public void playBackMenuSound(Player player);
/** 設定で指定された範囲のピッチや音量の値をランダムに生成する */
private float getRandomValue(String key, boolean isPitch);
/** Box stickとなるアイテムスタックを取得する */
public ItemStack getStick();
/** この設定を再読込する。その際、現在GUIを開いているプレイヤー全員のGUIを閉じさせる */
public void reload();

