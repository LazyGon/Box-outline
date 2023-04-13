/** 
 * リフレクションを使ってサーバーの内部コードにアクセスするクラス
 * このプラグインでは、アイテムの本来触ることができない内部データにアクセスするのに使用
 */
// // public final class ReflectionUtil

/** サーバーのバージョン文字列 */
private static String versionString;
// /** Class.forName(String name) で読み込まれた、サーバー内部クラス(net.minecraft.server)のキャッシュ */
// private static Map<String, Class<?>> loadedNMSClasses;
// /** Class.forName(String name) で読み込まれた、サーバー内部クラス(org.bukkit.craftbukkit)のキャッシュ */
// private static Map<String, Class<?>> loadedOBCClasses;
/** クラスオブジェクトから取得したメソッドオブジェクトのキャッシュ */
// private static Map<Class<?>, Map<String, Method>> loadedMethods;
/** クラスオブジェクトから取得したフィールドオブジェクトのキャッシュ */
// private static Map<Class<?>, Map<String, Field>> loadedFields;

// /** サーバーAPIのgetClassから、内部実装クラスのバージョニングを切り出すメソッド */
public static String getVersion();
/** サーバー内部クラス(net.minecraft.server)のクラスを取得する */
// public static Class<?> getNMSClass(String nmsClassName);
/** サーバー内部クラス(org.bukkit.craftbukkit)のクラスを取得する */
// public synchronized static Class<?> getOBCClass(String obcClassName);
// public static Constructor<?> getConstructor(@NotNull Class<?> clazz, Class<?>... params);
// public static Method getMethod(@NotNull Class<?> clazz, @NotNull String methodName, Class<?>... params);
// public static Field getField(@NotNull Class<?> clazz, @NotNull String fieldName);
