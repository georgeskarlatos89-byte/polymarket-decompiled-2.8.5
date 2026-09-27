package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class d10 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ d10[] $VALUES;
    public static final d10 SHOW_ORIGINAL;
    public static final d10 SHOW_TRANSLATED;

    /* JADX WARN: Type inference failed for: r0v0, types: [d10, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [d10, java.lang.Enum] */
    static {
        ?? r0 = new Enum("SHOW_ORIGINAL", 0);
        SHOW_ORIGINAL = r0;
        ?? r1 = new Enum("SHOW_TRANSLATED", 1);
        SHOW_TRANSLATED = r1;
        d10[] d10VarArr = {r0, r1};
        $VALUES = d10VarArr;
        $ENTRIES = new wg7(d10VarArr);
    }

    public static d10 valueOf(String str) {
        return (d10) Enum.valueOf(d10.class, str);
    }

    public static d10[] values() {
        return (d10[]) $VALUES.clone();
    }
}
