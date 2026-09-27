package defpackage;

import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface us8 extends KSerializer {
    KSerializer[] childSerializers();

    default KSerializer[] typeParametersSerializers() {
        return iwm.a;
    }
}
