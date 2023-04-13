
/**
 * メインコマンドの基本的な処理を記述したクラス。これを継承してそれぞれの具象的なコマンドクラスを作成する。
 */
// public abstract class Commands implements CommandExecutor, TabCompleter;

// 変数
/** プラグインのインスタンス */
protected final Box plugin;

/** config.ymlの設定 */
protected final Config config;

/** messages.ymlの設定 */
protected final Messages messages;

/** 登録されたサブコマンドとその名前のマップ */
protected final Map<String, BaseCommand> registeredSubCommands;

/** サブコマンドを登録する (registerdSubCommandsにputする)*/
protected void register(BaseCommand subCommand);

/** 登録されたサブコマンドを全て取得する */
public List<BaseCommand> getRegisteredCommands();

/** 名前からサブコマンドを取得する */
public BaseCommand getSubCommand(String name);

/** コンストラクタ。指定された名前のコマンドをplugins.ymlから検索し、このクラスをexecutorとしてセットする */
public Commands(String parent);

/** コマンド実行処理のエントリポイント。権限や実行者、ある程度の構文をチェックし、適切なサブコマンドの実行処理を呼び出す */
@Override
public boolean onCommand(CommandSender sender, Command command, String label, String[] args);

/** コマンド補完処理のエントリポイント。権限や実行者、ある程度の構文をチェックし、適切なサブコマンドの補完処理を呼び出す */
@Override
public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args);

/** 実行者の権限で許可されたコマンドの一覧を返す */
private List<String> getPermittedCommandNames(CommandSender sender);
