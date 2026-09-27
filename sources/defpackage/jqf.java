package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jqf implements p9h {
    public final b9h a;

    public jqf(b9h b9hVar) {
        this.a = b9hVar;
    }

    @Override // defpackage.p9h
    public final Object d(Continuation continuation) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jqf) {
                if (Intrinsics.areEqual(this.a, ((jqf) obj).a)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
