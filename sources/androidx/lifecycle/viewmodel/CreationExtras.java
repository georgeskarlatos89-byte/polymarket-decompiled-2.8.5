package androidx.lifecycle.viewmodel;

import defpackage.ld5;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "", "<init>", "()V", "ld5", "Empty", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CreationExtras {
    public final LinkedHashMap a = new LinkedHashMap();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras$Empty;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Empty extends CreationExtras {
        public static final Empty b = new CreationExtras();

        @Override // androidx.lifecycle.viewmodel.CreationExtras
        public final Object a(ld5 ld5Var) {
            ld5Var.getClass();
            return null;
        }
    }

    public abstract Object a(ld5 ld5Var);

    public final boolean equals(Object obj) {
        if (obj instanceof CreationExtras) {
            if (Intrinsics.areEqual(this.a, ((CreationExtras) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.a + ')';
    }
}
