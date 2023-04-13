/**
 * メッセージの取得、またはそれを送信するメソッドを利用できる。
 */
// public final class Messages extends CustomConfig;
// メソッド
/** super("messages.yml")して設定を生成する */
public Messages();
/**
 * メッセージコンポーネントをプレイヤーに送信する。主に{@link ItemStackのホバーを送信するために使用される。
 * 
 * @param sender メッセージを送る対象
 * @param addPrefix メッセージにプレフィックスを付加するかどうか
 * @param path メッセージを記述してあるconfigのパス
 * @param placeholders 適応されるプレースホルダーのマップ
 */
public void sendMessageComponent(CommandSender sender, boolean addPrefix, String path, Map<String, BaseComponent> placeholders);
/**
 * メッセージを送信する。
 * 
 * @param sender メッセージを送る対象
 * @param addPrefix メッセージにプレフィックスを付加するかどうか
 * @param path メッセージを記述してあるconfigのパス
 * @param placeholders 適応されるプレースホルダーのマップ
 */
public void sendMessage(CommandSender sender, boolean addPrefix, String path, Map<String, Object> placeholders);
/**
 * メッセージを送信する。
 * 
 * @param sender メッセージを送る対象
 * @param path メッセージを記述してあるconfigのパス
 * @param placeholders 適応されるプレースホルダーのマップ
 */
public void sendMessage(CommandSender sender, String path, Map<String, Object> placeholders);
/**
 * メッセージを送信する。
 * 
 * @param sender メッセージを送る対象
 * @param path メッセージを記述してあるconfigのパス
 */
public void sendMessage(CommandSender sender, String path);
/**
 * メッセージを送信する。
 * 
 * @param sender メッセージを送る対象
 * @param addPrefix メッセージにプレフィックスを付加するかどうか
 * @param path メッセージを記述してあるconfigのパス
 */
public void sendMessage(CommandSender sender, boolean addPrefix, String path);
/**
 * configからpathを元にメッセージを取得する。存在しない場合はpathをそのまま返す。
 * 
 * @param path メッセージを記述してあるconfigのパス
 * @return 取得されたメッセージか、渡されたpath
 */
public String getMessage(String path);
/**
 * 禁止されたワールド内でBoxの機能を使った旨のメッセージを送信する。
 * 
 * @param sender メッセージを送る対象
 */
public void sendDisabledWorld(CommandSender sender);
/**
 * インベントリ操作を行った結果、インベントリが一杯で失敗したというメッセージを送信する。
 * 
 * @param sender メッセージを送る対象
 */
public void sendInventoryIsFull(CommandSender sender);
/**
 * コマンドの引数が足りなかったというメッセージを送信する。
 * 
 * @param sender メッセージを送る対象
 */
public void sendNotEnoughArguments(CommandSender sender);
/**
 * アイテムを預けたりするときに、インベントリ内のアイテムが足りないというメッセージを送信する。
 * 
 * @param sender メッセージを送る対象
 */
public void sendNotEnoughItem(CommandSender sender);
/**
 * コマンドの引数が不正だったというメッセージを送信する。
 * 
 * @param sender メッセージを送る対象
 * @param argument 不正だった引数
 */
public void sendInvalidArgument(CommandSender sender, String argument);
/**
 * autostore設定が変更された旨のメッセージを送信する。
 * 
 * @param sender メッセージを送る対象
 * @param item プレースホルダーに使われる{@link ItemStack
 * @param switchTo Autostoreを有効化するかどうかのプレースホルダー
 */
public void sendAutoStore(CommandSender sender, ItemStack item, boolean switchTo);
/**
 * すべてのアイテムのautostore設定が変更された旨のメッセージを送信する。
 * 
 * @param sender メッセージを送る対象
 * @param switchTo Autostoreを有効化するかどうかのプレースホルダー
 */
public void sendAutoStoreAll(CommandSender sender, boolean switchTo);
/**
 * 原因不明のエラーが発生したというメッセージを送信する。
 * 
 * @param sender メッセージを送る対象
 */
public void sendUnknownError(CommandSender sender);
/**
 * アイテムがデータベースに存在しないというメッセージを送信する。
 * 
 * @param sender メッセージを送る対象
 */
public void sendItemNotFound(CommandSender sender);
/**
 * autostore設定リストのヘッダーを送信する。
 * 
 * @param sender メッセージを送る対象
 * @param player autostore設定を調べるプレイヤー
 * @param page 表示するページ
 * @param currentLine 表示したページの一番最後の行の番号
 * @param maxLine すべての行数
 */
public void sendAutoStoreListHeader(CommandSender sender, String player, int page, int currentLine, int maxLine);
/**
 * autostore設定リストの行を送信する。
 * 
 * @param sender メッセージを送る対象
 * @param item プレースホルダーに使われる{@link ItemStack
 * @param isEnabled autostore設定
 */
public void sendAutoStoreListFormat(CommandSender sender, ItemStack item, boolean isEnabled);
/**
 * givenにsenderがitemを与えたというメッセージを送信する。
 * 
 * @param sender メッセージを送る対象
 * @param given 与えられたプレイヤーの名前
 * @param item プレースホルダーに使われる{@link ItemStack
 * @param amount 与える量
 * @param newAmount 与えた後のストック
 */
public void sendGiveInfoToSender(CommandSender sender, String given, ItemStack item, long amount, long newAmount);
/**
 * target に giver がアイテムを与えたというメッセージを送信する。
 * 
 * @param target アイテムを与えられたプレイヤー
 * @param giver アイテムを与えたプレイヤー
 * @param item プレースホルダーに使われる{@link ItemStack
 * @param amount 与えられた量
 * @param newAmount 与えられた後のストック
 */
public void sendGiveInfoToTarget(CommandSender target, String giver, ItemStack item, long amount, long newAmount);
/**
 * given に sender が item を与えたというメッセージを送信する。
 * 
 * @param sender メッセージを送る対象
 * @param given 与えられたプレイヤーの名前
 * @param item プレースホルダーに使われる{@link ItemStack。与えれたアイテム
 * @param amount 与えた量
 * @param newAmount 与えられた後のストック
 */
public void sendAdminGiveInfoToSender(CommandSender sender, String given, ItemStack item, long amount, long newAmount);
/**
 * target に giver がアイテムを与えたというメッセージを送信する。
 * 
 * @param target アイテムを与えられたプレイヤー
 * @param giver 与えたプレイヤーの名前
 * @param item プレースホルダーに使われる{@link ItemStack
 * @param amount 与えられた量
 * @param newAmount 与えられた後のストック
 */
public void sendAdminGiveInfoToTarget(CommandSender target, String giver, ItemStack item, long amount, long newAmount);
/**
 * ストックが足りなかったというメッセージを送信する。
 * 
 * @param sender メッセージを送る対象
 */
public void sendNotEnoughStock(CommandSender sender);
/**
 * 自分にアイテムを与えようとして失敗したというメッセージを送信する。
 * 
 * @param sender メッセージを送る対象
 */
public void sendCannotGiveMyself(CommandSender sender);
/**
 * プレイヤー限定のコマンドをコンソールが送信したというメッセージを送信する。
 * 
 * @param sender メッセージを送る対象
 */
public void sendPlayerOnly(CommandSender sender);
/**
 * 指定されたプレイヤーが見当たらなかったというメッセージを送信する。
 * 
 * @param sender メッセージを送る対象
 */
public void sendPlayerNotFound(CommandSender sender);
/**
 * ヘルプコマンドで表示されるヘッダを送信する。
 * 
 * @param sender メッセージを送る対象
 */
public void sendHelpHeader(CommandSender sender);
/**
 * ヘルプコマンドで表示される一行を送信する
 * 
 * @param sender メッセージを送る対象
 * @param command ヘルプを表示するコマンド
 * @param description ヘルプを表示するコマンドの説明
 */
public void sendHelpFormat(CommandSender sender, String command, String description);
/**
 * バージョンを送信する。
 * 
 * @param sender メッセージを送る対象
 * @param version バージョン
 */
public void sendVersion(CommandSender sender, String version);
/**
 * リロード成功メッセージを送信する。
 * 
 * @param sender メッセージを送る対象
 */
public void sendReloadSuccess(CommandSender sender);
/**
 * target の item のストックを変更したというメッセージを送信する。
 * 
 * @param sender メッセージを送る対象
 * @param target ストックを変更する対象の名前
 * @param item プレースホルダーに使われる{@link ItemStack
 * @param amount 変更後のストック
 */
public void sendSetInfoToSender(CommandSender sender, String target, ItemStack item, long amount);
/**
 * sender に item のストックを変更されたというメッセージを送信する。
 * 
 * @param target ストックを変更する対象
 * @param sender メッセージを送る対象の名前
 * @param item プレースホルダーに使われる{@link ItemStack
 * @param amount 変更後のストック
 */
public void sendSetInfoToTarget(CommandSender target, String sender, ItemStack item, long amount);
/**
 * target の item のストックを減らしたというメッセージを送信する。
 * 
 * @param sender メッセージを送る対象
 * @param target アイテムを減らす対象の名前
 * @param item プレースホルダーに使われる{@link ItemStack
 * @param amount 減らす量
 * @param newAmount 減らした後の量
 */
public void sendTakeInfoToSender(CommandSender sender, String target, ItemStack item, long amount, long newAmount);
/**
 * sender に item のストックを減らされたというメッセージを送信する。
 * 
 * @param target アイテムを減らす大量
 * @param sender メッセージを送る対象の名前
 * @param item プレースホルダーに使われる{@link ItemStack
 * @param amount 減らした量
 * @param newAmount 減らした後の量
 */
public void sendTakeInfoToTarget(CommandSender target, String sender, ItemStack item, long amount, long newAmount);
/**
 * アイテム情報を含むホバーを送信する。
 * 
 * @param sender メッセージを送る対象
 * @param item プレースホルダーに使われる{@link ItemStack
 */
public void sendItemInfo(CommandSender sender, ItemStack item);
/**
 * 権限がないというメッセージを送信する。
 * 
 * @param sender メッセージを送る対象
 * @param permission 足りなかった権限
 */
public void sendNoPermission(CommandSender sender, String permission);
/**
 * コマンドが成功しなかった時に、コマンドの使い方を送信する。
 * 
 * @param sender メッセージを送る対象
 * @param usage 使い方
 */
public void sendUsage(CommandSender sender, String usage);
/**
 * アイテムのcustomnameが変更されたというメッセージを送信する。
 * 
 * @param sender メッセージを送る対象
 * @param oldName 変更前の名前
 * @param newName 変更後の名前
 */
public void sendItemNameChanged(CommandSender sender, String oldName, String newName);
/**
 * アイテムを手に持っていないので、持ってくださいというメッセージを送信する。
 * 
 * @param sender メッセージを送る対象
 */
public void sendHoldItem(CommandSender sender);
/**
 * アイテムを手に持つか、アイテムをコマンドで指定してくださいというメッセージを送信する。
 * 
 * @param sender メッセージを送る対象
 */
public void sendHoldItemOrSpecifyItem(CommandSender sender);
/**
 * アイテムがデータベースに登録されたというメッセージを送信する。
 * 
 * @param sender メッセージを送る対象
 * @param item プレースホルダーに使われる{@link ItemStack。登録したアイテム
 */
public void sendItemRegistered(CommandSender sender, ItemStack item);
/**
 * アイテムをコマンドで引き出した時にメッセージを送信する。
 * 
 * @param sender メッセージを送る対象
 * @param item プレースホルダーに使われる{@link ItemStack
 * @param amount 引き出したアイテム量
 * @param stock 引き出し後のアイテム量
 */
public void sendWithdrawItem(CommandSender sender, ItemStack item, int amount, int stock);
/**
 * コマンドでアイテムを預けた時にメッセージを送信する。
 * 
 * @param sender メッセージを送る対象
 * @param item プレースホルダーに使われる{@link ItemStack
 * @param amount 預けたアイテム量
 * @param stock 預けた後のアイテム量
 */
public void sendDepositItem(CommandSender sender, ItemStack item, int amount, int stock);
/**
 * 全てのアイテムをコマンドで預けた時にメッセージを送信する。
 * 
 * @param sender メッセージを送る対象
 */
public void sendDepositItemAll(CommandSender sender);
// リフレクションのキャッシュ用変数
// private Class<?> craftItemStackClazz = null;
private Method asNMSCopy = null;
// private Class<?> nmsItemStackClazz = null;
private Method getTag = null;
/** アイテムをチャット欄に表示するためのホバーにし、そのテキストコンポーネントオブジェクトを返す */
private TextComponent toTextComponent(ItemStack itemStack);
