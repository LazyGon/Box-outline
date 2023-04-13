/** このプラグインのAPIクラス */
// // public final class BoxAPI

// 変数
/** 全般設定 */
private final Config config;
/** メッセージ設定 */
private final Messages messages;
/** GUIのレイアウト設定 */
private final Layouts layout;
/** アイテム価格設定 */
private final Prices prices;
/** アイテムのカテゴリ設定 */
private final Categories categories;
/** アイテムのレシピ設定 */
private final CraftRecipes craftRecipes;
/** プレイヤーデータに関するデータベースアクセサ */
private final PlayerData playerData;
/** アイテム自体に関するデータベースアクセサ */
private final ItemData itemData;

// メソッド Getterは説明省略
/** 各変数の初期化、reloadAllConfig()を呼んで設定を読み込み */
BoxAPI();
public Config getConfig();
public Messages getMessages();
public Layouts getLayouts();
public Prices getPrices();
public Categories getCategories();
public CraftRecipes getCraftRecipes();
public PlayerData getPlayerData();
public ItemData getItemData();
/** 各変数の再読み込み */
public void reloadAllConfigs();
