package io.sentry.android.replay;

import java.util.Comparator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class g implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ g(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Long.valueOf(((k) obj).b).compareTo(Long.valueOf(((k) obj2).b));
            case 1:
                return Long.valueOf(((io.sentry.rrweb.b) obj).b).compareTo(Long.valueOf(((io.sentry.rrweb.b) obj2).b));
            default:
                return Long.valueOf(((io.sentry.rrweb.b) obj).b).compareTo(Long.valueOf(((io.sentry.rrweb.b) obj2).b));
        }
    }
}
