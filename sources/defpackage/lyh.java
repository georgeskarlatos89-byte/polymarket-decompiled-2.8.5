package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class lyh {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ lyh[] $VALUES;
    public static final lyh Away;
    public static final lyh Home;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, lyh] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, lyh] */
    static {
        ?? r0 = new Enum("Home", 0);
        Home = r0;
        ?? r1 = new Enum("Away", 1);
        Away = r1;
        lyh[] lyhVarArr = {r0, r1};
        $VALUES = lyhVarArr;
        $ENTRIES = new wg7(lyhVarArr);
    }

    public static lyh valueOf(String str) {
        return (lyh) Enum.valueOf(lyh.class, str);
    }

    public static lyh[] values() {
        return (lyh[]) $VALUES.clone();
    }
}
