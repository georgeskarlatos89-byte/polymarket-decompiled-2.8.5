package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class c0h {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ c0h[] $VALUES;
    public static final c0h Idle;
    public static final c0h TaxDocuments;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, c0h] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, c0h] */
    static {
        ?? r0 = new Enum("Idle", 0);
        Idle = r0;
        ?? r1 = new Enum("TaxDocuments", 1);
        TaxDocuments = r1;
        c0h[] c0hVarArr = {r0, r1};
        $VALUES = c0hVarArr;
        $ENTRIES = new wg7(c0hVarArr);
    }

    public static c0h valueOf(String str) {
        return (c0h) Enum.valueOf(c0h.class, str);
    }

    public static c0h[] values() {
        return (c0h[]) $VALUES.clone();
    }
}
