package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.a;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class e9d extends a implements jca {
    public static final e9d a = new a(jca.C0);

    @Override // defpackage.jca
    public final jw6 K(Function1 function1) {
        return g9d.a;
    }

    @Override // defpackage.jca
    public final boolean Y() {
        return false;
    }

    @Override // defpackage.jca
    public final Object e0(Continuation continuation) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.jca
    public final boolean isActive() {
        return true;
    }

    @Override // defpackage.jca
    public final boolean isCancelled() {
        return false;
    }

    @Override // defpackage.jca
    public final t14 j0(w14 w14Var) {
        return g9d.a;
    }

    @Override // defpackage.jca
    public final Sequence p() {
        return ed7.a;
    }

    @Override // defpackage.jca
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.jca
    public final jw6 y(boolean z, boolean z2, Function1 function1) {
        return g9d.a;
    }

    @Override // defpackage.jca
    public final CancellationException z() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.jca
    public final void e(CancellationException cancellationException) {
    }
}
