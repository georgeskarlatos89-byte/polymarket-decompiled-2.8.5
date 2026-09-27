package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class sk0 extends fjb {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sk0(SerialDescriptor serialDescriptor, int i) {
        super(serialDescriptor);
        this.b = i;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h() {
        switch (this.b) {
            case 0:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.ArrayList";
            case 2:
                return "kotlin.collections.HashSet";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
