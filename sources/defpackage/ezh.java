package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ezh {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ezh[] $VALUES;
    public static final ezh V3;
    private final int rawValue = 3;

    static {
        ezh ezhVar = new ezh();
        V3 = ezhVar;
        ezh[] ezhVarArr = {ezhVar};
        $VALUES = ezhVarArr;
        $ENTRIES = new wg7(ezhVarArr);
    }

    public static ezh valueOf(String str) {
        return (ezh) Enum.valueOf(ezh.class, str);
    }

    public static ezh[] values() {
        return (ezh[]) $VALUES.clone();
    }

    public final int a() {
        return this.rawValue;
    }
}
