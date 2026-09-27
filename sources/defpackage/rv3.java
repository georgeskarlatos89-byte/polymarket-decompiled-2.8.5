package defpackage;

import java.io.IOException;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrv3;", "Ljava/io/IOException;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class rv3 extends IOException {
    public final int a;
    public final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv3(String str, int i, int i2, Throwable th) {
        super(str, th);
        str.getClass();
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String message = getMessage();
        StringBuilder n = m51.n(this.a, "streamCode: ", this.b, ", statusCode: ", ", message: ");
        n.append(message);
        return n.toString();
    }
}
