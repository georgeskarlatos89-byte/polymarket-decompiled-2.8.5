package defpackage;

import com.socure.docv.capturesdk.common.utils.ApiConstant;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class gtg {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ gtg[] $VALUES;
    public static final gtg Camera;
    public static final gtg Captured;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, gtg] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, gtg] */
    static {
        ?? r0 = new Enum(ApiConstant.COLLECTION_METHOD_CAMERA, 0);
        Camera = r0;
        ?? r1 = new Enum("Captured", 1);
        Captured = r1;
        gtg[] gtgVarArr = {r0, r1};
        $VALUES = gtgVarArr;
        $ENTRIES = new wg7(gtgVarArr);
    }

    public static gtg valueOf(String str) {
        return (gtg) Enum.valueOf(gtg.class, str);
    }

    public static gtg[] values() {
        return (gtg[]) $VALUES.clone();
    }
}
