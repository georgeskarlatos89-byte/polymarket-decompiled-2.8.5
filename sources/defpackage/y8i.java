package defpackage;

import io.ably.lib.http.HttpConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class y8i {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ y8i[] $VALUES;
    public static final y8i Form;
    public static final y8i Json;
    public static final y8i MultipartForm;
    private final String code;

    static {
        y8i y8iVar = new y8i("Form", 0, HttpConstants.ContentTypes.FORM_ENCODING);
        Form = y8iVar;
        y8i y8iVar2 = new y8i("MultipartForm", 1, "multipart/form-data");
        MultipartForm = y8iVar2;
        y8i y8iVar3 = new y8i("Json", 2, "application/json");
        Json = y8iVar3;
        y8i[] y8iVarArr = {y8iVar, y8iVar2, y8iVar3};
        $VALUES = y8iVarArr;
        $ENTRIES = new wg7(y8iVarArr);
    }

    public y8i(String str, int i, String str2) {
        this.code = str2;
    }

    public static y8i valueOf(String str) {
        return (y8i) Enum.valueOf(y8i.class, str);
    }

    public static y8i[] values() {
        return (y8i[]) $VALUES.clone();
    }

    public final String a() {
        return this.code;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.code;
    }
}
