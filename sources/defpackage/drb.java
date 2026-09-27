package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class drb {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ drb[] $VALUES;
    public static final drb ALL;
    public static final drb BODY;
    public static final drb HEADERS;
    public static final drb INFO;
    public static final drb NONE;
    private final boolean body;
    private final boolean headers;
    private final boolean info;

    static {
        drb drbVar = new drb("ALL", 0, true, true, true);
        ALL = drbVar;
        drb drbVar2 = new drb("HEADERS", 1, true, true, false);
        HEADERS = drbVar2;
        drb drbVar3 = new drb("BODY", 2, true, false, true);
        BODY = drbVar3;
        drb drbVar4 = new drb("INFO", 3, true, false, false);
        INFO = drbVar4;
        drb drbVar5 = new drb("NONE", 4, false, false, false);
        NONE = drbVar5;
        drb[] drbVarArr = {drbVar, drbVar2, drbVar3, drbVar4, drbVar5};
        $VALUES = drbVarArr;
        $ENTRIES = new wg7(drbVarArr);
    }

    public drb(String str, int i, boolean z, boolean z2, boolean z3) {
        this.info = z;
        this.headers = z2;
        this.body = z3;
    }

    public static drb valueOf(String str) {
        return (drb) Enum.valueOf(drb.class, str);
    }

    public static drb[] values() {
        return (drb[]) $VALUES.clone();
    }

    public final boolean a() {
        return this.body;
    }

    public final boolean b() {
        return this.headers;
    }

    public final boolean c() {
        return this.info;
    }
}
