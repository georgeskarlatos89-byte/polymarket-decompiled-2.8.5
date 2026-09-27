package defpackage;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class xbd {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ xbd[] $VALUES;
    public static final xbd DENIED;
    public static final xbd GRANTED;
    public static final xbd RATIONALE_NEEDED;
    public static final xbd REQUESTED;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, xbd] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, xbd] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, xbd] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, xbd] */
    static {
        ?? r0 = new Enum("REQUESTED", 0);
        REQUESTED = r0;
        ?? r1 = new Enum("GRANTED", 1);
        GRANTED = r1;
        ?? r2 = new Enum(ConstantsKt.DENIED, 2);
        DENIED = r2;
        ?? r3 = new Enum("RATIONALE_NEEDED", 3);
        RATIONALE_NEEDED = r3;
        xbd[] xbdVarArr = {r0, r1, r2, r3};
        $VALUES = xbdVarArr;
        $ENTRIES = new wg7(xbdVarArr);
    }

    public static xbd valueOf(String str) {
        return (xbd) Enum.valueOf(xbd.class, str);
    }

    public static xbd[] values() {
        return (xbd[]) $VALUES.clone();
    }
}
