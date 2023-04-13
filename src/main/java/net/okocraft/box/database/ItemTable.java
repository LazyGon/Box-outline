/*
アイテムテーブル
id | item
1  | oaiejf=-9oqeirjo93r098h239...
2  | ...
...
*/



/**
 * このクラスで扱うアイテムのIDは、プレイヤーのデータを保存しているテーブルのcolumnとなる。
 * このクラスはメタを持たない単純なアイテムは常に全てのテーブルにあることを保証する。
 */
// final class ItemTable;

/** テーブル名 */
static final String TABLE;
/** データベースアクセサ */
private final Database database;

/**
 * データベース内容のキャッシュ。ここからアイテムが見つからなければデータベースに検索をかける。
 * データベースにだけ存在するアイテムの場合はこのキャッシュにアイテムを追加する。
 */
private final BiMap<Integer, ItemStack> items = HashBiMap.create();
/** アイテムのカスタムネームのキャッシュ */
private final BiMap<Integer, String> customNames = HashBiMap.create();

/** 変数の代入、テーブル作成クエリ、デフォルトである全アイテムの読み込みを行う */
ItemTable(Database database);
/** データベースから全てのアイテムを読み込み、復号化し、マップに登録する */
private void loadItems();
/** メタを今風にアプデする */
private void updateItems();
/**
 * メタを持たない単純なアイテムを全てデータベースに登録しておく。
 * ただし、ポーション・エンチャントに関してはクリエイティブのインベントリにあるだけ追加する。
 */
private void addDefaultItems();

/** データベースに既存のデータが有るかの確認なしに引数のアイテムをすべて登録する。初めて初期化する時限定で使用する */
private void unsafeRegister(List<ItemStack> registeredItems);
/** アイテムのカスタムネームを設定する */
boolean setCustomName(ItemStack item, String customName);
/**
 * 新しいアイテムをデータベースに登録する。その時AUTO_INCREMENT属性によって付与されたIDを返す。
 * 
 * @param item 登録するアイテム
 * @return 新たに生成されたアイテムのID。登録済みならそのアイテムのID。登録に失敗したら-1
 */
int register(ItemStack item);
/**
 * すでに登録済みのアイテムのIDを返す。登録していなければ-1を返す。
 * 
 * @param item 検索するアイテム
 * @return アイテムのIDか、-1
 */
int getId(ItemStack item);
/**
 * IDからアイテムを取得する。
 * 
 * @param id
 * @return
 */
ItemStack getItem(int id);
/**
 * 登録されたアイテムのIDの全てを取得する。
 * 
 * @return
 */
Set<Integer> getAllId();
/**
 * 登録されたアイテムの全てをクローンとして取得する。
 * 
 * @return
 */
Set<ItemStack> getAllItem();
/**
 * toString(item)によって文字列にされたアイテムを復号する。
 * 
 * @param base64 アイテムを変換した文字列
 * @return 複合されたアイテム
 */
private ItemStack fromString(String base64);
/**
 * アイテムを文字列に変換する。fromString(base64)メソッドで復号する。
 * 
 * @param item 文字列に返還するアイテム
 * @return アイテムを変換した文字列
 */
private String toString(ItemStack item);
/**
 * キャッシュにあるアイテムのすべてをbase64文字列に変換する 
 */
private Map<Integer, String> toStringAll();
