package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, d2 = {"Lc3j;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Ly65;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class c3j extends CancellationException implements y65 {
    public final transient jca a;

    public c3j(jca jcaVar, String str) {
        super(str);
        this.a = jcaVar;
    }

    @Override // defpackage.y65
    public final Throwable a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        c3j c3jVar = new c3j(this.a, message);
        c3jVar.initCause(this);
        return c3jVar;
    }
}
