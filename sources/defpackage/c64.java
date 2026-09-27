package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lc64;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lskip/lib/SwiftProjecting;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public class c64 extends RuntimeException implements SwiftProjecting {
    public final SwiftProjecting a;

    public /* synthetic */ c64(SwiftProjecting swiftProjecting, String str, Throwable th, int i) {
        this(swiftProjecting, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : th);
    }

    @Override // skip.lib.SwiftProjecting
    public final Function0 Swift_projection(int i) {
        return getA().Swift_projection(i);
    }

    /* renamed from: a, reason: from getter */
    public SwiftProjecting getA() {
        return this.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c64(SwiftProjecting swiftProjecting, String str, Throwable th) {
        super(str == null ? swiftProjecting.toString() : str, th);
        swiftProjecting.getClass();
        this.a = swiftProjecting;
    }
}
