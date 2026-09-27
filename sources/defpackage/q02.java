package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class q02 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ q02[] $VALUES;
    public static final q02 Medium;
    private final float frameSize = 24.0f;
    private final float contentSize = 20.0f;
    private final float iconSize = 16.0f;

    static {
        q02 q02Var = new q02();
        Medium = q02Var;
        q02[] q02VarArr = {q02Var};
        $VALUES = q02VarArr;
        $ENTRIES = new wg7(q02VarArr);
    }

    public static q02 valueOf(String str) {
        return (q02) Enum.valueOf(q02.class, str);
    }

    public static q02[] values() {
        return (q02[]) $VALUES.clone();
    }

    public final float a() {
        return this.contentSize;
    }

    public final float b() {
        return this.frameSize;
    }

    public final float c() {
        return this.iconSize;
    }
}
