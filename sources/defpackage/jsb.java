package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jsb {
    public static final jsb CARD_METADATA_RESPONSE_ERROR;
    public static final jsb CARD_METADATA_RESPONSE_FAILURE;
    public static final jsb CARD_METADATA_RESPONSE_SUCCESS;
    private static final /* synthetic */ jsb[] a;
    private static final /* synthetic */ ug7 b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, jsb] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, jsb] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, jsb] */
    static {
        ?? r0 = new Enum("CARD_METADATA_RESPONSE_SUCCESS", 0);
        CARD_METADATA_RESPONSE_SUCCESS = r0;
        ?? r1 = new Enum("CARD_METADATA_RESPONSE_FAILURE", 1);
        CARD_METADATA_RESPONSE_FAILURE = r1;
        ?? r2 = new Enum("CARD_METADATA_RESPONSE_ERROR", 2);
        CARD_METADATA_RESPONSE_ERROR = r2;
        jsb[] jsbVarArr = {r0, r1, r2};
        a = jsbVarArr;
        b = new wg7(jsbVarArr);
    }

    public static jsb valueOf(String str) {
        return (jsb) Enum.valueOf(jsb.class, str);
    }

    public static jsb[] values() {
        return (jsb[]) a.clone();
    }
}
