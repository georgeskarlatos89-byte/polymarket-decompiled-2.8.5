package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class tr2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ tr2[] $VALUES;
    public static final tr2 Frosted;
    public static final tr2 Solid;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, tr2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, tr2] */
    static {
        ?? r0 = new Enum("Frosted", 0);
        Frosted = r0;
        ?? r1 = new Enum("Solid", 1);
        Solid = r1;
        tr2[] tr2VarArr = {r0, r1};
        $VALUES = tr2VarArr;
        $ENTRIES = new wg7(tr2VarArr);
    }

    public static tr2 valueOf(String str) {
        return (tr2) Enum.valueOf(tr2.class, str);
    }

    public static tr2[] values() {
        return (tr2[]) $VALUES.clone();
    }
}
