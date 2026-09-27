package kotlinx.serialization.encoding;

import defpackage.sxg;
import defpackage.yq4;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface Encoder {
    void C(int i);

    void F(String str);

    yq4 a(SerialDescriptor serialDescriptor);

    sxg c();

    void e(double d);

    void g(byte b);

    default yq4 l(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return a(serialDescriptor);
    }

    void m(SerialDescriptor serialDescriptor, int i);

    Encoder n(SerialDescriptor serialDescriptor);

    default void o(KSerializer kSerializer, Object obj) {
        kSerializer.getClass();
        kSerializer.serialize(this, obj);
    }

    void p(long j);

    void s();

    void t(short s);

    void u(boolean z);

    void x(float f);

    void y(char c);
}
