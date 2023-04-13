/**
 * アイテムの取引GUIの実装
 */
// class StrageGUI extends CategoryGUI

// メソッド
/** superしつつ出し入れ、売買などのGUIに切り替えるボタンや、出し入れするアイテムのボタンなどを配置する */
StrageGUI(Player player, String categoryName, int quantity) throws IllegalArgumentException;
/** このGUIが担当すべき、アイテムの出し入れを実装する */
public void onClicked(InventoryClickEvent event);
/** このGUIに関係するプレースホルダで、GUIアイテムの名前や説明文のメタデータを置換する */
ItemStack applyPlaceholder(ItemStack item, Map<String, String> placeholder);
/** 指定したGUIアイテムの示す実際のアイテムを引き出して実際のインベントリに入れる */
private int withdraw(ItemStack item);
/** インベントリ内にある一番最初の限界サイズではないアイテムスタックを探し、それがあるスロット番号を返す */
private int firstPartial(Inventory inv, ItemStack item);
/** インベントリ内にアイテムを追加する */
private Map<Integer, ItemStack> addItem(Inventory inv, ItemStack... items);
/** 指定したGUIアイテムの示す実際のアイテムを預け入れて、実際のインベントリからは減らす */
private int deposit(ItemStack item);
/** アイテムの名前や説明文などを更新する */
protected void update(ItemStack item);
/** 今実際のインベントリに入っているアイテムをすべて仮想インベントリに預け入れる */
private void storeAll();
