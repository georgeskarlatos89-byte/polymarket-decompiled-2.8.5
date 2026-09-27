package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ceb {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ceb[] $VALUES;
    public static final ceb Filled;
    public static final ceb Outlined;

    /* JADX WARN: Type inference failed for: r0v0, types: [ceb, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ceb, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Filled", 0);
        Filled = r0;
        ?? r1 = new Enum("Outlined", 1);
        Outlined = r1;
        ceb[] cebVarArr = {r0, r1};
        $VALUES = cebVarArr;
        $ENTRIES = new wg7(cebVarArr);
    }

    public static ceb valueOf(String str) {
        return (ceb) Enum.valueOf(ceb.class, str);
    }

    public static ceb[] values() {
        return (ceb[]) $VALUES.clone();
    }
}
