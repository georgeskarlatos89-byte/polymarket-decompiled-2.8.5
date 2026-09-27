package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class o4h {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ o4h[] $VALUES;
    public static final o4h START;
    public static final o4h STOP;
    public static final o4h STOP_AND_RESET_REPLAY_CACHE;

    /* JADX WARN: Type inference failed for: r0v0, types: [o4h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [o4h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [o4h, java.lang.Enum] */
    static {
        ?? r0 = new Enum("START", 0);
        START = r0;
        ?? r1 = new Enum("STOP", 1);
        STOP = r1;
        ?? r2 = new Enum("STOP_AND_RESET_REPLAY_CACHE", 2);
        STOP_AND_RESET_REPLAY_CACHE = r2;
        o4h[] o4hVarArr = {r0, r1, r2};
        $VALUES = o4hVarArr;
        $ENTRIES = new wg7(o4hVarArr);
    }

    public static o4h valueOf(String str) {
        return (o4h) Enum.valueOf(o4h.class, str);
    }

    public static o4h[] values() {
        return (o4h[]) $VALUES.clone();
    }
}
