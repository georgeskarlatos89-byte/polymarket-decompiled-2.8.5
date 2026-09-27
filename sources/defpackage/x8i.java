package defpackage;

import io.ably.lib.http.HttpConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class x8i {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ x8i[] $VALUES;
    public static final x8i DELETE;
    public static final x8i GET;
    public static final x8i POST;
    private final String code;

    static {
        x8i x8iVar = new x8i(HttpConstants.Methods.GET, 0, HttpConstants.Methods.GET);
        GET = x8iVar;
        x8i x8iVar2 = new x8i(HttpConstants.Methods.POST, 1, HttpConstants.Methods.POST);
        POST = x8iVar2;
        x8i x8iVar3 = new x8i(HttpConstants.Methods.DELETE, 2, HttpConstants.Methods.DELETE);
        DELETE = x8iVar3;
        x8i[] x8iVarArr = {x8iVar, x8iVar2, x8iVar3};
        $VALUES = x8iVarArr;
        $ENTRIES = new wg7(x8iVarArr);
    }

    public x8i(String str, int i, String str2) {
        this.code = str2;
    }

    public static x8i valueOf(String str) {
        return (x8i) Enum.valueOf(x8i.class, str);
    }

    public static x8i[] values() {
        return (x8i[]) $VALUES.clone();
    }

    public final String a() {
        return this.code;
    }
}
