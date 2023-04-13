/**
 * データを主に保存しているテーブル
 * 
 * プレイヤーデータテーブル
 * id | playerid | itemid | stock | autostore
 * 1  | 1        | 1      | 1     | 0
 * 2  | 2        | 1      | 1     | 0
 * 3  | 3        | 1      | 1     | 0
 * 4  | 4        | 1      | 1     | 0
 * 5  | 5        | 1      | 1     | 0
 * ...
 */
// class MasterTable

// 変数
/** テーブル名 */
private static final String TABLE;
/** データベースアクセサ */
private final Database database;
/** アイテムテーブルへのアクセサ */
private final ItemTable itemTable;
/** プレイヤーテーブルへのアクセサ */
private final PlayerTable playerTable;

// メソッド
/** 変数へ代入し、テーブル作成クエリを発行する */
MasterTable(Database database, ItemTable itemTable, PlayerTable playerTable);
/** すべての拾ったアイテムの仮想インベントリへの自動収納を設定する */
void setAutoStoreAll(OfflinePlayer player, boolean enabled);
/** 指定したすべての、拾ったアイテムの仮想インベントリへの自動収納を設定する */
void setAutoStoreAll(OfflinePlayer player, Map<ItemStack, Boolean> autostore);
/** クエリの回数を減らすためのメソッド。指定した、拾ったアイテムの仮想インベントリへの自動収納を有効にする */
private void setAutoStoreAllTrue(OfflinePlayer player, Collection<ItemStack> items);
/** クエリの回数を減らすためのメソッド。指定した、拾ったアイテムの仮想インベントリへの自動収納を無効にする */
private void setAutoStoreAllFalse(OfflinePlayer player, Collection<ItemStack> items);
/** 特定の拾ったアイテムの仮想インベントリへの自動収納を設定する */
void setAutoStore(OfflinePlayer player, ItemStack item, boolean enabled);
/** 特定の拾ったアイテムの仮想インベントリへの自動収納設定を取得する */
boolean getAutoStore(OfflinePlayer player, ItemStack item);
/** 指定したすべての、拾ったアイテムの仮想インベントリへの自動収納設定を取得する */
Map<ItemStack, Boolean> getAutoStoreAll(OfflinePlayer player);
/** 指定したアイテムの仮想インベントリでの在庫を設定する */
void setStock(OfflinePlayer player, ItemStack item, int stock);
/** 指定したすべてのアイテムの仮想インベントリでの在庫を設定する */
void setStockAll(OfflinePlayer player, Map<ItemStack, Integer> stock);
/** 指定したすべてのアイテムの仮想インベントリでの在庫を0にする(レコードを削除する) */
private void setStockAll0(OfflinePlayer player, List<ItemStack> stockTo0);
/** 指定したすべてのアイテムの仮想インベントリでの在庫をマップで指定した値に設定する */
private void setStockAllNot0(OfflinePlayer player, Map<ItemStack, Integer> stock);
/** 指定したアイテムの仮想インベントリでの在庫を指定した値だけ増やす */
void addStock(OfflinePlayer player, ItemStack item, int amount);
/** 指定したアイテムの仮想インベントリでの在庫を取得する */
int getStock(OfflinePlayer player, ItemStack item);
/** すべてのアイテムの仮想インベントリでの在庫を取得する */
Map<ItemStack, Integer> getStockAll(OfflinePlayer player);
