package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class bue {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ bue[] $VALUES;
    public static final bue Idle;
    public static final bue Loading;
    public static final bue Success;

    /* JADX WARN: Type inference failed for: r0v0, types: [bue, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [bue, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [bue, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Idle", 0);
        Idle = r0;
        ?? r1 = new Enum("Loading", 1);
        Loading = r1;
        ?? r2 = new Enum("Success", 2);
        Success = r2;
        bue[] bueVarArr = {r0, r1, r2};
        $VALUES = bueVarArr;
        $ENTRIES = new wg7(bueVarArr);
    }

    public static bue valueOf(String str) {
        return (bue) Enum.valueOf(bue.class, str);
    }

    public static bue[] values() {
        return (bue[]) $VALUES.clone();
    }
}
