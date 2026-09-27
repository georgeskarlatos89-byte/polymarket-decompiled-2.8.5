package defpackage;

import java.nio.charset.MalformedInputException;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Luyb;", "Ljava/nio/charset/MalformedInputException;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class uyb extends MalformedInputException {
    public final String a;

    public uyb(String str) {
        super(0);
        this.a = str;
    }

    @Override // java.nio.charset.MalformedInputException, java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
