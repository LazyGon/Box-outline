/**
 * BoxStick: 左手に装備させると、実際のインベントリの処理を仮想インベントリで代行するようになる棒アイテム
 */
// // public class BoxStick implements Listener

// 変数
/** メインクラスのインスタンス */
private final Box plugin = Box.getInstance();
/** 設定クラス */
private final Config config = plugin.getAPI().getConfig();
/** プレイヤーデータアクセサ */
private final PlayerData playerData = plugin.getAPI().getPlayerData();
/** アイテムデータアクセサ */
private final ItemData itemData = plugin.getAPI().getItemData();
/** アイテムがBoxStickであることを識別するメタデータを格納するためのキー */
private final NamespacedKey stickKey = new NamespacedKey(plugin, "boxstick");

// メソッド
/** このクラスのイベント処理が行われるようにサーバーにこのクラスを登録する */
public void start();
/** BoxStickを持った状態で右クリックすると、Boxメニューを開くようにするイベントリスナ */
public void onInteractWithStick(PlayerInteractEvent event);
/** BoxStickを持った状態でブロックを設置すると、仮想インベントリからアイテムを引き出すリスナ */
public void blockPlace(BlockPlaceEvent event);
/** BoxStickを持った状態でアイテムを消費すると、仮想インベントリからアイテムを引き出すリスナ */
public void itemConsume(PlayerItemConsumeEvent event);
/** BoxStickを持った状態で右手のアイテムを使いすぎて破壊すると、仮想インベントリからアイテムを引き出して再装備するリスナ */
public void itemBreak(PlayerItemBreakEvent event);
/** BoxStickを持った状態でスプラッシュポーションを投げると、自動でスプラッシュポーションを補充するリスナ */
public void potionThrow(ProjectileLaunchEvent event);
/** BoxStickを持った状態で仮想インベントリからアイテムを一つ消費するメソッド */
private boolean useItemFromDatabase(ItemStack item, Player player);
/** 指定したitemがBoxStickであるか判定するメソッド */
private boolean isBoxStick(ItemStack item);
