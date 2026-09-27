package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class sbh {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ sbh[] $VALUES;
    public static final sbh ActionPerformed;
    public static final sbh Dismissed;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, sbh] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, sbh] */
    static {
        ?? r0 = new Enum("Dismissed", 0);
        Dismissed = r0;
        ?? r1 = new Enum("ActionPerformed", 1);
        ActionPerformed = r1;
        sbh[] sbhVarArr = {r0, r1};
        $VALUES = sbhVarArr;
        $ENTRIES = new wg7(sbhVarArr);
    }

    public static sbh valueOf(String str) {
        return (sbh) Enum.valueOf(sbh.class, str);
    }

    public static sbh[] values() {
        return (sbh[]) $VALUES.clone();
    }
}
