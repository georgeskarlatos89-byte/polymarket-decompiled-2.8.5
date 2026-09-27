package defpackage;

import java.io.IOException;
import java.net.ConnectException;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldw4;", "Ljava/net/ConnectException;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class dw4 extends ConnectException {
    public final IOException a;

    public dw4(String str, IOException iOException) {
        super(str);
        this.a = iOException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
