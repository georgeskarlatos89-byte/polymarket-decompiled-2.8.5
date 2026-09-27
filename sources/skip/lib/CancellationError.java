package skip.lib;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lskip/lib/CancellationError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lskip/lib/Error;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CancellationError extends Exception implements Error {
    public /* synthetic */ CancellationError(Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : th);
    }

    @Override // skip.lib.Error
    public String getLocalizedDescription() {
        return super.getLocalizedDescription();
    }

    public CancellationError(Throwable th) {
        super(th);
    }

    public CancellationError() {
        this(null, 1, null);
    }
}
