package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class aee {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ aee[] $VALUES;
    public static final aee None;
    public static final aee OffSession;
    public static final aee OnSession;

    /* JADX WARN: Type inference failed for: r0v0, types: [aee, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [aee, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [aee, java.lang.Enum] */
    static {
        ?? r0 = new Enum("OnSession", 0);
        OnSession = r0;
        ?? r1 = new Enum("OffSession", 1);
        OffSession = r1;
        ?? r2 = new Enum("None", 2);
        None = r2;
        aee[] aeeVarArr = {r0, r1, r2};
        $VALUES = aeeVarArr;
        $ENTRIES = new wg7(aeeVarArr);
    }

    public static aee valueOf(String str) {
        return (aee) Enum.valueOf(aee.class, str);
    }

    public static aee[] values() {
        return (aee[]) $VALUES.clone();
    }
}
