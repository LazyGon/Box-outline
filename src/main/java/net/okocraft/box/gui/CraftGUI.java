/** アイテムクラフトGUIの実装 */
// class CraftGUI extends CategoryGUI {

// 変数
/** 設定で独自に定義したアイテムのレシピ設定 */
private final CraftRecipes craftRecipes;
/** key: 完成品、value: 仮想インベントリに入り得るアイテムを用いた、完成品のレシピ */
private final Map<ItemStack, Map<String, Integer>> recipes;
/** アイテムが完成したとき、何個できているべきかを定義するマップ */
private final Map<ItemStack, Integer> recipeResultAmounts;
/** 実際に仮想インベントリにあるアイテムからクラフト可能なアイテムだけを入れたリスト */
private final List<ItemStack> available;

// メソッド
/** superしつつ出し入れ、売買などのGUIに切り替えるボタンや、作成可能なアイテムのボタンなどを配置する */
CraftGUI(Player player, String categoryName, int quantity) throws IllegalArgumentException;
/** ストックが足りなくて作れないアイテムを調べ、作れるアイテムをGUIに配置するメソッド */
void refresh();
/** このGUIが担当すべき各ボタンの処理を記述する: GUIの種類の切り替え、アイテムのクラフト */
public void onClicked(InventoryClickEvent event);
/** このGUIのアイテムが表示するべき情報(カテゴリ、アイテム名、ストック、量)をプレースホルダとして、アイテム名前や説明文を更新する */
ItemStack applyPlaceholder(ItemStack item, Map<String, String> placeholder);
/** availableにクラフト可能なアイテムを入れるメソッド */
private void putAvailable(List<ItemStack> items);
/** GUIのアイコンをアップデートするメソッド */
protected void update(ItemStack item);
/** 指定したアイテムを作成する。引数にGUIのアイコンとなっているアイテムを指定する */
private int craft(ItemStack item);
/** 実際に作成されるアイテムのレシピをサーバーから取得する */
private Recipe getRecipeFor(ItemStack realItem);
/** 実際に作成されるアイテムの一度のクラフトにおける作成料をサーバーから取得する */
private int getCraftResultAmount(ItemStack realItem);
/** 設定で規定されたレシピを探し、無ければgetRecipeForでサーバーからレシピを探す。どちらもなければ空のMapを返す */
private Map<String, Integer> getIngredients(ItemStack realItem);
/** アイテムのダメージ値を指定する */
private static void setDamage(ItemStack item, short damage);
