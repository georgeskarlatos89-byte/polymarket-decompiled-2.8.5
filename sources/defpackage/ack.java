package defpackage;

import kotlin.text.c;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ack extends dck {
    public final int e;
    public final int f;

    public ack(int i, int i2, int i3, int i4, int i5, int i6) {
        super(i3, i4, i5, i6);
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.dck
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ack)) {
            return false;
        }
        ack ackVar = (ack) obj;
        if (this.e == ackVar.e && this.f == ackVar.f && this.a == ackVar.a && this.b == ackVar.b && this.c == ackVar.c && this.d == ackVar.d) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dck
    public final int hashCode() {
        return Integer.hashCode(this.f) + Integer.hashCode(this.e) + super.hashCode();
    }

    public final String toString() {
        return c.d("ViewportHint.Access(\n            |    pageOffset=" + this.e + ",\n            |    indexInPage=" + this.f + ",\n            |    presentedItemsBefore=" + this.a + ",\n            |    presentedItemsAfter=" + this.b + ",\n            |    originalPageOffsetFirst=" + this.c + ",\n            |    originalPageOffsetLast=" + this.d + ",\n            |)");
    }
}
