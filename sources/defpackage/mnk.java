package defpackage;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import java.io.Serializable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public enum mnk {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(ConstantsKt.UNSET)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(dw1.c),
    ENUM(null),
    MESSAGE(null);

    private final Object defaultDefault;

    mnk(Serializable serializable) {
        this.defaultDefault = serializable;
    }
}
