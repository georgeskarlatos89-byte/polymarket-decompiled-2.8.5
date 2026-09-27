package kotlin;

import defpackage.woa;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\u00060\u0004j\u0002`\u0005R\u0017\u0010\n\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\r\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u0017\u0010\u0010\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\t¨\u0006\u0011"}, d2 = {"Lkotlin/Triple;", "A", "B", "C", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "a", "Ljava/lang/Object;", "getFirst", "()Ljava/lang/Object;", "first", "b", "getSecond", "second", "c", "getThird", "third", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Triple<A, B, C> implements Serializable {

    /* renamed from: a, reason: from kotlin metadata */
    public final Object first;

    /* renamed from: b, reason: from kotlin metadata */
    public final Object second;

    /* renamed from: c, reason: from kotlin metadata */
    public final Object third;

    public Triple(Object obj, Object obj2, Object obj3) {
        this.first = obj;
        this.second = obj2;
        this.third = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) obj;
        if (Intrinsics.areEqual(this.first, triple.first) && Intrinsics.areEqual(this.second, triple.second) && Intrinsics.areEqual(this.third, triple.third)) {
            return true;
        }
        return false;
    }

    public final A getFirst() {
        return (A) this.first;
    }

    public final B getSecond() {
        return (B) this.second;
    }

    public final C getThird() {
        return (C) this.third;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        Object obj = this.first;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = hashCode * 31;
        Object obj2 = this.second;
        if (obj2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = obj2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Object obj3 = this.third;
        if (obj3 != null) {
            i = obj3.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.first);
        sb.append(", ");
        sb.append(this.second);
        sb.append(", ");
        return woa.q(sb, this.third, ')');
    }
}
