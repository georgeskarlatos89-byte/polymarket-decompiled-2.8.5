package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class mbe {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ mbe[] $VALUES;
    public static final mbe NoRequest;
    public static final mbe RequestNoReuse;
    public static final mbe RequestReuse;
    private final tt4 setupFutureUsage;

    static {
        mbe mbeVar = new mbe(0, tt4.OffSession, "RequestReuse");
        RequestReuse = mbeVar;
        mbe mbeVar2 = new mbe(1, tt4.Blank, "RequestNoReuse");
        RequestNoReuse = mbeVar2;
        mbe mbeVar3 = new mbe(2, null, "NoRequest");
        NoRequest = mbeVar3;
        mbe[] mbeVarArr = {mbeVar, mbeVar2, mbeVar3};
        $VALUES = mbeVarArr;
        $ENTRIES = new wg7(mbeVarArr);
    }

    public mbe(int i, tt4 tt4Var, String str) {
        this.setupFutureUsage = tt4Var;
    }

    public static mbe valueOf(String str) {
        return (mbe) Enum.valueOf(mbe.class, str);
    }

    public static mbe[] values() {
        return (mbe[]) $VALUES.clone();
    }

    public final tt4 a() {
        return this.setupFutureUsage;
    }
}
