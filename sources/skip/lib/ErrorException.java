package skip.lib;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nB\u0013\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\u000bB\u0013\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lskip/lib/ErrorException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lskip/lib/Error;", "<init>", "()V", "message", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/String;)V", "(Ljava/lang/Throwable;)V", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ErrorException extends Exception implements Error {
    public ErrorException() {
    }

    @Override // skip.lib.Error
    public String getLocalizedDescription() {
        return super.getLocalizedDescription();
    }

    public ErrorException(String str, Throwable th) {
        super(str, th);
    }

    public ErrorException(String str) {
        super(str);
    }

    public ErrorException(Throwable th) {
        super(th);
    }
}
