package skip.lib;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"aserror", "Lskip/lib/Error;", "", "SkipLib"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ErrorKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final Error aserror(Throwable th) {
        th.getClass();
        if (th instanceof Error) {
            return (Error) th;
        }
        return new ErrorException(th);
    }
}
