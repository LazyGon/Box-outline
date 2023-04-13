/** メインクラス 最初にサーバーにロードされ、onEnableが呼び出される */
// // public class Box extends JavaPLugin

// 変数
/** メインクラスのインスタンス */
private static Box instance;
/** 所持金の管理 */
private Economy economy;
/** API */
private BoxAPI api;

// メソッド
/** instanceの代入、APIの初期化(ここでデータベースも初期化される)、イベントリスナの登録、コマンドの登録 */
public void onEnable();
/** データベースのクローズ */
public void onDisable();
/** instanceを返す。onEnableが呼ばれる前に実行すると例外、 */
public static Box getInstance() throws IllegalStateException;
/** バージョン文字列を返すユーティリティメソッド */
public String getVersion();
/** イベントリスナの登録 */
private void registerEvents();
/** apiを返す */
public BoxAPI getAPI();
/** economyを初期化し、返す。依存先のVaultプラグインがサーバーにインストールされていない場合例外 */
private Economy provideEconomy() throws IllegalStateException;
/** economyを返す */
public Economy getEconomy();
