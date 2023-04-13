/**
 * 
 * プレイヤーのデータを設定・取得できる。
 * このクラスはキャッシュを扱い、なおかつキャッシュへ変更が加えられたらデータベースに非同期でデータ保存SQLを発行する。
 * キャッシュが削除された瞬間も一応データベースにキャッシュの内容を保存する。
 */
// public class PlayerData;

// 変数
/** データベースアクセサ */
private final Database database;
/** アイテムテーブルアクセサ */
private final ItemTable itemTable;
/** プレイヤーテーブルアクセサ */
private final PlayerTable playerTable;
/** マスターテーブルアクセサ */
private final MasterTable masterTable;

/** 拾ったアイテムの仮想インベントリへの自動収納設定のキャッシュ */
private final Map<Player, Map<ItemStack, Boolean>> autostore;
/** 仮想インベントリにおけるアイテムの在庫のキャッシュ */
private final Map<Player, Map<ItemStack, Integer>> stock;

/** SQL発行を非同期で行うためのスレッドプール */
private final ExecutorService threadPool = Executors.newSingleThreadExecutor();

// メソッド
/** コンストラクタ。configの設定値を用いてデータベースに接続し、各テーブルへのアクセサを初期化する */
public PlayerData(Config config);
/** itemTableを返す */
ItemTable getItemTable();
/** playerTableを返す */
PlayerTable getPlayerTable();
/** データベースに登録されている全てのプレイヤーの名前を返す */
public List<String> getPlayers();
/** データベースの接続を切断する */
public void dispose();
/** プレイヤーのストックやautostoreなどのデータをキャッシュに入れておく */
public void loadCache(Player player);
/** キャッシュを削除し、そのデータをデータベースに保存する。 */
public void removeCache(Player player);
/** すべての拾ったアイテムの仮想インベントリへの自動収納を設定する */
public void setAutoStoreAll(OfflinePlayer player, boolean enabled);
/** 指定したすべての、拾ったアイテムの仮想インベントリへの自動収納をそれぞれ設定する */
public void setAutoStoreAll(OfflinePlayer player, Map<ItemStack, Boolean> enabled);
/** 指定した、拾ったアイテムの仮想インベントリへの自動収納を設定する */
public void setAutoStore(OfflinePlayer player, ItemStack item, boolean enabled);
/** 拾ったアイテムの仮想インベントリへの自動収納設定を取得する */
public boolean getAutoStore(OfflinePlayer player, ItemStack item);
/** すべての拾ったアイテムの仮想インベントリへの自動収納設定を取得する */
public Map<ItemStack, Boolean> getAutoStoreAll(OfflinePlayer player);
/** プレイヤーのアイテムの在庫を設定する */
public void setStock(OfflinePlayer player, ItemStack item, int stock);
/** プレイヤーのアイテムの在庫を渡したマップの通りに設定する */
public void setStockAll(OfflinePlayer player, Map<ItemStack, Integer> stock);
/** アイテムの在庫を指定した数だけ合算する */
public void addStock(OfflinePlayer player, ItemStack item, int amount);
/** アイテムの在庫を取得する */
public int getStock(OfflinePlayer player, ItemStack item);
/** すべてのアイテムの在庫を取得する */
public Map<ItemStack, Integer> getStockAll(OfflinePlayer player);
/** プレイヤーのインベントリのアイテムをすべて預ける */
public boolean storeAll(Player player);