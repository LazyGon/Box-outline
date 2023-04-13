/** 管理者コマンドの基底クラス。BaseCommandと異なるのはgetDescriptionのみ */
// class BaseAdminCommand extends BaseCommand 

// メソッド
/** ただただsuperにリダイレクトする */
protected BaseAdminCommand(String name, String permissionNode, int leastArgLength, boolean isPlayerOnly, String usage, String[] alias);

/** アドミンコマンド専用のキーを用いてmessagesから説明文字列を呼び出す */
public String getDescription();
