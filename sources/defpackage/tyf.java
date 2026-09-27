package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tyf {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ tyf[] $VALUES;
    public static final tyf CACHE;
    public static final tyf REMOTE;

    /* JADX WARN: Type inference failed for: r0v0, types: [tyf, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [tyf, java.lang.Enum] */
    static {
        ?? r0 = new Enum("CACHE", 0);
        CACHE = r0;
        ?? r1 = new Enum("REMOTE", 1);
        REMOTE = r1;
        tyf[] tyfVarArr = {r0, r1};
        $VALUES = tyfVarArr;
        $ENTRIES = new wg7(tyfVarArr);
    }

    public static tyf valueOf(String str) {
        return (tyf) Enum.valueOf(tyf.class, str);
    }

    public static tyf[] values() {
        return (tyf[]) $VALUES.clone();
    }
}
