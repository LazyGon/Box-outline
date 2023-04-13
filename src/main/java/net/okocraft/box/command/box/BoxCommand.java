/** /boxコマンドの実装 */
// class AutoStoreCommand extends BaseCommand

// 変数
/** このクラスのインスタンス */
private static BoxCommand instance;

// メソッド
/** instanceに代入、各種サブコマンドに対してregisterを呼び出す */
public BoxCommand();
/** ゲッター */
static BoxCommand getInstance();
/** サブコマンドが指定されていない場合、メインメニューのGUIを開いて処理を終了する。指定されていたらsuper.onCommandする */
public boolean onCommand(CommandSender sender, Command command, String label, String[] args);
