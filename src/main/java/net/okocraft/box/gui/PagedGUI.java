/**
 * 取引量、前のメニューへの帰還、そしてページ変更ボタンを追加したGUIの実装
 */
// abstract class PagedGUI extends BaseGUI implements Clickable

// 変数
/** 前のページに戻るアイコンのあるスロット */
private final int previousPageSlot;
/** 次のページに移動するアイコンのあるスロット */
private final int nextPageSlot;
/** GUIを見ているプレイヤー */
private final Player player;

// メソッド
/** super()しつつ、pageCommonItemsにページ移動アイコン2種をputし、playerを代入する */
PagedGUI(Player player, String guiTitle, int GUISize, int previousPageSlot, int nextPageSlot);
/** このGUIが処理すべき、ページ移動処理を実装する */
public void onClicked(InventoryClickEvent event);
/** このGUIが担当する、ページ関連のプレースホルダをアイコンの名前や説明文について置換する */
ItemStack applyPagePlaceholder(ItemStack item, Map<String, String> placeholder);
/** super.setPageしつつ、ページ関連のアイコンの説明文などのメタデータを更新する */
void setPage(int page);
/** ページ移動アイコンのいずれかを更新する */
private void updatePageArrowIcon(boolean isNextPageIcon);
/** playerを返す */
Player getPlayer();
