package defpackage;

import io.ably.lib.http.HttpConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class oe9 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ oe9[] $VALUES;
    public static final oe9 DELETE;
    public static final oe9 GET;
    public static final oe9 PATCH;
    public static final oe9 POST;
    public static final oe9 PUT;

    /* JADX WARN: Type inference failed for: r0v0, types: [oe9, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [oe9, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [oe9, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [oe9, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [oe9, java.lang.Enum] */
    static {
        ?? r0 = new Enum(HttpConstants.Methods.GET, 0);
        GET = r0;
        ?? r1 = new Enum(HttpConstants.Methods.POST, 1);
        POST = r1;
        ?? r2 = new Enum(HttpConstants.Methods.PUT, 2);
        PUT = r2;
        ?? r3 = new Enum(HttpConstants.Methods.DELETE, 3);
        DELETE = r3;
        ?? r4 = new Enum(HttpConstants.Methods.PATCH, 4);
        PATCH = r4;
        oe9[] oe9VarArr = {r0, r1, r2, r3, r4};
        $VALUES = oe9VarArr;
        $ENTRIES = new wg7(oe9VarArr);
    }

    public static oe9 valueOf(String str) {
        return (oe9) Enum.valueOf(oe9.class, str);
    }

    public static oe9[] values() {
        return (oe9[]) $VALUES.clone();
    }
}
