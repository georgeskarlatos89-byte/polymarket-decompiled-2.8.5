package kotlinx.serialization.encoding;

import defpackage.xq4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface Decoder {
    boolean A();

    byte E();

    xq4 a(SerialDescriptor serialDescriptor);

    int f(SerialDescriptor serialDescriptor);

    int l();

    long n();

    default Object q(KSerializer kSerializer) {
        kSerializer.getClass();
        return kSerializer.deserialize(this);
    }

    Decoder r(SerialDescriptor serialDescriptor);

    short s();

    float t();

    double u();

    boolean v();

    char w();

    String y();
}
