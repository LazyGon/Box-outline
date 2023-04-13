
/**
 * Quantityボタンを実装したGUI
 * QUantityボタンとは、出し入れ・売買・クラフトなど、一回の取引での変化量が決まっている処理において、一度の操作で何回分取引処理をするかどうかを変更するボタンである
 */
// abstract class QuantityGUI extends BackMenuButtomGUI

// 変数
/** 取引単位を減らすボタンがあるスロット */
private final int decreaseSlot;
/** 取引単位の増減率を変化させるボタンがあるスロット */
private final int changeUnitSlot;
/** 取引単位を増やすボタンがあるスロット */
private final int increaseSlot;
/** 取引単位の値 初期値1 */
private int quantity;

// メソッド
/** superしつつ、各変数の代入、レイアウトからボタンのアイコンを読み込んでpageCommonItemsに配置するなどの処理を行う */
QuantityGUI(Player player, String guiTitle, int GUISize, int quantity, int previousPageSlot,
/** このGUIの処理である、取引単位の増減ボタンの処理を実装する */
public void onClicked(InventoryClickEvent event);
/** このGUIが担当する、取引単位関連のプレースホルダをアイコンの名前や説明文について置換する */
ItemStack applyPlaceholder(ItemStack item, Map<String, String> placeholder);
/** ページ移動の際、移動先のページの取引単位を今のページと同じにする処理を実装する */
void setPage(int page);
/** 取引単位の増減率をを変更する */
private void changeUnit(boolean isRightClick);
/** 取引単位を設定する */
void setQuantity(int newQuantity);
/** 取引単位を取得する */
int getQuantity();
