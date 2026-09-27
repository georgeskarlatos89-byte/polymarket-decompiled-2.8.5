package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class h5h {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ h5h[] $VALUES;
    public static final h5h City;
    public static final h5h Line1;
    public static final h5h Line2;
    public static final h5h Phone;
    public static final h5h PostalCode;
    public static final h5h State;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, h5h] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, h5h] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, h5h] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, h5h] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, h5h] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, h5h] */
    static {
        ?? r0 = new Enum("Line1", 0);
        Line1 = r0;
        ?? r1 = new Enum("Line2", 1);
        Line2 = r1;
        ?? r2 = new Enum("City", 2);
        City = r2;
        ?? r3 = new Enum("PostalCode", 3);
        PostalCode = r3;
        ?? r4 = new Enum("State", 4);
        State = r4;
        ?? r5 = new Enum("Phone", 5);
        Phone = r5;
        h5h[] h5hVarArr = {r0, r1, r2, r3, r4, r5};
        $VALUES = h5hVarArr;
        $ENTRIES = new wg7(h5hVarArr);
    }

    public static h5h valueOf(String str) {
        return (h5h) Enum.valueOf(h5h.class, str);
    }

    public static h5h[] values() {
        return (h5h[]) $VALUES.clone();
    }
}
