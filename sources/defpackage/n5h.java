package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class n5h {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ n5h[] $VALUES;
    public static final n5h Away;
    public static final n5h Home;

    /* JADX WARN: Type inference failed for: r0v0, types: [n5h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [n5h, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Home", 0);
        Home = r0;
        ?? r1 = new Enum("Away", 1);
        Away = r1;
        n5h[] n5hVarArr = {r0, r1};
        $VALUES = n5hVarArr;
        $ENTRIES = new wg7(n5hVarArr);
    }

    public static n5h valueOf(String str) {
        return (n5h) Enum.valueOf(n5h.class, str);
    }

    public static n5h[] values() {
        return (n5h[]) $VALUES.clone();
    }
}
