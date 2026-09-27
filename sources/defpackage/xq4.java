package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface xq4 {
    Object B(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj);

    double C(SerialDescriptor serialDescriptor, int i);

    Object D(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj);

    void b(SerialDescriptor serialDescriptor);

    sxg c();

    Decoder e(m5f m5fVar, int i);

    long g(SerialDescriptor serialDescriptor, int i);

    char h(m5f m5fVar, int i);

    float i(m5f m5fVar, int i);

    byte k(m5f m5fVar, int i);

    int m(SerialDescriptor serialDescriptor, int i);

    String o(SerialDescriptor serialDescriptor, int i);

    int p(SerialDescriptor serialDescriptor);

    short x(m5f m5fVar, int i);

    boolean z(SerialDescriptor serialDescriptor, int i);
}
