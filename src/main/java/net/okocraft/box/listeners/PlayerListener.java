/**
 * 以下の機能を実装する
 * * 拾ったアイテムを自動で仮想インベントリに送る機能
 * * GUIをクリックしたときの処理の起点
 * * ログイン・ログアウト時のストック等のキャッシュ処理の起点
 */
// // public class PlayerListener implements Listener

// 変数
/** メインクラスのインスタンス */
private final Box plugin = Box.getInstance();
/** 全般設定 */
private final Config config = plugin.getAPI().getConfig();
/** メッセージ設定 */
private final Messages messages = plugin.getAPI().getMessages();
/** アイテムのカテゴリ設定 */
private final Categories categories = plugin.getAPI().getCategories();
/** プレイヤーデータアクセサ */
private final PlayerData playerData = plugin.getAPI().getPlayerData();
/** アイテムデータアクセサ */
private final ItemData itemData = plugin.getAPI().getItemData();

// メソッド
/** このクラスのイベント処理が行われるようにサーバーにこのクラスを登録する */
public void start();
/** 設定で無効化されたワールドでGUIを開くとキャンセルするリスナ */
public void onInventoryOpen(InventoryOpenEvent event);
/** インベントリがクリックされたときにそのインベントリがGUIか判定して、イベント処理をGUIクラスに委譲するリスナ */
public void onInventoryClick(InventoryClickEvent event);
/** プレイヤーがログアウトしたときにプレイヤーデータやGUIのキャッシュを削除するリスナ */
public void onQuit(PlayerQuitEvent event);
/** プレイヤーがログインした時にプレイヤーデータのキャッシュを作成するリスナ */
public void onJoin(PlayerJoinEvent event);
/** アイテムを拾うイベントの時に仮想インベントリに自動で収納させるリスナ */
public void autoStoreDroppedItem(EntityPickupItemEvent event);
