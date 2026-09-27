package defpackage;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class g35 {
    public final List a;
    public final String b;
    public final long c;
    public final boolean d;

    public g35(List list, long j, String str, boolean z) {
        list.getClass();
        this.a = list;
        this.b = str;
        this.c = j;
        this.d = z;
    }

    public final String toString() {
        return "ContentCardsUpdatedEvent{userId='" + this.b + "', timestampSeconds=" + this.c + ", isFromOfflineStorage=" + this.d + ", card count=" + this.a.size() + '}';
    }
}
