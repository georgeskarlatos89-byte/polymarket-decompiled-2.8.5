package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class m5f extends fjb {
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5f(SerialDescriptor serialDescriptor) {
        super(serialDescriptor);
        serialDescriptor.getClass();
        this.b = serialDescriptor.h() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h() {
        return this.b;
    }
}
