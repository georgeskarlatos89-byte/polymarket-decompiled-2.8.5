package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class e9b {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ e9b[] $VALUES;
    public static final e9b Away;
    public static final e9b Home;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, e9b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, e9b] */
    static {
        ?? r0 = new Enum("Home", 0);
        Home = r0;
        ?? r1 = new Enum("Away", 1);
        Away = r1;
        e9b[] e9bVarArr = {r0, r1};
        $VALUES = e9bVarArr;
        $ENTRIES = new wg7(e9bVarArr);
    }

    public static e9b valueOf(String str) {
        return (e9b) Enum.valueOf(e9b.class, str);
    }

    public static e9b[] values() {
        return (e9b[]) $VALUES.clone();
    }
}
