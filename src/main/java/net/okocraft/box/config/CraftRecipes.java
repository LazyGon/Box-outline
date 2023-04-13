/** クラフトGUIにおいて、デフォルトで適応されるレシピを上書きするために利用される */
// public final class CraftRecipes extends CustomConfig;

// 変数
/** メインクラスのインスタンス */
private final Box plugin;

// メソッド
/** super("craftrecipes.yml")して設定を生成する */
public CraftRecipes();
/**
 * itemのクラフト時の材料を取得する。
 * craftrecipes.ymlに指定されていなかったときは空の不変マップを返す。
 * 
 * @param item 作り方を取得するアイテム
 * @return アイテムの材料。取得できなければ空の不変マップ。
 */
public Map<String, Integer> getIngredients(ItemStack item);
/**
 * itemをクラフトした結果、いくつクラフトされるかを返す。
 * データベースにアイテムが登録されていなかったり、craftrecipes.ymlに指定されていなかった場合は0を返す。
 * 
 * @param item 一度の作成数を調べるアイテム
 * @return 一度の作成数、取得できなければ0。
 */
public int getResultAmount(ItemStack item);
/** アイテムの内部名をデータベースから取得する */
private String getItemName(ItemStack item);
/** アイテムを内部名を用いてデータベースから取得する */
private ItemStack getItemStack(String name);


