/**
 * ページ切り替えメソッドや、サブクラスで拡張すべきプレースホルダ置換メソッドを搭載したGUI基底クラス。
 */
// public abstract class BaseGUI implements InventoryHolder;

/** メインクラスのインスタンス */
protected Box plugin = Box.getInstance();
/** 全般設定 */
protected Config config = plugin.getAPI().getConfig();
/** メッセージ設定 */
protected Messages messages = plugin.getAPI().getMessages();
/** カテゴリ設定 */
protected Categories categories = plugin.getAPI().getCategories();
/** GUIアイコン設定 */
protected Layouts layout = plugin.getAPI().getLayouts();
/** プレイヤーデータアクセサ */
protected PlayerData playerData = plugin.getAPI().getPlayerData();
/** アイテム名アクセサ */
protected ItemData itemData = plugin.getAPI().getItemData();
/** GUIの実体, マインクラフトサーバーのプラグインにおけるGUIとは、インベントリとその中のアイテムのクリックで処理を実行するもの */
private final Inventory GUI;
/** ページ移動アイテム以外の枠に順番に入っていくアイテムのリスト */
private final List<ItemStack> items;
/** 装飾のための枠や、ページ移動アイテムなど */
private final Map<Integer, ItemStack> pageCommonItems;
/**
 * itemsやpageCommonItemsなどのアイテムをスロット順かつページ順に並び替えたもの。
 * このリストの要素はitemsやpageCommonItemsの要素のクローンで構成される。 
 */
private List<ItemStack> pagedItems;
/** GUIのページ 初期値1 */
private int page;
/** アイテムが存在する最大のページ 初期値1 */
private int maxPage;

// メソッド
/** GUI用のインベントリを作成し、必要な変数を代入・初期化する */
BaseGUI(int GUISize, String title);
/** 現在表示しているページを返す */
int getPage();
/** 最大のページを返す */
int getMaxPage();
/** pageComonItemsの不変ビューを返す */
Map<Integer, ItemStack> getPageCommonItems();
/** itemsの不変ビューを返す */
List<ItemStack> getItems();
/** このGUIの特定のスロットにどのページでも共通なアイテムを追加する */
void putPageCommonItem(int slot, ItemStack item);
/**
 * このGUIの特定のスロットに、どのページでも共通なアイテムを追加する。
 * 単体用メソッドを複数回呼び出すよりも軽量に動作する
 */
void putPageCommonItems(Map<Integer, ItemStack> entries);
/** このGUIの特定のスロットから、どのページでも共通なアイテムを消す */
void removePageCommonItem(int slot);
/**
 * このGUIの特定のスロット群から、どのページでも共通なアイテムを消す。
 * 単体用メソッドを複数回呼び出すよりも軽量に動作する
 */
void removePageCommmonItems(Collection<Integer> slots);
/** このGUIのページ共通なアイテムのうち、指定したitemと同じものをすべて消す */
void removePageCommonItem(ItemStack item);
/** ページ共通ではないアイテムに、指定したアイテムを追加する */
void addItem(ItemStack item);
/**
 * ページ共通ではないアイテムに、指定したアイテムをすべて追加する。
 * 単体用メソッドを複数回呼び出すよりも軽量に動作する
 */
void addAllItem(Collection<ItemStack> itemCollection);
/** ページ共通ではないアイテムに、指定したアイテムが含まれていれば消す */
void removeItem(ItemStack item);
/**
 * ページ共通ではないアイテムに、指定したアイテムが含まれていれば消す。
 * 単体用メソッドを複数回呼び出すよりも軽量に動作する
 */
void removeAllItem(Collection<ItemStack> itemCollection);
/**
 * GUIの表示を現在のページのアイテムでアップデートする。
 */
void setPage(int page);
/**
 * アイテムの名前と説明文にプレースホルダを適応する。引数のアイテムスタックにそのまま新しい名前と説明文を適応しているため、もともとのアイテムスタックを保持したい場合はクローンしてから引数に渡すこと。
 * 
 * @param item プレースホルダを適応するアイテム
 * @param placeholder 適応するプレースホルダ。サブクラスで中身を増やすことがあるため、Map.of() などの容量不変のマップを引数に渡さないこと。
 * @return 適応後のアイテム
 */
ItemStack applyPlaceholder(ItemStack item, Map<String, String> placeholder);

/** アイテムの名前と説明文にこのコンテキストで利用可能なプレースホルダを適応する */
ItemStack applyPlaceholder(ItemStack item);

/**
 * ページ共通アイテムとページ共通でないアイテムを、各ページのスロット番号通りに並べる。1ページ目以降もそのページのスロット通りに並べられる。
 * 
 * @return 各ページのスロット番号通りに並べられたアイテムのリスト
 */
private List<ItemStack> paged();

/**
 * 指定したページを構成するアイテムをすべてリストに収めて返す。インデックスとスロットが対応する。このリストのアイテムはプレースホルダが置換されておらず、アイテムスタックのインスタンスはaddまたはputしたままのもの。
 * 
 * @return スロット番号通りに並べられたアイテムリスト
 */
List<ItemStack> getRawPageItems(int page);

/**
 * 指定したページを構成するアイテムをすべてリストに収めて返す。インデックスとスロットが対応する。このリストのアイテムはクローンである、かつプレースホルダを置換してある。
 * 
 * @param page ページ
 * @return スロット番号通りに並べられたアイテムリスト
 */
List<ItemStack> getPageItems(int page);
/** InventoryHolderの保持しているInventoryを返すメソッド */
public Inventory getInventory();

