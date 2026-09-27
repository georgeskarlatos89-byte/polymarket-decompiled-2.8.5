package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ypb {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ypb[] $VALUES;
    public static final ypb Denied;
    public static final ypb Granted;
    public static final ypb NotRequested;
    public static final ypb PermanentlyDenied;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ypb] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ypb] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ypb] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, ypb] */
    static {
        ?? r0 = new Enum("NotRequested", 0);
        NotRequested = r0;
        ?? r1 = new Enum("Denied", 1);
        Denied = r1;
        ?? r2 = new Enum("PermanentlyDenied", 2);
        PermanentlyDenied = r2;
        ?? r3 = new Enum("Granted", 3);
        Granted = r3;
        ypb[] ypbVarArr = {r0, r1, r2, r3};
        $VALUES = ypbVarArr;
        $ENTRIES = new wg7(ypbVarArr);
    }

    public static ypb valueOf(String str) {
        return (ypb) Enum.valueOf(ypb.class, str);
    }

    public static ypb[] values() {
        return (ypb[]) $VALUES.clone();
    }
}
