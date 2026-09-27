package defpackage;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum lnk {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(ConstantsKt.UNSET)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(gw1.a),
    ENUM(null),
    MESSAGE(null);

    private final Object defaultDefault;

    lnk(Object obj) {
        this.defaultDefault = obj;
    }
}
