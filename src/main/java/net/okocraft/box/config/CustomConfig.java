/** サーバーAPIの提供する、yamlを設定ファイルとして扱うためのクラスのホルダー */
// abstract class CustomConfig

// 変数
/** メインクラスのインスタンス */
private final Box plugin;
/** yamlのファイル */
private final File file;
/** 設定名 */
private final String name;
/** サーバーAPIの提供する、yamlを読み込んで値にアクセスするクラス */
private FileConfiguration config;

// メソッド
/** 設定名を指定した変数初期化と、fileがディレクトリでないかをチェックする */
CustomConfig(String name);
/** ファイルを指定した以外は同上 */
CustomConfig(File file);
/** 必要ならリロードしてconfigを返す */
protected FileConfiguration get();
/** saveDefaultを試した後、ディレクトリに設定ファイルがあればその値を読み込む */
public void reload();
/** saveDefault ... プラグインのjarからデフォルト設定ファイルを読みだして、データフォルダディレクトリに保存する */
protected void saveDefault();
/** 現在メモリ上にある設定値をyamlファイルに保存する */
protected void save();
