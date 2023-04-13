/** GUIに実際に並び、取引可能なアイテムを取得できる */
// public final class Categories extends CustomConfig

// 変数
/** メインクラスのインスタンス */
private final Box plugin;
/** アイコンにカテゴリ名を格納するためのキー */
private final NamespacedKey categoryNameKey;
/** カテゴリすべてに含まれている、すべてのアイテムのセット */
private Set<String> allItems;

// メソッド
/** "categories.yml"を指定してsuperする */
public Categories();
/** カテゴリの一覧を取得する */
public List<String> getCategories();
/** カテゴリアイコンの表示名を取得する */
public String getDisplayName(String category);
/** カテゴリアイコンを取得する */
public ItemStack getIcon(String category);
/** カテゴリに含まれるアイテムを取得する */
public List<ItemStack> getItems(String category);
/** allItemsをそのまま、または初期化して返す */
public Set<String> getAllItems();
/** 新たなカテゴリを追加する */
public void addCategory(String id, String displayName, List<String> items, String iconItem);
/** アイテムの名前を変更する */
public void replaceItem(String oldName, String newName);
