package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class m55 extends o55 {
    public final KSerializer a;

    public m55(KSerializer kSerializer) {
        this.a = kSerializer;
    }

    @Override // defpackage.o55
    public final KSerializer a(List list) {
        list.getClass();
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof m55) && Intrinsics.areEqual(((m55) obj).a, this.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
