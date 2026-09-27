package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class xug extends fog {
    public final /* synthetic */ AtomicReferenceArray g;

    public xug(long j, xug xugVar, int i) {
        super(j, xugVar, i);
        this.g = new AtomicReferenceArray(wug.f);
    }

    @Override // defpackage.fog
    public final int g() {
        return wug.f;
    }

    @Override // defpackage.fog
    public final void h(int i, CoroutineContext coroutineContext) {
        this.g.set(i, wug.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.d + ", hashCode=" + hashCode() + ']';
    }
}
