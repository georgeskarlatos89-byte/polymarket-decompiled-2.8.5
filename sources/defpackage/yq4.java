package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface yq4 {
    void A(SerialDescriptor serialDescriptor, int i, String str);

    void B(m5f m5fVar, int i, char c);

    void D(SerialDescriptor serialDescriptor, int i, double d);

    void E(SerialDescriptor serialDescriptor, int i, long j);

    void b(SerialDescriptor serialDescriptor);

    void f(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj);

    void h(m5f m5fVar, int i, byte b);

    void i(m5f m5fVar, int i, float f);

    void j(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj);

    void k(m5f m5fVar, int i, short s);

    Encoder q(m5f m5fVar, int i);

    boolean r(SerialDescriptor serialDescriptor);

    void w(int i, int i2, SerialDescriptor serialDescriptor);

    void z(SerialDescriptor serialDescriptor, int i, boolean z);
}
