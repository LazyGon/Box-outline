/** イベント処理によって、仮想インベントリに入っている種を利用した苗の自動植え替えを実現する。　*/
// // public class Replant implements Listener;

// 変数
/** メインクラスのインスタンス */
private final Box plugin;
/** 全般設定 */
private final Config config;
/** プレイヤーデータアクセサ */
private final PlayerData playerData;

/**
 * 植え直しを行うべきアイテムの種類のマップ
 * key: ブロック状態でのMaterial, value: アイテム状態でのMaterial
 */
private static final Map<Material, Material> PLANTS;
/** PLANTSの中でも木のブロック/アイテムについてのマップ */
private static final Map<Material, Material> TREES;

/** このクラスのイベント処理が行われるようにサーバーにこのクラスを登録する */
public void start();
/**
 * PLANTSやTREESを用いて、破壊したブロックが作物か判定し、作物だったら植え直すリスナ
 * また、破壊しようとした作物が成長しきっていない場合は破壊をキャンセルする
 */
public void onBlockBreak(BlockBreakEvent event);
/** 仮想インベントリに種が入っているかどうかを判定し、植え直しを行うメソッド */
private void replantSeed(BlockBreakEvent event);
/** 仮想インベントリに苗木が入っているかどうか判定し、植え直しを行うメソッド */
private void replantSapling(Block tree);
/** 作物が成長しきっているか判定するメソッド */
private boolean isYoungPlant(Block plant);
/** 破壊したブロックが作物が植わっているブロックかどうかを判定するメソッド */
private boolean isFarmLand(Block farmLand);
/** 仮想インベントリにコーラスフラワーが入っているかどうか判定し、コーラスフルーツの植え直しを行うメソッド */
private void replantChorus(Block chorus);
/** 仮想インベントリから種となるアイテムを引き出すメソッド */
private void takeSeed(Player player, Material seed);
/** 仮想インベントリに種となるアイテムが入っているか判定するメソッド */
private boolean hasSeed(Player player, Material seed);

