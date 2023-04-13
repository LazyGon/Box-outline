package net.okocraft.box.gui;


// abstract class CategoryGUI extends QuantityGUI;

/** このGUIの表示しているアイテムカテゴリの名前 */
private final String categoryName;
/** あるアイコンの表す実際のアイテムの名前をそのアイコンに格納するためのキー */
private final NamespacedKey realItemKey = new NamespacedKey(plugin, "realitem");

/** super()しつつ、カテゴリの名前を代入する */
CategoryGUI(Player player, String categoryName, String guiTitle, int quantity);
/** categoryNameを返す */
String getCategoryName();
/** アイテムの取引などで変動させるべきloreなどのメタを追随させるためのメソッド */
protected abstract void update(ItemStack item);
/** 全てのアイテムのloreを更新する */
protected void update();
/** ページを変更し、表示されるアイコン内容をアップデートする */
void setPage(int page);
/** あるアイコンに格納されたそのアイテムの表す実際のアイテムの名前を取得する */
String getRealItemName(ItemStack guiItem);
/** getRealItemNameで得た名前を使ってそのアイテムのインスタンスを取得する */
ItemStack getRealItem(ItemStack guiItem);
