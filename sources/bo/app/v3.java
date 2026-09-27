package bo.app;

import io.intercom.android.sdk.models.AttributeType;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public enum v3 {
    INTEGER(AttributeType.INTEGER),
    COLOR("color"),
    BOOLEAN("bool"),
    STRING("string"),
    DRAWABLE_IDENTIFIER("drawable"),
    STRING_ARRAY("array");

    public final String a;

    v3(String str) {
        this.a = str;
    }
}
