package kotlin;

import defpackage.r5g;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "exception", "", "createFailure", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResultKt {
    public static final void a(Object obj) {
        if (!(obj instanceof r5g)) {
        } else {
            throw ((r5g) obj).a;
        }
    }

    public static final Object createFailure(Throwable th) {
        th.getClass();
        return new r5g(th);
    }
}
