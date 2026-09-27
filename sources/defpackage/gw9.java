package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class gw9 extends dse {
    public final boolean l;

    public gw9(String str, hw9 hw9Var) {
        super(str, hw9Var, 1);
        this.l = true;
    }

    @Override // defpackage.dse
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gw9) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (Intrinsics.areEqual(this.a, serialDescriptor.h())) {
                    gw9 gw9Var = (gw9) obj;
                    if (gw9Var.l && Arrays.equals((SerialDescriptor[]) this.j.getValue(), (SerialDescriptor[]) gw9Var.j.getValue())) {
                        int d = serialDescriptor.d();
                        int i = this.c;
                        if (i == d) {
                            for (int i2 = 0; i2 < i; i2++) {
                                if (Intrinsics.areEqual(g(i2).h(), serialDescriptor.g(i2).h()) && Intrinsics.areEqual(g(i2).getKind(), serialDescriptor.g(i2).getKind())) {
                                }
                            }
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.dse
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // defpackage.dse, kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.l;
    }
}
