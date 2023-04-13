/** 
 * GUIに並ぶアイテム=アイコンの表示名や説明文のフォーマットを取得できる。
 * アイコンには、必要ならそのアイコンが表している実際のアイテムの内部名が、アイコンの内部データに格納される。
 */
// public final class Layouts extends CustomConfig;

/** アイコンの内部に実際のアイテムの内部名を格納するためのキー */
private final NamespacedKey realItemKey;

// メソッド
/** super("layout.yml")して設定を生成する */
public Layouts();

/**
 * カテゴリセレクターの枠を取得する。
 * 
 * @return フレーム
 */
public ItemStack getFrame();
/**
 * 前ページに移動するボタンを取得する。
 * 
 * @return 前ページボタン
 */
public ItemStack getPreviousPage();
/**
 * 次ページに移動するボタンを取得する。
 * 
 * @return 次ページボタン
 */
public ItemStack getNextPage();
/**
 * 前のメニューに戻るボタンを取得する。
 * 
 * @return 前のメニューに戻るボタン
 */
public ItemStack getBackMenu();
/**
 * 取引数減少ボタンを取得する。
 * 
 * @return 取引数減少ボタン
 */
public ItemStack getDecrease();
/**
 * 取引数変更量を設定するボタンを取得する。
 * このアイテムの量によって、一度の取引数減少ボタン・取引数増加ボタンで変更される取引数が増減する。
 * 
 * @return 取引数変更量設定ボタン
 */
public ItemStack getChangeUnit();
/**
 * 取引数増加ボタンを取得する。
 * 
 * @return 取引数増加ボタン
 */
public ItemStack getIncrease();
/**
 * アイテムの預け入れ、引き出しを行うGUIに移動するボタンを取得する。
 * 
 * @return GUI移動ボタン
 */
public ItemStack getStrage();
/**
 * アイテムの購入、売却を行うGUIに移動するボタンを取得する。
 * 
 * @return GUI移動ボタン
 */
public ItemStack getShop();
/**
 * アイテムのクラフトを行うGUIに移動するボタンを取得する。
 * 
 * @return GUI移動ボタン
 */
public ItemStack getCraft();
/**
 * オフラインプレイヤーを表示するボタンを取得する。
 * 
 * @return オフラインプレイヤーを表示するボタン
 * 
 * @deprecated 未使用。
 */
@Deprecated
public ItemStack getSelectOffline();
/**
 * カテゴリセレクターGUIのタイトルを取得する。
 * 
 * @return タイトル
 */
public String getCategorySelectorGUITitle();
/**
 * カテゴリセレクターGUIに並べられるカテゴリアイテムのメタを渡されたentryにセットする。
 * 
 * @param entry メタをセットするアイテム
 * @return メタをセットされたアイテム。同じインスタンス
 */
public ItemStack setCategorySelectorEntryMeta(ItemStack entry);

/**
 * アイテムの預け入れ、引き出しを行うGUIに並べられるアイテムのメタを渡されたentryにセットする。
 * 
 * @param entry メタをセットするアイテム
 * @return メタをセットされたアイテム。同じインスタンス
 */
public ItemStack setStrageEntryMeta(ItemStack entry);
/**
 * アイテムの購入、売却を行うGUIに並べられるアイテムのメタを渡されたentryにセットする。
 * 
 * @param entry メタをセットするアイテム
 * @return メタをセットされたアイテム。同じインスタンス
 */
public ItemStack setShopEntryMeta(ItemStack entry);
/**
 * アイテムのクラフトを行うGUIに並べられるカテゴリアイテムのメタを渡されたentryにセットする。
 * 
 * @param entry メタをセットするアイテム
 * @return メタをセットされたアイテム。同じインスタンス
 */
public ItemStack setCraftEntryMeta(ItemStack entry);
/**
 * アイテムの預け入れ、引き出しを行うGUIのタイトルを取得する。
 * 
 * @return タイトル 
 */
public String getStrageGUITitle();
/**
 * アイテムの購入、売却を行うGUIのタイトルを取得する。
 * 
 * @return タイトル
 */
public String getShopGUITitle();
/**
 * アイテムのクラフトを行うGUIのタイトルを取得する。
 * 
 * @return タイトル
 */
public String getCraftGUITitle();
/**
 * クラフトに使われる材料のリストの一行一行に用いられるフォーマットを取得する。
 * 
 * @return フォーマット
 */
public String getMaterialsPlaceholderFormat();
