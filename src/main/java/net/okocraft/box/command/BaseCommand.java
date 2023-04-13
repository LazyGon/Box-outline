package net.okocraft.box.command;




/**
 * サブコマンドに必要な各種情報を保持するクラス。使用するには具体的な実装が必要。
 */
// public abstract class BaseCommand;

/**
 * プラグインのインスタンス
 */
protected final Box plugin = Box.getInstance();

/**
 * config.ymlの設定
 */
protected final Config config = plugin.getAPI().getConfig();

/**
 * messages.ymlの設定
 */
protected final Messages messages = plugin.getAPI().getMessages();

/**
 * categories.ymlの設定
 */
protected final Categories categories = plugin.getAPI().getCategories();

/**
 * playerデータのアクセサ
 */
protected final PlayerData playerData = plugin.getAPI().getPlayerData();

/**
 * アイテムデータのアクセサ
 */
protected final ItemData itemData = plugin.getAPI().getItemData();

private final String name;
private final String permissionNode;
private final int leastArgLength;
private final boolean isPlayerOnly;
private final String usage;
private final List<String> alias;

/**
 * コンストラクタ。変数に代入する
 * 
 * @param name コマンド名
 * @param permissionNode コマンドの権限
 * @param leastArgLength 最低限必要な引数の数
 * @param isPlayerOnly コンソールからも利用できるかどうか
 * @param usage コマンドの使用法
 * @param alias コマンドの略称
 */
protected BaseCommand(String name, String permissionNode, int leastArgLength, boolean isPlayerOnly, String usage, String ... alias);


/**
 * 各コマンドの処理
 *
 * @param sender コマンドの実行者
 * @param args   引数
 * @return コマンドが成功したらtrue
 */
public abstract boolean runCommand(CommandSender sender, String[] args);

/**
 * 各コマンドのタブ補完の処理
 *
 * @param sender コマンドの実行者
 * @param args   引数
 * @return その時のタブ補完のリスト
 */
public List<String> runTabComplete(CommandSender sender, String[] args);


/** ゲッター */
public String getName();
return name;


/** ゲッター */
public String getPermissionNode();

/** ゲッター */
public boolean isPlayerOnly();
return isPlayerOnly;


/** ゲッター */
public int getLeastArgLength();


/** ゲッター */
public boolean isValidArgsLength(int argsLength);


/** ゲッター */
public String getUsage();

/** ゲッター */
public List<String> getAlias();


/**
 * コマンドの説明を取得する。例: "アイテムの自動収納の設定をリストにして表示する。"
 *
 * @return コマンドの説明
 */
public String getDescription();

/**
 * このコマンドを使う権限があるか調べる。
 * 
 * @param sender コマンド送信者
 * @return 権限があればtrue なければfalse
 * @see CommandSender#hasPermission(String)
 */
public boolean hasPermission(CommandSender sender);

