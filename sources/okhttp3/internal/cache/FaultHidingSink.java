package okhttp3.internal.cache;

import defpackage.ql8;
import defpackage.tp1;
import defpackage.y8h;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0011R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/cache/FaultHidingSink;", "Lql8;", "Ly8h;", "delegate", "Lkotlin/Function1;", "Ljava/io/IOException;", "", "onException", "<init>", "(Ly8h;Lkotlin/jvm/functions/Function1;)V", "Ltp1;", "source", "", "byteCount", "write", "(Ltp1;J)V", "flush", "()V", "close", "Lkotlin/jvm/functions/Function1;", "getOnException", "()Lkotlin/jvm/functions/Function1;", "", "hasErrors", "Z", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public class FaultHidingSink extends ql8 {
    private boolean hasErrors;
    private final Function1<IOException, Unit> onException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaultHidingSink(y8h y8hVar, Function1<? super IOException, Unit> function1) {
        super(y8hVar);
        y8hVar.getClass();
        function1.getClass();
        this.onException = function1;
    }

    @Override // defpackage.ql8, defpackage.y8h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    @Override // defpackage.ql8, defpackage.y8h, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    public final Function1<IOException, Unit> getOnException() {
        return this.onException;
    }

    @Override // defpackage.ql8, defpackage.y8h
    public void write(tp1 source, long byteCount) {
        source.getClass();
        if (this.hasErrors) {
            source.skip(byteCount);
            return;
        }
        try {
            super.write(source, byteCount);
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }
}
