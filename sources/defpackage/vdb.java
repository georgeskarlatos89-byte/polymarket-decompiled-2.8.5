package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class vdb {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ vdb[] $VALUES;
    public static final vdb RequiresSignUp;
    public static final vdb RequiresVerification;
    public static final vdb Verified;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, vdb] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, vdb] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, vdb] */
    static {
        ?? r0 = new Enum("RequiresSignUp", 0);
        RequiresSignUp = r0;
        ?? r1 = new Enum("RequiresVerification", 1);
        RequiresVerification = r1;
        ?? r2 = new Enum("Verified", 2);
        Verified = r2;
        vdb[] vdbVarArr = {r0, r1, r2};
        $VALUES = vdbVarArr;
        $ENTRIES = new wg7(vdbVarArr);
    }

    public static vdb valueOf(String str) {
        return (vdb) Enum.valueOf(vdb.class, str);
    }

    public static vdb[] values() {
        return (vdb[]) $VALUES.clone();
    }
}
