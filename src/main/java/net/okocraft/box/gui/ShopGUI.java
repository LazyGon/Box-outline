/**
 * アイテムの取引GUIの実装
 */
// class ShopGUI extends CategoryGUI

// 変数
/** アイテム価格設定 */
private final Prices prices; // = plugin.getAPI().getPrices();
/** 所持金管理 */
private final Economy economy; // = Box.getInstance().getEconomy();
/** 所持金的に取引可能なアイテムの一覧 */
List<ItemStack> available;

// メソッド
/** superしつつ出し入れ、売買などのGUIに切り替えるボタンや、売買可能なアイテムのボタンなどを配置する */
ShopGUI(Player player, String categoryName, int quantity) throws IllegalArgumentException;
/** 所持金が足りなくて購入できないアイテムを調べ、売買可能アイテムをGUIに配置するメソッド */
void refresh();
/** このGUIが担当すべき、アイテムの売買に関する処理を実装する */
public void onClicked(InventoryClickEvent event);
/** 所持金の変化などの際に、指定したGUIアイコンの名前や説明文を該当するプレースホルダで置換する */
protected void update(ItemStack item);
/** このGUIに関係するプレースホルダで、指定したアイテムの名前や説明文などのメタデータを置換する */
ItemStack applyPlaceholder(ItemStack item, Map<String, String> placeholder);
/** 指定したGUIアイテムの示す実際のアイテムを売却する */
private int sell(ItemStack item);
/** 指定したGUIアイテムの示す実際のアイテムを購入する */
private int buy(ItemStack item);
/** 指定したGUIアイテムの示す実際のアイテムをすべて売却する */
private double sellAll();
