package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Looe;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ooe extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(svm.a);
        return this;
    }
}
