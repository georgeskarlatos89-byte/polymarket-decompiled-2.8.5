package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class nte {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ nte[] $VALUES;
    public static final nte Active;
    public static final nte Canceled;
    public static final nte Failed;
    public static final nte Success;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, nte] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, nte] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, nte] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, nte] */
    static {
        ?? r0 = new Enum("Active", 0);
        Active = r0;
        ?? r1 = new Enum("Success", 1);
        Success = r1;
        ?? r2 = new Enum("Failed", 2);
        Failed = r2;
        ?? r3 = new Enum("Canceled", 3);
        Canceled = r3;
        nte[] nteVarArr = {r0, r1, r2, r3};
        $VALUES = nteVarArr;
        $ENTRIES = new wg7(nteVarArr);
    }

    public static nte valueOf(String str) {
        return (nte) Enum.valueOf(nte.class, str);
    }

    public static nte[] values() {
        return (nte[]) $VALUES.clone();
    }
}
