package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class fhb {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ fhb[] $VALUES;
    public static final fhb AlongsideSaveForFutureUse;
    public static final fhb InsteadOfSaveForFutureUse;

    /* JADX WARN: Type inference failed for: r0v0, types: [fhb, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [fhb, java.lang.Enum] */
    static {
        ?? r0 = new Enum("InsteadOfSaveForFutureUse", 0);
        InsteadOfSaveForFutureUse = r0;
        ?? r1 = new Enum("AlongsideSaveForFutureUse", 1);
        AlongsideSaveForFutureUse = r1;
        fhb[] fhbVarArr = {r0, r1};
        $VALUES = fhbVarArr;
        $ENTRIES = new wg7(fhbVarArr);
    }

    public static fhb valueOf(String str) {
        return (fhb) Enum.valueOf(fhb.class, str);
    }

    public static fhb[] values() {
        return (fhb[]) $VALUES.clone();
    }
}
