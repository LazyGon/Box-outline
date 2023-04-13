// class Database;

// 変数
/** HikariDataSourceクラス (データベースライブラリHikariCPのクラス) */
private final HikariDataSource hikari;
/** trueでSQLite、falseでMySQLのsql文を選択するよう制御するbool値 */
private final boolean isSQLite;

// メソッド
/**
 * 初期設定でSQLiteに接続する。
 * 
 * @param dbPath SQLiteのデータファイルのパス
 * @throws SQLException Connectionの生成中に例外が発生した場合
 */
Database(Path dbPath) throws SQLException;
/**
 * 推奨設定でMySQLに接続する。
 * 参照: https://github.com/brettwooldridge/HikariCP/wiki/MySQL-Configuration
 * 
 * @param host ホスト
 * @param port ポート
 * @param user ユーザー
 * @param password パスワード
 * @param dbName   データベースの名前
 * @throws SQLExceptionConnectionの生成中に例外が発生した場合
 */
Database(String host, int port, String user, String password, String dbName) throws SQLException;
/** isSQLiteを返す */
public boolean isSQLite();
/**
 * 指定したstatementを実行する。
 * 
 * @param SQL 実行するSQL文。メソッド内でPreparedStatementに変換される。
 * @return SQL文の実行に成功したかどうか
 */
boolean execute(String SQL);
/**
 * 指定したstatementを実行し、結果を第二引数で処理する。第二引数の処理が終わった後に、ResultSetはクローズされる。
 * 
 * @param SQL 実行するSQL文。メソッド内でPreparedStatementに変換される。
 * @param function 実行結果を受け取る関数。
 * @return fuctionの処理結果
 */
<T> T query(String SQL, Function<ResultSet, T> function);
/** データベースのコネを取得する */
Connection getConnection() throws SQLException;
/**
 * データベースのコネクションプールやコネクションを閉じる。
 */
void dispose();


