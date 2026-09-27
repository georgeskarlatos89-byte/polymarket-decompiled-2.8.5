package okhttp3;

import defpackage.kq1;
import defpackage.meh;
import defpackage.rkn;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.e;
import okhttp3.Interceptor;
import okhttp3.internal.http.HttpHeaders;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0018B\u001b\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0014J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u0017R\u001b\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lokhttp3/CompressionInterceptor;", "Lokhttp3/Interceptor;", "algorithms", "", "Lokhttp3/CompressionInterceptor$DecompressionAlgorithm;", "<init>", "([Lokhttp3/CompressionInterceptor$DecompressionAlgorithm;)V", "getAlgorithms", "()[Lokhttp3/CompressionInterceptor$DecompressionAlgorithm;", "[Lokhttp3/CompressionInterceptor$DecompressionAlgorithm;", "acceptEncoding", "", "getAcceptEncoding$okhttp", "()Ljava/lang/String;", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "decompress", "response", "decompress$okhttp", "lookupDecompressor", "encoding", "lookupDecompressor$okhttp", "DecompressionAlgorithm", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public class CompressionInterceptor implements Interceptor {
    private final String acceptEncoding;
    private final DecompressionAlgorithm[] algorithms;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lokhttp3/CompressionInterceptor$DecompressionAlgorithm;", "", "Lkq1;", "compressedSource", "Lmeh;", "decompress", "(Lkq1;)Lmeh;", "", "getEncoding", "()Ljava/lang/String;", "encoding", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface DecompressionAlgorithm {
        meh decompress(kq1 compressedSource);

        String getEncoding();
    }

    public CompressionInterceptor(DecompressionAlgorithm... decompressionAlgorithmArr) {
        decompressionAlgorithmArr.getClass();
        this.algorithms = decompressionAlgorithmArr;
        ArrayList arrayList = new ArrayList(decompressionAlgorithmArr.length);
        for (DecompressionAlgorithm decompressionAlgorithm : decompressionAlgorithmArr) {
            arrayList.add(decompressionAlgorithm.getEncoding());
        }
        this.acceptEncoding = CollectionsKt.N(arrayList, ", ", null, null, null, 62);
    }

    public final Response decompress$okhttp(Response response) {
        DecompressionAlgorithm lookupDecompressor$okhttp;
        response.getClass();
        if (HttpHeaders.promisesBody(response)) {
            ResponseBody body = response.body();
            String header$default = Response.header$default(response, "Content-Encoding", null, 2, null);
            if (header$default != null && (lookupDecompressor$okhttp = lookupDecompressor$okhttp(header$default)) != null) {
                return response.newBuilder().removeHeader("Content-Encoding").removeHeader("Content-Length").body(ResponseBody.INSTANCE.create(rkn.b(lookupDecompressor$okhttp.decompress(body.get$this_asResponseBody())), body.get$contentType(), -1L)).build();
            }
        }
        return response;
    }

    /* renamed from: getAcceptEncoding$okhttp, reason: from getter */
    public final String getAcceptEncoding() {
        return this.acceptEncoding;
    }

    public final DecompressionAlgorithm[] getAlgorithms() {
        return this.algorithms;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        boolean z;
        chain.getClass();
        if (this.algorithms.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && chain.request().header("Accept-Encoding") == null) {
            return decompress$okhttp(chain.proceed(chain.request().newBuilder().header("Accept-Encoding", this.acceptEncoding).build()));
        }
        return chain.proceed(chain.request());
    }

    public final DecompressionAlgorithm lookupDecompressor$okhttp(String encoding) {
        encoding.getClass();
        for (DecompressionAlgorithm decompressionAlgorithm : this.algorithms) {
            if (e.o(decompressionAlgorithm.getEncoding(), encoding, true)) {
                return decompressionAlgorithm;
            }
        }
        return null;
    }
}
