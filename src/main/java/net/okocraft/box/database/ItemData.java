
/**
 * アイテムの内部名、その内部名から実際のアイテムスタックを取得できるAPIクラス
 */
// public class ItemData;

// 変数
/** データベースアクセサ */
private final ItemTable itemTable;
/** アイテム名と実際のアイテムのキャッシュ */
private final BiMap<String, ItemStack> names = HashBiMap.create();

// メソッド
/** loadNamesを呼び出して、今存在するキャッシュをすべて読み込む */
public ItemData(PlayerData playerData);

/**
 * アイテムから内部名を取得する。内部名はMaterial名:idとなっており、idはデータベースに登録された時に振り分けられた番号となる。
 * もしアイテムに{@link ItemData#setCustomName(ItemStack, String)}によってカスタムネームが設定されていたら、それを返す。
 * データベースにアイテムがない場合は、nullを返す。
 * 
 * @param item 名前を調べるアイテム。
 * @return アイテム名またはnull
 */
public String getName(ItemStack item);

/**
 * アイテム名から{@link ItemStack}を調べて返す。
 * もしアイテムに{@link ItemData#setCustomName(ItemStack, String)}によってカスタムネームが設定されていたら、それを引数に渡さなければnullを返す。
 * アイテムがデータベースにない場合もnullを返す。
 * 
 * @param name アイテム名
 * @return アイテムまたはnull
 */
public ItemStack getItemStack(String name);

/**
 * アイテムをデータベースに登録する。その時に設定されたアイテム名を返す。もし、登録できなかった場合は空文字列を返す。
 * 
 * @param item データベースに登録するアイテム
 * @return アイテム名または空文字列
 */
public String register(ItemStack item);

/**
 * データベースに登録されているアイテムのすべての名前をリストに入れて返す。
 * 
 * @return アイテム名のリスト
 */
public List<String> getNames();

/**
 * loadNameを全てのアイテムについて行う。
 */
private void loadNames();

/**
 * アイテムのカスタムネームを設定する。アイテムがデータベースに登録されて居ない場合は失敗する。
 * 
 * @param item アイテム
 * @param customName 新しいカスタムネーム
 * @return 成功したらtrue、さもなくばfalse
 */
public boolean setCustomName(ItemStack item, String customName);

/**
 * アイテムの、タブ補完などでやり取りする名前を全て読み込む。
 * 
 * @param id アイテムのデータベースに採番された番号
 * @param item アイテム
 */
String loadName(ItemStack item);
