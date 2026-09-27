package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class peb {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ peb[] $VALUES;
    public static final peb NoRequest;
    public static final peb RequestedNoReuse;
    public static final peb RequestedReuse;
    private final tt4 setupFutureUsage;

    static {
        peb pebVar = new peb(0, tt4.OffSession, "RequestedReuse");
        RequestedReuse = pebVar;
        peb pebVar2 = new peb(1, tt4.Blank, "RequestedNoReuse");
        RequestedNoReuse = pebVar2;
        peb pebVar3 = new peb(2, null, "NoRequest");
        NoRequest = pebVar3;
        peb[] pebVarArr = {pebVar, pebVar2, pebVar3};
        $VALUES = pebVarArr;
        $ENTRIES = new wg7(pebVarArr);
    }

    public peb(int i, tt4 tt4Var, String str) {
        this.setupFutureUsage = tt4Var;
    }

    public static peb valueOf(String str) {
        return (peb) Enum.valueOf(peb.class, str);
    }

    public static peb[] values() {
        return (peb[]) $VALUES.clone();
    }

    public final tt4 a() {
        return this.setupFutureUsage;
    }
}
