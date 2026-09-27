package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class rce {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ rce[] $VALUES;
    public static final rce Automatic;
    public static final rce Full;
    public static final rce Never;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, rce] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, rce] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, rce] */
    static {
        ?? r0 = new Enum("Automatic", 0);
        Automatic = r0;
        ?? r1 = new Enum("Never", 1);
        Never = r1;
        ?? r2 = new Enum("Full", 2);
        Full = r2;
        rce[] rceVarArr = {r0, r1, r2};
        $VALUES = rceVarArr;
        $ENTRIES = new wg7(rceVarArr);
    }

    public static rce valueOf(String str) {
        return (rce) Enum.valueOf(rce.class, str);
    }

    public static rce[] values() {
        return (rce[]) $VALUES.clone();
    }
}
