package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class i93 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ i93[] $VALUES;
    public static final i93 Cvc;
    public static final i93 Expiry;
    public static final i93 Number;
    public static final i93 Postal;

    /* JADX WARN: Type inference failed for: r0v0, types: [i93, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [i93, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [i93, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [i93, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Number", 0);
        Number = r0;
        ?? r1 = new Enum("Expiry", 1);
        Expiry = r1;
        ?? r2 = new Enum("Cvc", 2);
        Cvc = r2;
        ?? r3 = new Enum("Postal", 3);
        Postal = r3;
        i93[] i93VarArr = {r0, r1, r2, r3};
        $VALUES = i93VarArr;
        $ENTRIES = new wg7(i93VarArr);
    }

    public static i93 valueOf(String str) {
        return (i93) Enum.valueOf(i93.class, str);
    }

    public static i93[] values() {
        return (i93[]) $VALUES.clone();
    }
}
