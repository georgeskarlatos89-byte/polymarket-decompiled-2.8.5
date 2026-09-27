package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class tg7 extends dse {
    public final cxg l;
    public final Lazy m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg7(String str, int i) {
        super(str, null, i);
        str.getClass();
        this.l = cxg.g;
        this.m = LazyKt.lazy(new d22(i, str, this));
    }

    @Override // defpackage.dse
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof SerialDescriptor)) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (serialDescriptor.getKind() != cxg.g || !Intrinsics.areEqual(this.a, serialDescriptor.h()) || !Intrinsics.areEqual(dwm.a(this), dwm.a(serialDescriptor))) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.dse, kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor g(int i) {
        return ((SerialDescriptor[]) this.m.getValue())[i];
    }

    @Override // defpackage.dse, kotlinx.serialization.descriptors.SerialDescriptor
    public final o5l getKind() {
        return this.l;
    }

    @Override // defpackage.dse
    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode();
        i3 i3Var = new i3(this);
        int i2 = 1;
        while (i3Var.hasNext()) {
            int i3 = i2 * 31;
            String str = (String) i3Var.next();
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            i2 = i3 + i;
        }
        return (hashCode * 31) + i2;
    }

    @Override // defpackage.dse
    public final String toString() {
        return CollectionsKt.N(new sl0(this, 4), ", ", m51.m(new StringBuilder(), this.a, '('), ")", null, 56);
    }
}
