// final class PlayerTable;

// 変数
/** テーブル名 */
static final String TABLE;
/** データベースアクセサ */
private final Database database;
/** プレイヤーのidのキャッシュ */
private final BiMap<Player, Integer> idCache = HashBiMap.create();

// メソッド
/** 変数を代入し、テーブル作成クエリを発行する */
PlayerTable(@NotNull Database database);
/** プレイヤーをデータベースに登録し、振られた番号を返す */
private int insert(OfflinePlayer player);
/** キャッシュにプレイヤーを追加する */
void loadCache(Player player);
/** キャッシュからプレイヤーを削除する */
void removeCache(Player player);
/** すでに登録済みのプレイヤーのIDをUUIDで検索して結果を返す。登録していなければ-1を返す */
int getId(UUID uniqueId);
/** すでに登録済みのプレイヤーのIDを名前で検索して結果を返す。登録していなければ-1を返す */
int getId(String name);
/** すでに登録済みのプレイヤーのUUIDをidで検索して結果を返す。登録していなければnullを返す */
UUID getUniqueId(int id);
/** すでに登録済みのプレイヤーのUUIDをプレイヤー名で検索して結果を返す。登録していなければnullを返す */
UUID getUniqueId(String name);
/** すでに登録済みのプレイヤーの名前をidで検索して結果を返す。登録していなければnullを返す */
String getName(int id);
/** すでに登録済みのプレイヤーの名前をuuidで検索して結果を返す。登録していなければnullを返す */
String getName(UUID uniqueId);
/** データベースにidが登録されているかどうかを返す */
boolean exists(int id);
/** データベースにuuidが登録されているかどうかを返す */
boolean exists(UUID uniqueId);
/** データベースに名前が登録されているかどうかを返す */
boolean exists(String name);
/** データベースに登録されているuuidをすべて調べ、offlineplayerにして返す */
List<OfflinePlayer> getAll();
/** データベースに登録されている名前をすべて調べて返す */
List<String> getAllName();

