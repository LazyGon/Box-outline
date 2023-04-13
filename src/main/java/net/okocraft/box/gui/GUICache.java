/**
 * いちいち初期化する処理が重いGUIをキャッシュするクラス。リロードのたびにキャッシュは削除される。
 */
// public final class GUICache;

private final static Map<Player, GUICache> cache;

private final Player owner;

private final Map<String, StrageGUI> categoryStrageGUIMap;
private final Map<String, ShopGUI> categoryShopGUIMap;
private final Map<String, CraftGUI> categoryCraftGUIMap;

/** this.owner = playerするのみ */
private GUICache(Player player);

/**
 * プレイヤーのGUIキャッシュを取得する。
 * キャッシュにはプレイヤーが開いたGUIのインスタンスが保存されている。
 */
public static GUICache getCache(Player player);
/**
 * プレイヤーのキャッシュを削除する。
 */
public static void removeCache(Player player);
/**
 * ストレージGUIのキャッシュを取得する。
 * 
 * @param categoryName キャッシュを取得するGUIのカテゴリ
 * @param quantity 取得したGUIに適応するquantity
 * @param page 取得したGUIが開いているべきページ
 * @return GUIのインスタンス
 */
StrageGUI getStrageGUICache(String categoryName, int quantity, int page);
/**
 * ショップGUIのキャッシュを取得する。
 * 
 * @param categoryName キャッシュを取得するGUIのカテゴリ
 * @param quantity 取得したGUIに適応するquantity
 * @param page 取得したGUIが開いているべきページ
 * @return GUIのインスタンス
 */
ShopGUI getShopGUICache(String categoryName, int quantity, int page);
/**
 * クラフトGUIのキャッシュを取得する。
 * 
 * @param categoryName キャッシュを取得するGUIのカテゴリ
 * @param quantity 取得したGUIに適応するquantity
 * @param page 取得したGUIが開いているべきページ
 * @return GUIのインスタンス
 */
CraftGUI getCraftGUICache(String categoryName, int quantity, int page);
