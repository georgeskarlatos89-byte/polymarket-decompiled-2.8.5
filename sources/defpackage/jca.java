package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface jca extends CoroutineContext.Element {
    public static final ica C0 = ica.a;

    jw6 K(Function1 function1);

    boolean Y();

    void e(CancellationException cancellationException);

    Object e0(Continuation continuation);

    boolean isActive();

    boolean isCancelled();

    t14 j0(w14 w14Var);

    Sequence p();

    boolean start();

    jw6 y(boolean z, boolean z2, Function1 function1);

    CancellationException z();
}
