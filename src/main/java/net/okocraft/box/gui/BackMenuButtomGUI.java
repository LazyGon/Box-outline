
/**
 * 取引量、前のメニューへの帰還、そしてページ変更ボタンを追加したGUIの実装
 */
// abstract class BackMenuButtomGUI extends PagedGUI;

/** 前のメニューに戻るボタンが配置されているスロットの番号 */
private final int backMenuSlot;

/**
 * コンストラクタ。レイアウトを読み込み、適切なバックメニューボタンアイコンを配置する。
 * 
 * @param player   GUIを開いているプレイヤー
 * @param guiTitle GUIのタイトル
 * @param GUISize  GUIのサイズ
 * @param previousPageSlot 前ページに戻るアイテムのスロット
 * @param nextPageSlot 次のページに進むアイテムのスロット
 * @param backMenuSlot 前のメニューに戻るアイテムのスロット
 */
BackMenuButtomGUI(Player player, String guiTitle, int GUISize, int previousPageSlot, int nextPageSlot, int backMenuSlot);

/** このメニューの前のメニューである、カテゴリセレクタGUIに遷移する */
public void onClicked(InventoryClickEvent event);
