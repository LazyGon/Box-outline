/** カテゴリを選択するGUI。categories.ymlの設定を参照し、それぞれのカテゴリGUIへのアクセスを提供する */
// public final class CategorySelectorGUI extends BaseGUI implements Clickable {

// 変数
/** カテゴリ名をアイコンに格納するためのキー */
private final NamespacedKey categoryNameKey; // = new NamespacedKey(plugin, "categoryname");
/** クリックしても何も起きないお飾りのアイコンが入るスロットの番号 */
private final List<Integer> frameSlots; // = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 17, 18, 26, 27, 35, 36, 44, 45, 46,

// メソッド
/** pageCommonItemsにフレームやページ切り替えアイコンを入れる。また、カテゴリを表すアイコンをitemsに入れる */
public CategorySelectorGUI();
/** このGUIがクリックされたときの処理、すなわちカテゴリGUIへの遷移を実装する */
public void onClicked(InventoryClickEvent event);
/** アイコンに格納されたカテゴリ名を取得するメソッド */
private String getCategoryName(ItemStack item);
/** アイコンにプレースホルダを適用する */
ItemStack applyPlaceholder(ItemStack item, Map<String, String> placeholder);
