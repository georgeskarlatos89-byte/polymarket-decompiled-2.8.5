package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class nrb {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ nrb[] $VALUES;
    public static final nrb EMAIL;
    private final String dimension = "email";

    static {
        nrb nrbVar = new nrb();
        EMAIL = nrbVar;
        nrb[] nrbVarArr = {nrbVar};
        $VALUES = nrbVarArr;
        $ENTRIES = new wg7(nrbVarArr);
    }

    public static nrb valueOf(String str) {
        return (nrb) Enum.valueOf(nrb.class, str);
    }

    public static nrb[] values() {
        return (nrb[]) $VALUES.clone();
    }

    public final String a() {
        return this.dimension;
    }
}
