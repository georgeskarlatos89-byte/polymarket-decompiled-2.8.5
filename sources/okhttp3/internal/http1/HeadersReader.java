package okhttp3.internal.http1;

import defpackage.kq1;
import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.internal._HeadersCommonKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/http1/HeadersReader;", "", "Lkq1;", "source", "<init>", "(Lkq1;)V", "", "readLine", "()Ljava/lang/String;", "Lokhttp3/Headers;", "readHeaders", "()Lokhttp3/Headers;", "Lkq1;", "getSource", "()Lkq1;", "", "headerLimit", "J", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HeadersReader {
    private long headerLimit;
    private final kq1 source;

    public HeadersReader(kq1 kq1Var) {
        kq1Var.getClass();
        this.source = kq1Var;
        this.headerLimit = _HeadersCommonKt.HEADER_LIMIT;
    }

    public final kq1 getSource() {
        return this.source;
    }

    public final Headers readHeaders() {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String readLine = readLine();
            if (readLine.length() == 0) {
                return builder.build();
            }
            builder.addLenient$okhttp(readLine);
        }
    }

    public final String readLine() {
        String I = this.source.I(this.headerLimit);
        this.headerLimit -= I.length();
        return I;
    }
}
