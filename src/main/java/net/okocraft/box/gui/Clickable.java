// クリック可能なGUIが実装すべきインターフェース
// public interface Clickable

/**
 * アイテムがクリックされた場合に呼び出されるメソッド。担当するGUIに属するするアイテムの処理のみを記述することを想定している。
 * @param event クリックした時に発生したイベント
 */
void onClicked(InventoryClickEvent event);
