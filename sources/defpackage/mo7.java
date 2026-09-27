package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class mo7 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ mo7[] $VALUES;
    public static final mo7 CardAdded;
    public static final mo7 CardCollection;
    public static final mo7 Confirmation;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, mo7] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, mo7] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, mo7] */
    static {
        ?? r0 = new Enum("CardCollection", 0);
        CardCollection = r0;
        ?? r1 = new Enum("CardAdded", 1);
        CardAdded = r1;
        ?? r2 = new Enum("Confirmation", 2);
        Confirmation = r2;
        mo7[] mo7VarArr = {r0, r1, r2};
        $VALUES = mo7VarArr;
        $ENTRIES = new wg7(mo7VarArr);
    }

    public static mo7 valueOf(String str) {
        return (mo7) Enum.valueOf(mo7.class, str);
    }

    public static mo7[] values() {
        return (mo7[]) $VALUES.clone();
    }
}
